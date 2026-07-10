# 🔍 Day 15 - Search in Rotated Sorted Array (Java)

A simple Java program that searches for a target element in a **rotated sorted array** using a modified **Binary Search** algorithm. The program efficiently identifies the sorted half of the array during each iteration and narrows down the search space accordingly.

This project is part of my **#100DaysOfCode** journey, helping me strengthen my understanding of binary search, arrays, and problem-solving techniques commonly asked in coding interviews.

---

# 🚀 Features

- Implements a modified **Binary Search** algorithm.
- Searches an element in a rotated sorted array.
- Efficient solution with **O(log n)** time complexity.
- Beginner-friendly implementation with detailed logic.
- Demonstrates a popular coding interview problem.

---

## 🛠️ Prerequisites

Before running this program, make sure you have:

- **Java Development Kit (JDK)** 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or a terminal

---

# 📂 Project Structure

```text
Day-15/
│── SearchRotatedArray.java
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
cd 100-days-of-coding-Java/Day-15
```

### 3. Compile the Java file

```bash
javac SearchRotatedArray.java
```

### 4. Run the program

```bash
java SearchRotatedArray
```

---

# 📝 Code Explanation

The program applies a modified **Binary Search** by determining which half of the array is sorted during each iteration.

- If the left half is sorted, check whether the target lies within it.
- Otherwise, the right half must be sorted, so check whether the target lies there.
- Repeat until the target is found or the search space becomes empty.

```java
while (low <= high) {
    int mid = low + (high - low) / 2;

    if (nums[mid] == target) {
        return mid;
    }

    if (nums[low] <= nums[mid]) {
        if (target >= nums[low] && target < nums[mid]) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    } else {
        if (target > nums[mid] && target <= nums[high]) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
}
```

---

# 🔄 Algorithm

1. Initialize `low` and `high` pointers.
2. Find the middle element.
3. If the middle element is the target, return its index.
4. Check whether the left half is sorted.
5. If the target lies within the sorted half, search there.
6. Otherwise, search the other half.
7. Repeat until the target is found or the search interval becomes empty.
8. Return `-1` if the target is not present.

---

# 📋 Example Output

### Example 1

**Input**

```text
Array: [4, 5, 6, 7, 8, 9, 0, 1, 2, 3]
Target: 6
```

**Output**

```text
Target 6 found at index: 2
```

---

### Example 2

**Input**

```text
Array: [4, 5, 6, 7, 0, 1, 2]
Target: 0
```

**Output**

```text
Target 0 found at index: 4
```

---

### Example 3

**Input**

```text
Array: [4, 5, 6, 7, 0, 1, 2]
Target: 3
```

**Output**

```text
Target 3 found at index: -1
```

---

# 📚 Concepts Used

- Java Basics
- Arrays
- Binary Search
- Modified Binary Search
- Rotated Sorted Arrays
- Loops
- Conditional Statements
- Divide and Conquer

---

# 🎯 Learning Outcomes

By completing this project, I learned:

- How Binary Search can be modified for rotated sorted arrays.
- How to identify the sorted half of a rotated array.
- How to reduce the search space efficiently.
- Why Binary Search provides logarithmic time complexity.
- How to solve one of the most frequently asked coding interview problems.

---

## ⚠️ Time & Space Complexity

| Complexity | Value |
|------------|:-----:|
| Time Complexity | **O(log n)** |
| Space Complexity | **O(1)** |

---

## 📌 Note

- This solution assumes that the array contains **distinct elements**.
- The algorithm works by identifying the sorted half of the array in every iteration.
- It is significantly faster than Linear Search (**O(n)**) for large datasets.
- This problem is frequently asked in coding interviews and appears on platforms like **LeetCode**, **HackerRank**, and **GeeksforGeeks**.

---

## 📌 Author

**Pratyush Kumar Mishra**

Part of my **#100DaysOfCode** Java journey 🚀

---

⭐ If you found this project helpful, consider giving the repository a star!
