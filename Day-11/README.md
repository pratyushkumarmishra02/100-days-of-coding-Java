# 📊 Day 11 - Insertion Sort (Java)

A simple Java program that implements the **Insertion Sort** algorithm to sort an array in **ascending order**. The algorithm builds the sorted array one element at a time by inserting each element into its correct position.

This project is part of my **#100DaysOfCode** journey, helping me strengthen my understanding of sorting algorithms, arrays, loops, and algorithm optimization in Java.

---

# 🚀 Features

- Implements the **Insertion Sort Algorithm**.
- Sorts an integer array in ascending order.
- Displays both the original and sorted arrays.
- Simple and beginner-friendly implementation.
- Demonstrates one of the fundamental sorting algorithms used in computer science.

---

## 🛠️ Prerequisites

Before running this program, make sure you have:

- **Java Development Kit (JDK)** 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or a terminal

---

# 📂 Project Structure

```text
Day-11/
│── InsertionSort.java
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
cd 100-days-of-coding-Java/Day-11
```

### 3. Compile the Java file

```bash
javac InsertionSort.java
```

### 4. Run the program

```bash
java InsertionSort
```

---

# 📝 Code Explanation

The program starts from the second element of the array and treats the first element as already sorted. Each new element (called the **key**) is compared with the elements before it and inserted into its correct position by shifting larger elements one position to the right.

```java
for (int i = 1; i < n; i++) {
    int key = arr[i];
    int j = i - 1;

    while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
    }

    arr[j + 1] = key;
}
```

---

# 🔄 Algorithm

1. Assume the first element is already sorted.
2. Select the next element as the **key**.
3. Compare the key with the sorted portion of the array.
4. Shift all larger elements one position to the right.
5. Insert the key into its correct position.
6. Repeat until the entire array is sorted.
7. Display the sorted array.

---

# 📋 Example Output

### Input

```text
Original Array:
[12, 11, 13, 5, 6]
```

### Output

```text
Sorted Array:
[5, 6, 11, 12, 13]
```

---

# 📚 Concepts Used

- Java Basics
- Arrays
- Nested Loops
- Insertion Sort Algorithm
- Element Shifting
- Methods
- `Arrays.toString()`

---

# 🎯 Learning Outcomes

By completing this project, I learned:

- How the Insertion Sort algorithm works.
- How to insert an element into its correct position in a sorted sequence.
- The concept of shifting elements instead of swapping.
- The differences between Insertion Sort, Bubble Sort, and Selection Sort.
- How to implement efficient sorting logic for small or nearly sorted datasets.

---

## ⚠️ Time & Space Complexity

| Complexity | Value |
|------------|:-----:|
| Best Case | **O(n)** |
| Average Case | **O(n²)** |
| Worst Case | **O(n²)** |
| Space Complexity | **O(1)** |

---

## 📌 Note

- **Insertion Sort** performs efficiently for **small** or **nearly sorted** datasets.
- It is an **in-place** sorting algorithm, requiring only constant extra memory.
- It is also a **stable sorting algorithm**, meaning equal elements retain their original relative order after sorting.
- Although not suitable for large datasets, Insertion Sort is widely used as a building block in more advanced sorting algorithms.

---

## 📌 Author

**Pratyush Kumar Mishra**

Part of my **#100DaysOfCode** Java journey 🚀

---

⭐ If you found this project helpful, consider giving the repository a star!
