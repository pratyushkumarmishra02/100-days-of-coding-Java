# 🥈 Day 7 - Find Second Largest Element in an Array (Java)

A simple Java program that finds the **second largest element** in an array without sorting it. The program efficiently traverses the array only once while keeping track of the largest and second largest elements.

This project is part of my **#100DaysOfCode** journey, helping me strengthen my understanding of arrays, loops, conditional statements, and optimization techniques in Java.

---

# 🚀 Features

* **User Interactive:** Accepts array size and elements using the `Scanner` class.
* **Efficient Algorithm:** Finds the second largest element in a **single traversal**.
* **No Sorting Required:** Improves efficiency by avoiding sorting.
* **Beginner Friendly:** Demonstrates array traversal and comparison logic.

---

## 🛠️ Prerequisites

Before running this program, make sure you have:

* **Java Development Kit (JDK)** 8 or higher
* Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or a terminal

---

# 📂 Project Structure

```text
Day-7/
│── Find2ndLargestInArray.java
│── README.md
```

---

# 💻 How to Run

### 1. Clone the repository

```bash
git clone https://github.com/YOUR_USERNAME/100-days-of-coding-Java.git
```

### 2. Navigate to the project folder

```bash
cd 100-days-of-coding-Java/Day-7
```

### 3. Compile the Java file

```bash
javac Find2ndLargestInArray.java
```

### 4. Run the program

```bash
java Find2ndLargestInArray
```

---

# 📝 Code Explanation

The program maintains two variables:

* `first` → Stores the largest element.
* `second` → Stores the second largest element.

As each element is processed:

* If it is greater than the current largest element, update both `first` and `second`.
* Otherwise, if it is greater than the current second largest element and different from the largest element, update `second`.

```java
int first = Integer.MIN_VALUE;
int second = Integer.MIN_VALUE;

for (int num : arr) {
    if (num > first) {
        second = first;
        first = num;
    } else if (num > second && num != first) {
        second = num;
    }
}
```

---

# 🔄 Algorithm

1. Read the size of the array.
2. Input all array elements.
3. Initialize `first` and `second` with `Integer.MIN_VALUE`.
4. Traverse the array.
5. Update the largest and second largest elements accordingly.
6. Print the second largest element.

---

# 📋 Example Output

### Example 1

**Input**

```text
5
10 25 40 15 30
```

**Output**

```text
30
```

---

### Example 2

**Input**

```text
6
100 85 92 70 65 88
```

**Output**

```text
92
```

---

### Example 3

**Input**

```text
5
7 7 5 4 3
```

**Output**

```text
5
```

---

# 📚 Concepts Used

* Java Basics
* Arrays
* User Input (`Scanner`)
* Enhanced `for` Loop
* Conditional Statements
* Variables
* `Integer.MIN_VALUE`
* Array Traversal

---

# 🎯 Learning Outcomes

By completing this project, I learned:

* How to find the second largest element efficiently.
* How to traverse an array using a single loop.
* How to compare and update multiple variables during iteration.
* Why avoiding sorting can improve performance.
* How to solve interview-style array problems in Java.

---

## ⚠️ Time & Space Complexity

| Complexity       |   Value  |
| ---------------- | :------: |
| Time Complexity  | **O(n)** |
| Space Complexity | **O(1)** |

---

## 📌 Note

* This implementation assumes that the array contains **at least two distinct elements**.
* If all elements are the same, `second` will remain `Integer.MIN_VALUE`. You can enhance the program by displaying a message such as **"Second largest element does not exist."**

---

## 📌 Author

**Pratyush Kumar Mishra**

Part of my **#100DaysOfCode** Java journey 🚀

---

⭐ If you found this project helpful, consider giving the repository a star!
