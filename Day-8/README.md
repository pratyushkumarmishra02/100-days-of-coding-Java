# 🔍 Day 8 - Searching and Sorting Algorithms (Java)

This folder contains two fundamental Java programs that implement **Binary Search** and **Bubble Sort**, two of the most commonly asked algorithms in coding interviews and technical assessments.

These programs are part of my **#100DaysOfCode** journey, helping me strengthen my understanding of searching techniques, sorting algorithms, arrays, and algorithmic problem-solving in Java.

---

# 📂 Programs Included

| No. | Program       | Description                                                                  |
| :-: | ------------- | ---------------------------------------------------------------------------- |
|  1  | Binary Search | Searches for an element in a sorted array using the Binary Search algorithm. |
|  2  | Bubble Sort   | Sorts an array in ascending order using the Bubble Sort algorithm.           |

---

## 🚀 Features

* Accepts user input using the `Scanner` class.
* Demonstrates efficient searching and sorting techniques.
* Beginner-friendly implementations.
* Covers frequently asked interview algorithms.
* Easy to understand and modify.

---

## 🛠️ Prerequisites

Before running these programs, make sure you have:

* **Java Development Kit (JDK)** 8 or higher
* Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or a terminal

---

# 📂 Project Structure

```text
Day-8/
│── BinarySearch.java
│── BubbleSort.java
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
cd 100-days-of-coding-Java/Day-8
```

### 3. Compile the Java file

Example:

```bash
javac BinarySearch.java
```

or

```bash
javac BubbleSort.java
```

### 4. Run the program

```bash
java BinarySearch
```

or

```bash
java BubbleSort
```

---

# 📝 Program Overview

## 1️⃣ Binary Search

Binary Search is an efficient searching algorithm that works on **sorted arrays**. It repeatedly divides the search interval in half until the target element is found or the search interval becomes empty.

### Algorithm

1. Read the size of the array.
2. Input the sorted array elements.
3. Read the key to be searched.
4. Find the middle element.
5. Compare the key with the middle element.
6. If equal, the element is found.
7. Otherwise, search the left or right half accordingly.
8. Repeat until the element is found or the search space becomes empty.

### Example

**Input**

```text
5
10 20 30 40 50
30
```

**Output**

```text
Key found
```

### Concepts Used

* Arrays
* Binary Search Algorithm
* `while` Loop
* Conditional Statements
* User Input (`Scanner`)

### Time Complexity

| Case         |  Complexity  |
| ------------ | :----------: |
| Best Case    |   **O(1)**   |
| Average Case | **O(log n)** |
| Worst Case   | **O(log n)** |

### Space Complexity

**O(1)**

> **Note:** Binary Search works **only on sorted arrays**.

---

## 2️⃣ Bubble Sort

Bubble Sort is a simple sorting algorithm that repeatedly compares adjacent elements and swaps them if they are in the wrong order until the array becomes sorted.

### Algorithm

1. Read the size of the array.
2. Input all array elements.
3. Compare adjacent elements.
4. Swap them if they are in the wrong order.
5. Repeat the process until the array is sorted.
6. Display the sorted array.

### Example

**Input**

```text
5
64 34 25 12 22
```

**Output**

```text
12 22 25 34 64
```

### Concepts Used

* Arrays
* Nested Loops
* Bubble Sort Algorithm
* Swapping
* User Input (`Scanner`)

### Time Complexity

| Case         | Complexity |
| ------------ | :--------: |
| Best Case    |  **O(n)**  |
| Average Case |  **O(n²)** |
| Worst Case   |  **O(n²)** |

### Space Complexity

**O(1)**

---

# 📚 Concepts Covered

* Java Basics
* Arrays
* User Input (`Scanner`)
* Loops
* Conditional Statements
* Binary Search
* Bubble Sort
* Searching Algorithms
* Sorting Algorithms
* Time & Space Complexity

---

# 🎯 Learning Outcomes

By completing these programs, I learned:

* How Binary Search efficiently finds an element in a sorted array.
* Why Binary Search requires a sorted array.
* How Bubble Sort works through repeated swapping.
* The difference between searching and sorting algorithms.
* How to analyze the time and space complexity of algorithms.

---


## 📌 Author

**Pratyush Kumar Mishra**

Part of my **#100DaysOfCode** Java journey 🚀

---

⭐ If you found this project helpful, consider giving the repository a star!
