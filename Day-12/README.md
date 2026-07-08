# 🎯 Day 12 - Two Sum (Java)

A simple Java program that solves the **Two Sum** problem using a **HashMap** for efficient lookup. The program finds the indices of two numbers in an array whose sum equals a given target value.

This project is part of my **#100DaysOfCode** journey, helping me strengthen my understanding of arrays, hashing, maps, and algorithm optimization in Java.

---

# 🚀 Features

- Implements the **HashMap** approach for the Two Sum problem.
- Finds the indices of two numbers whose sum equals the target.
- Efficient solution with **O(n)** time complexity.
- Beginner-friendly implementation.
- Demonstrates one of the most frequently asked coding interview problems.

---

## 🛠️ Prerequisites

Before running this program, make sure you have:

- **Java Development Kit (JDK)** 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or a terminal

---

# 📂 Project Structure

```text
Day-12/
│── TwoSum.java
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
cd 100-days-of-coding-Java/Day-12
```

### 3. Compile the Java file

```bash
javac TwoSum.java
```

### 4. Run the program

```bash
java TwoSum
```

---

# 📝 Code Explanation

The program uses a **HashMap** to store each array element and its index. For every element, it calculates the complement (`target - current element`) and checks whether the complement already exists in the map.

If found, it returns the indices of the two numbers.

```java
Map<Integer, Integer> map = new HashMap<>();

for (int i = 0; i < nums.length; i++) {
    int complement = target - nums[i];

    if (map.containsKey(complement)) {
        return new int[] { map.get(complement), i };
    }

    map.put(nums[i], i);
}
```

---

# 🔄 Algorithm

1. Create an empty `HashMap`.
2. Traverse the array.
3. Calculate the complement of the current element.
4. Check whether the complement exists in the map.
5. If it exists, return the indices.
6. Otherwise, store the current element and its index in the map.
7. If no pair exists, return an empty array.

---

# 📋 Example Output

### Input

```text
Array: [2, 7, 11, 15]
Target: 9
```

### Output

```text
Indices: [0, 1]
```

---

### Another Example

**Input**

```text
Array: [3, 2, 4]
Target: 6
```

**Output**

```text
Indices: [1, 2]
```

---

### Another Example

**Input**

```text
Array: [3, 3]
Target: 6
```

**Output**

```text
Indices: [0, 1]
```

---

# 📚 Concepts Used

- Java Basics
- Arrays
- HashMap
- Maps
- Key-Value Pairs
- Methods
- Time Complexity Analysis
- `Arrays.toString()`

---

# 🎯 Learning Outcomes

By completing this project, I learned:

- How to use a **HashMap** for fast lookups.
- How to solve the Two Sum problem in linear time.
- The concept of complements in algorithm design.
- The advantages of hashing over brute-force approaches.
- How to write efficient interview-ready Java solutions.

---

## ⚠️ Time & Space Complexity

| Complexity | Value |
|------------|:-----:|
| Time Complexity | **O(n)** |
| Space Complexity | **O(n)** |

---

## 📌 Note

- This solution assumes that **exactly one valid pair** exists in the input array.
- Each element can be used **only once**.
- Using a **HashMap** reduces the time complexity from **O(n²)** (brute force) to **O(n)**.
- This is one of the most popular coding interview problems on platforms like **LeetCode**, **HackerRank**, and **CodeStudio**.

---

## 📌 Author

**Pratyush Kumar Mishra**

Part of my **#100DaysOfCode** Java journey 🚀

---

⭐ If you found this project helpful, consider giving the repository a star!
