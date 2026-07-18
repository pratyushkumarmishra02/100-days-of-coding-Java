# 🔢 Day 20 - Find Greatest Common Divisor of an Array (Java)

A simple Java program that finds the **Greatest Common Divisor (GCD)** of an array by first identifying the **smallest** and **largest** elements, then applying the **Euclidean Algorithm** to compute their GCD.

This project is part of my **#100DaysOfCode** journey, helping me strengthen my understanding of arrays, number theory, and efficient algorithm design in Java.

---

# 🚀 Features

- Finds the smallest element in an array.
- Finds the largest element in an array.
- Computes the GCD using the **Euclidean Algorithm**.
- Efficient implementation with constant extra space.
- Beginner-friendly and interview-focused solution.

---

## 🛠️ Prerequisites

Before running this program, make sure you have:

- **Java Development Kit (JDK)** 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or a terminal

---

# 📂 Project Structure

```text
Day-20/
│── FindGcdOfArray.java
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
cd 100-days-of-coding-Java/Day-20
```

### 3. Compile the Java file

```bash
javac FindGcdOfArray.java
```

### 4. Run the program

```bash
java FindGcdOfArray
```

---

# 📝 Code Explanation

The program first traverses the array to determine its **smallest** and **largest** elements.

```java
int s = nums[0], l = nums[0];

for (int i = 0; i < nums.length; i++) {

    if (nums[i] < s) {
        s = nums[i];
    }

    if (nums[i] > l) {
        l = nums[i];
    }
}
```

It then computes their GCD using the **Euclidean Algorithm**.

```java
public int GCD(int s, int l) {

    while (l != 0) {
        int remainder = s % l;
        s = l;
        l = remainder;
    }

    return s;
}
```

---

# 🔄 Algorithm

1. Traverse the array.
2. Find the smallest element.
3. Find the largest element.
4. Apply the Euclidean Algorithm to compute their GCD.
5. Return the GCD.

---

# 📋 Example Output

### Example 1

**Input**

```text
Array: [2, 5, 6, 9, 10]
```

**Output**

```text
2
```

---

### Example 2

**Input**

```text
Array: [7, 5, 6, 8, 3]
```

**Output**

```text
1
```

---

### Example 3

**Input**

```text
Array: [3, 3]
```

**Output**

```text
3
```

---

# 📚 Concepts Used

- Java Basics
- Arrays
- Loops
- Methods
- Conditional Statements
- Greatest Common Divisor (GCD)
- Euclidean Algorithm

---

# 🎯 Learning Outcomes

By completing this project, I learned:

- How to traverse an array efficiently.
- How to find the minimum and maximum values in an array.
- How the Euclidean Algorithm computes the GCD efficiently.
- How mathematical algorithms can optimize problem-solving.
- How to write clean and modular Java code.

---

## ⚠️ Time & Space Complexity

| Complexity | Value |
|------------|:-----:|
| Time Complexity | **O(n + log(max))** |
| Space Complexity | **O(1)** |

> **n** = Number of elements in the array.

---

## 📌 Note

- The problem requires finding the **GCD of the smallest and largest elements** in the array, **not** the GCD of all array elements.
- The **Euclidean Algorithm** computes the GCD much faster than the brute-force approach.
- This problem is commonly asked in coding interviews and appears on platforms like **LeetCode** and **GeeksforGeeks**.

---

## 📌 Author

**Pratyush Kumar Mishra**

Part of my **#100DaysOfCode** Java journey 🚀

---

⭐ If you found this project helpful, consider giving the repository a star!
