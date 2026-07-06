# 📊 Day 10 - Selection Sort (Java)

A simple Java program that implements the **Selection Sort** algorithm to sort an array in **ascending order**. The program repeatedly selects the smallest element from the unsorted portion of the array and places it in its correct position.

This project is part of my **#100DaysOfCode** journey, helping me strengthen my understanding of sorting algorithms, arrays, loops, and algorithm optimization in Java.

---

# 🚀 Features

- Implements the **Selection Sort Algorithm**.
- Sorts an integer array in ascending order.
- Displays both the original and sorted arrays.
- Simple and beginner-friendly implementation.
- Demonstrates an important sorting technique frequently asked in coding interviews.

---

## 🛠️ Prerequisites

Before running this program, make sure you have:

- **Java Development Kit (JDK)** 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or a terminal

---

# 📂 Project Structure

```text
Day-10/
│── SelectionSort.java
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
cd 100-days-of-coding-Java/Day-10
```

### 3. Compile the Java file

```bash
javac SelectionSort.java
```

### 4. Run the program

```bash
java SelectionSort
```

---

# 📝 Code Explanation

The program repeatedly finds the **smallest element** in the unsorted portion of the array and swaps it with the first unsorted element.

```java
for (int i = 0; i < n - 1; i++) {

    int minIdx = i;

    for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[minIdx]) {
            minIdx = j;
        }
    }

    if (minIdx != i) {
        int temp = arr[minIdx];
        arr[minIdx] = arr[i];
        arr[i] = temp;
    }
}
```

---

# 🔄 Algorithm

1. Start from the first element of the array.
2. Assume the current element is the smallest.
3. Traverse the remaining unsorted part of the array.
4. Find the smallest element.
5. Swap it with the first unsorted element.
6. Repeat the process for the remaining elements.
7. Display the sorted array.

---

# 📋 Example Output

### Input

```text
Original Array:
[64, 25, 12, 22, 11]
```

### Output

```text
Sorted Array:
[11, 12, 22, 25, 64]
```

---

# 📚 Concepts Used

- Java Basics
- Arrays
- Nested Loops
- Selection Sort Algorithm
- Swapping Elements
- Methods
- `Arrays.toString()`

---

# 🎯 Learning Outcomes

By completing this project, I learned:

- How the Selection Sort algorithm works.
- How to find the minimum element in an unsorted array.
- How swapping places elements in their correct positions.
- The difference between Selection Sort and Bubble Sort.
- How to implement sorting algorithms efficiently in Java.

---

## ⚠️ Time & Space Complexity

| Complexity | Value |
|------------|:-----:|
| Best Case | **O(n²)** |
| Average Case | **O(n²)** |
| Worst Case | **O(n²)** |
| Space Complexity | **O(1)** |

---

## 📌 Note

- **Selection Sort** performs well for small datasets but is inefficient for large arrays due to its **O(n²)** time complexity.
- Unlike Bubble Sort, Selection Sort performs **fewer swaps**, making it useful when swap operations are expensive.
- Selection Sort is an **in-place sorting algorithm**, meaning it requires only constant extra memory.

---

## 📌 Author

**Pratyush Kumar Mishra**

Part of my **#100DaysOfCode** Java journey 🚀

---

⭐ If you found this project helpful, consider giving the repository a star!
