# 💧 Day 9 - Container With Most Water (Java)

A simple Java program that solves the **Container With Most Water** problem using the **Two Pointer** approach. The program finds the maximum amount of water that can be stored between two vertical lines represented by an array of heights.

This project is part of my **#100DaysOfCode** journey, helping me strengthen my understanding of arrays, two-pointer techniques, greedy algorithms, and optimization in Java.

---

# 🚀 Features

- Implements the **Two Pointer Algorithm** for optimal performance.
- Calculates the maximum water that can be contained.
- Efficient solution with **O(n)** time complexity.
- Beginner-friendly implementation with clean logic.
- Demonstrates an important interview coding problem.

---

## 🛠️ Prerequisites

Before running this program, make sure you have:

- **Java Development Kit (JDK)** 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or a terminal

---

# 📂 Project Structure

```text
Day-9/
│── ContainerWithMaxWater.java
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
cd 100-days-of-coding-Java/Day-9
```

### 3. Compile the Java file

```bash
javac ContainerWithMaxWater.java
```

### 4. Run the program

```bash
java ContainerWithMaxWater
```

---

# 📝 Code Explanation

The program uses two pointers:

- **Left Pointer (`l`)** starts from the beginning of the array.
- **Right Pointer (`r`)** starts from the end of the array.

At every iteration:

1. Calculate the height using the smaller of the two lines.
2. Calculate the width between the pointers.
3. Compute the container area.
4. Update the maximum area if needed.
5. Move the pointer with the smaller height inward.

```java
int l = 0;
int r = arr.length - 1;
int max = 0;

while (l < r) {
    int h = Math.min(arr[l], arr[r]);
    int w = r - l;
    int area = h * w;

    max = Math.max(max, area);

    if (arr[l] < arr[r]) {
        l++;
    } else {
        r--;
    }
}
```

---

# 🔄 Algorithm

1. Initialize two pointers:
   - Left pointer at index `0`
   - Right pointer at the last index
2. Calculate the container area.
3. Update the maximum area found so far.
4. Move the pointer pointing to the shorter line.
5. Repeat until both pointers meet.
6. Print the maximum water that can be contained.

---

# 📋 Example Output

### Input

```text
Height Array:
[1, 8, 6, 2, 5, 4, 8, 3, 7]
```

### Output

```text
Max area for water is: 49
```

---

# 📚 Concepts Used

- Java Basics
- Arrays
- Two Pointer Technique
- Greedy Algorithm
- `Math.min()`
- `Math.max()`
- Looping (`while`)
- Optimization Techniques

---

# 🎯 Learning Outcomes

By completing this project, I learned:

- How the **Two Pointer** technique reduces time complexity.
- How to solve optimization problems efficiently.
- Why moving the shorter pointer leads to the optimal solution.
- How to calculate area using height and width.
- How to solve a popular coding interview problem.

---

## ⚠️ Time & Space Complexity

| Complexity | Value |
|------------|:-----:|
| Time Complexity | **O(n)** |
| Space Complexity | **O(1)** |

---

## 📌 Note

- This is the **optimal solution** to the Container With Most Water problem.
- Unlike the brute-force approach (**O(n²)**), the two-pointer technique solves the problem in **linear time O(n)**.
- This problem is commonly asked in coding interviews and on platforms like **LeetCode**.

---

## 📌 Author

**Pratyush Kumar Mishra**

Part of my **#100DaysOfCode** Java journey 🚀

---

⭐ If you found this project helpful, consider giving the repository a star!
