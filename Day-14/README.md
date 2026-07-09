# 🎯 Day 14 - Jump Game (Java)

A simple Java program that solves the **Jump Game** problem using a **Greedy Algorithm**. The program determines whether it is possible to reach the last index of an array, where each element represents the maximum jump length from that position.

This project is part of my **#100DaysOfCode** journey, helping me strengthen my understanding of greedy algorithms, arrays, and optimization techniques in Java.

---

# 🚀 Features

- Implements an efficient **Greedy Algorithm**.
- Determines whether the last index of an array is reachable.
- Optimized solution with **O(n)** time complexity.
- Beginner-friendly implementation with clear logic.
- Demonstrates a popular coding interview problem.

---

## 🛠️ Prerequisites

Before running this program, make sure you have:

- **Java Development Kit (JDK)** 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or a terminal

---

# 📂 Project Structure

```text
Day-14/
│── JumpGame.java
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
cd 100-days-of-coding-Java/Day-14
```

### 3. Compile the Java file

```bash
javac JumpGame.java
```

### 4. Run the program

```bash
java JumpGame
```

---

# 📝 Code Explanation

The program keeps track of the **furthest index** that can be reached while traversing the array.

- If the current index is beyond the maximum reachable index, the destination cannot be reached.
- Otherwise, update the maximum reachable index.
- If the maximum reachable index reaches or exceeds the last index, return `true`.

```java
int maxReach = 0;

for (int i = 0; i < nums.length; i++) {

    if (i > maxReach) {
        return false;
    }

    maxReach = Math.max(maxReach, i + nums[i]);

    if (maxReach >= nums.length - 1) {
        return true;
    }
}

return true;
```

---

# 🔄 Algorithm

1. Initialize `maxReach` to `0`.
2. Traverse the array from left to right.
3. If the current index is greater than `maxReach`, return `false`.
4. Update `maxReach` using the current jump length.
5. If `maxReach` reaches or passes the last index, return `true`.
6. If the loop completes successfully, return `true`.

---

# 📋 Example Output

### Example 1

**Input**

```text
Array: [2, 4, 0, 0, 0]
```

**Output**

```text
true
```

---

### Example 2

**Input**

```text
Array: [3, 2, 1, 0, 4]
```

**Output**

```text
false
```

---

### Example 3

**Input**

```text
Array: [2, 3, 1, 1, 4]
```

**Output**

```text
true
```

---

# 📚 Concepts Used

- Java Basics
- Arrays
- Greedy Algorithm
- Loops
- Conditional Statements
- `Math.max()`
- Algorithm Optimization

---

# 🎯 Learning Outcomes

By completing this project, I learned:

- How the **Greedy Algorithm** efficiently solves the Jump Game problem.
- How to keep track of the maximum reachable index.
- Why greedy solutions can outperform brute-force approaches.
- How to optimize array traversal to linear time.
- How to solve a popular interview problem in Java.

---

## ⚠️ Time & Space Complexity

| Complexity | Value |
|------------|:-----:|
| Time Complexity | **O(n)** |
| Space Complexity | **O(1)** |

---

## 📌 Note

- This implementation uses the **forward greedy approach**, which scans the array from left to right while maintaining the maximum reachable index.
- Another popular solution uses a **backward greedy approach**, where the goal index is updated while traversing from right to left. Both approaches have **O(n)** time complexity and **O(1)** space complexity.
- This problem is frequently asked in coding interviews and appears on platforms like **LeetCode**, **HackerRank**, and **CodeStudio**.

---

## 📌 Author

**Pratyush Kumar Mishra**

Part of my **#100DaysOfCode** Java journey 🚀

---

⭐ If you found this project helpful, consider giving the repository a star!
