# 🔄 Day 16 - Remove Duplicates from Sorted Array (Java)

A simple Java program that removes duplicate elements from a **sorted array** using the **Two Pointer** technique. The program modifies the original array in-place and returns the number of unique elements.

This project is part of my **#100DaysOfCode** journey, helping me strengthen my understanding of arrays, two-pointer algorithms, and in-place array manipulation in Java.

---

# 🚀 Features

- Implements the **Two Pointer** technique.
- Removes duplicate elements from a sorted array.
- Performs the operation **in-place** without using extra arrays.
- Returns the count of unique elements.
- Beginner-friendly implementation with clear logic.
- Demonstrates a frequently asked coding interview problem.

---

## 🛠️ Prerequisites

Before running this program, make sure you have:

- **Java Development Kit (JDK)** 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or a terminal

---

# 📂 Project Structure

```text
Day-16/
│── RemoveDuplicates.java
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
cd 100-days-of-coding-Java/Day-16
```

### 3. Compile the Java file

```bash
javac RemoveDuplicates.java
```

### 4. Run the program

```bash
java RemoveDuplicates
```

---

# 📝 Code Explanation

The program uses two pointers:

- **`i`** keeps track of the last unique element.
- **`j`** traverses the array to find new unique elements.

Whenever a new unique value is found, it is copied to the next available position.

```java
int i = 0;

for (int j = 1; j < nums.length; j++) {

    if (nums[j] != nums[i]) {
        i++;
        nums[i] = nums[j];
    }
}

return i + 1;
```

This ensures that all unique elements are stored at the beginning of the array.

---

# 🔄 Algorithm

1. Check if the array is empty.
2. Initialize pointer `i` at the first element.
3. Traverse the array using pointer `j`.
4. Compare the current element with the last unique element.
5. If they are different:
   - Increment `i`.
   - Copy the new unique element to index `i`.
6. Continue until the end of the array.
7. Return `i + 1` as the number of unique elements.

---

# 📋 Example Output

### Input

```text
Original Array:
[1, 1, 2, 2, 3]
```

### Output

```text
Number of unique elements: 3

The unique array elements are:
[1, 2, 3]
```

---

### Another Example

**Input**

```text
Original Array:
[0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
```

**Output**

```text
Number of unique elements: 5

The unique array elements are:
[0, 1, 2, 3, 4]
```

---

# 📚 Concepts Used

- Java Basics
- Arrays
- Two Pointer Technique
- In-place Array Manipulation
- Loops
- Conditional Statements
- Methods

---

# 🎯 Learning Outcomes

By completing this project, I learned:

- How the **Two Pointer** technique simplifies array problems.
- How to remove duplicates without using extra memory.
- How to modify an array in-place efficiently.
- Why sorted arrays make duplicate removal easier.
- How to solve one of the most common coding interview questions.

---

## ⚠️ Time & Space Complexity

| Complexity | Value |
|------------|:-----:|
| Time Complexity | **O(n)** |
| Space Complexity | **O(1)** |

---

## 📌 Note

- This solution works **only for sorted arrays**.
- The duplicate elements beyond the returned unique count are ignored.
- The algorithm performs the operation **in-place**, making it memory efficient.
- This is one of the most frequently asked interview problems on platforms like **LeetCode**, **GeeksforGeeks**, and **HackerRank**.

---

## 📌 Author

**Pratyush Kumar Mishra**

Part of my **#100DaysOfCode** Java journey 🚀

---

⭐ If you found this project helpful, consider giving the repository a star!
