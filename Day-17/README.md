# 🪟 Day 17 - Max Consecutive Ones III (Java)

A simple Java program that solves the **Max Consecutive Ones III** problem using the **Sliding Window** technique. The program finds the maximum number of consecutive `1`s in a binary array after flipping at most **`k`** zeros.

This project is part of my **#100DaysOfCode** journey, helping me strengthen my understanding of sliding window algorithms, arrays, and optimization techniques in Java.

---

# 🚀 Features

- Implements the **Sliding Window** algorithm.
- Finds the longest sequence of consecutive `1`s.
- Allows flipping at most **`k`** zeros.
- Efficient solution with **O(n)** time complexity.
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
Day-17/
│── MaxConsecutiveOnes.java
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
cd 100-days-of-coding-Java/Day-17
```

### 3. Compile the Java file

```bash
javac MaxConsecutiveOnes.java
```

### 4. Run the program

```bash
java MaxConsecutiveOnes
```

---

# 📝 Code Explanation

The program uses the **Sliding Window** approach.

- The **right pointer** expands the window.
- The **left pointer** shrinks the window whenever the number of zeros exceeds `k`.
- At every step, the program records the maximum valid window size.

```java
int left = 0;
int maxLen = 0;
int zeroCount = 0;

for (int right = 0; right < nums.length; right++) {

    if (nums[right] == 0) {
        zeroCount++;
    }

    while (zeroCount > k) {
        if (nums[left] == 0) {
            zeroCount--;
        }
        left++;
    }

    maxLen = Math.max(maxLen, right - left + 1);
}
```

---

# 🔄 Algorithm

1. Initialize `left`, `zeroCount`, and `maxLen`.
2. Expand the window using the `right` pointer.
3. Count the number of zeros in the current window.
4. If the zero count exceeds `k`, shrink the window from the left.
5. Update the maximum window size.
6. Continue until the entire array is traversed.
7. Return the maximum consecutive ones.

---

# 📋 Example Output

### Example 1

**Input**

```text
Array: [1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0]
k = 2
```

**Output**

```text
6
```

---

### Example 2

**Input**

```text
Array: [0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1]
k = 3
```

**Output**

```text
10
```

---

# 📚 Concepts Used

- Java Basics
- Arrays
- Sliding Window Technique
- Two Pointer Technique
- Loops
- Conditional Statements
- `Math.max()`
- Algorithm Optimization

---

# 🎯 Learning Outcomes

By completing this project, I learned:

- How the **Sliding Window** technique works.
- How to dynamically resize a window based on constraints.
- How to solve array optimization problems efficiently.
- Why Sliding Window reduces time complexity from **O(n²)** to **O(n)**.
- How to solve one of the most frequently asked interview problems.

---

## ⚠️ Time & Space Complexity

| Complexity | Value |
|------------|:-----:|
| Time Complexity | **O(n)** |
| Space Complexity | **O(1)** |

---

## 📌 Note

- The algorithm allows flipping **at most `k` zeros** into `1`s.
- It maintains a valid window by ensuring the number of zeros never exceeds `k`.
- This approach is significantly more efficient than checking every possible subarray.
- This problem is commonly asked in coding interviews and appears on platforms like **LeetCode**, **GeeksforGeeks**, and **HackerRank**.

---

## 📌 Author

**Pratyush Kumar Mishra**

Part of my **#100DaysOfCode** Java journey 🚀

---

⭐ If you found this project helpful, consider giving the repository a star!
