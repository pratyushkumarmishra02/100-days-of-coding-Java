# 🧮 Day 19 - GCD of Odd and Even Sums (Java)

A simple Java program that calculates the **Greatest Common Divisor (GCD)** of the sum of the first **n odd numbers** and the sum of the first **n even numbers**. The program first computes both sums and then finds their GCD using a straightforward iterative approach.

This project is part of my **#100DaysOfCode** journey, helping me strengthen my understanding of loops, mathematical computations, and the Greatest Common Divisor (GCD) algorithm in Java.

---

# 🚀 Features

- Calculates the sum of the first **n odd numbers**.
- Calculates the sum of the first **n even numbers**.
- Finds the **Greatest Common Divisor (GCD)** of the two sums.
- Beginner-friendly implementation.
- Demonstrates basic number theory concepts.

---

## 🛠️ Prerequisites

Before running this program, make sure you have:

- **Java Development Kit (JDK)** 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or a terminal

---

# 📂 Project Structure

```text
Day-19/
│── GCDOfOddEvenSums.java
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
cd 100-days-of-coding-Java/Day-19
```

### 3. Compile the Java file

```bash
javac GCDOfOddEvenSums.java
```

### 4. Run the program

```bash
java GCDOfOddEvenSums
```

---

# 📝 Code Explanation

The program performs two main tasks:

1. Calculates the sum of odd and even numbers from **1 to 2 × n**.
2. Finds the **Greatest Common Divisor (GCD)** of these two sums.

```java
int sumOdd = 0;
int sumEven = 0;

for (int i = 1; i <= 2 * n; i++) {

    if (i % 2 == 0) {
        sumEven += i;
    } else {
        sumOdd += i;
    }
}

int gcd = GCD(sumOdd, sumEven);
```

The GCD is calculated by checking divisibility from the smaller number downward.

```java
public int GCD(int o, int e) {

    int minNum = Math.min(o, e);

    for (int i = minNum; i >= 1; i--) {

        if (o % i == 0 && e % i == 0) {
            return i;
        }
    }

    return 1;
}
```

---

# 🔄 Algorithm

1. Read the value of `n`.
2. Calculate the sum of the first `n` odd numbers.
3. Calculate the sum of the first `n` even numbers.
4. Find the smaller of the two sums.
5. Traverse from the smaller number down to `1`.
6. Return the first number that divides both sums.
7. Print the GCD.

---

# 📋 Example Output

### Example 1

**Input**

```text
n = 3
```

**Calculation**

```text
Odd Numbers  : 1 + 3 + 5 = 9
Even Numbers : 2 + 4 + 6 = 12
GCD(9,12) = 3
```

**Output**

```text
3
```

---

### Example 2

**Input**

```text
n = 5
```

**Calculation**

```text
Odd Numbers  : 1 + 3 + 5 + 7 + 9 = 25
Even Numbers : 2 + 4 + 6 + 8 + 10 = 30
GCD(25,30) = 5
```

**Output**

```text
5
```

---

# 📚 Concepts Used

- Java Basics
- Loops
- Conditional Statements
- Methods
- Arithmetic Operations
- Number Theory
- Greatest Common Divisor (GCD)

---

# 🎯 Learning Outcomes

By completing this project, I learned:

- How to calculate sums using loops.
- How to separate odd and even numbers efficiently.
- How to compute the Greatest Common Divisor (GCD).
- How mathematical concepts can be implemented in Java.
- How to organize code into reusable methods.

---

## ⚠️ Time & Space Complexity

### Current Implementation

| Complexity | Value |
|------------|:-----:|
| Time Complexity | **O(n + min(sumOdd, sumEven))** |
| Space Complexity | **O(1)** |

---

## 📌 Note

- This implementation calculates the GCD using a **brute-force approach** by checking every possible divisor from the minimum value down to `1`.
- A more efficient approach is the **Euclidean Algorithm**, which computes the GCD in **O(log n)** time.
- This program is useful for understanding loops, arithmetic operations, and basic number theory before learning optimized GCD algorithms.

---

## 📌 Author

**Pratyush Kumar Mishra**

Part of my **#100DaysOfCode** Java journey 🚀

---

⭐ If you found this project helpful, consider giving the repository a star!
