# 🔢 Check Even or Odd (Java)

A simple Java program that takes an integer input from the user and determines whether the number is **Even** or **Odd** using the modulo operator (`%`).

This project is part of my **#100DaysOfCode** journey, focusing on foundational programming concepts and basic Java syntax.

---

## 🚀 Features

- **User Interactive:** Uses the `Scanner` class to accept real-time user input from the console.
- **Simple Logic:** Uses the modulo operator (`%`) to determine whether a number is even or odd.
- **Beginner Friendly:** Great for learning Java basics and conditional statements.

---

## 🛠️ Prerequisites

Before running this program, make sure you have:

- **Java Development Kit (JDK)** 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or a terminal with Java installed

---

## 📂 Project Structure

```text
Day1/
│── CheckEvenOdd.java
│── README.md
```

---

## 💻 How to Run

### 1. Clone the repository

```bash
git clone https://github.com/YOUR_USERNAME/100-days-of-coding-Java.git
```

### 2. Navigate to the project folder

```bash
cd 100-days-of-coding-Java/Day1
```

### 3. Compile the Java file

```bash
javac CheckEvenOdd.java
```

### 4. Run the program

```bash
java CheckEvenOdd
```

---

## 📝 Code Explanation

The program checks whether a number is divisible by **2**.

- If the remainder is **0**, the number is **Even**.
- Otherwise, the number is **Odd**.

```java
if (n % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

---

## 📋 Example Output

| Input | Output |
|:-----:|:------:|
| 4 | Even |
| 7 | Odd |
| 0 | Even |
| 15 | Odd |

---

## 📚 Concepts Used

- Java Basics
- Variables
- User Input (`Scanner`)
- Conditional Statements (`if-else`)
- Modulo Operator (`%`)

---

## 🎯 Learning Outcome

By completing this project, I learned:

- How to take user input using the `Scanner` class.
- How to use the modulo operator to check number parity.
- How to implement conditional logic using `if-else` statements.
- Basic Java program structure.

---

````md
# 🔢 Check Prime Number (Java)

A simple Java program that takes an integer input from the user and determines whether the number is **Prime** or **Not Prime** using a loop and conditional statements.

This project is part of my **#100DaysOfCode** journey, focusing on core Java programming concepts, loops, and conditional logic.

---

## 🚀 Features

- **User Interactive:** Accepts user input using the `Scanner` class.
- **Prime Number Check:** Determines whether a number is prime by checking its factors.
- **Beginner Friendly:** Helps understand loops, conditions, and basic number theory.

---

## 🛠️ Prerequisites

Before running this program, make sure you have:

- **Java Development Kit (JDK)** 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or a terminal with Java installed

---

## 📂 Project Structure

```text
Day1/
│── CheckPrime.java
│── README.md
```

---

## 💻 How to Run

### 1. Clone the repository

```bash
git clone https://github.com/YOUR_USERNAME/100-days-of-coding-Java.git
```

### 2. Navigate to the project folder

```bash
cd 100-days-of-coding-Java/Day1
```

### 3. Compile the Java file

```bash
javac CheckPrime.java
```

### 4. Run the program

```bash
java CheckPrime
```

---

## 📝 Code Explanation

The program counts how many numbers divide the given number exactly.

- A **Prime Number** has exactly **two factors**: **1** and itself.
- If the total factor count is **2**, the number is **Prime**.
- Otherwise, it is **Not Prime**.

```java
int i = 2;
int count = 1;

while (i <= n) {
    if (n % i == 0) {
        count++;
    }
    i++;
}

if (count == 2) {
    System.out.println(n + " is a prime.");
} else {
    System.out.println(n + " is not a prime.");
}
```

---

## 📋 Example Output

| Input | Output |
|:-----:|:------:|
| 2 | 2 is a prime. |
| 7 | 7 is a prime. |
| 10 | 10 is not a prime. |
| 15 | 15 is not a prime. |

---

## 📚 Concepts Used

- Java Basics
- Variables
- User Input (`Scanner`)
- `while` Loop
- Conditional Statements (`if-else`)
- Modulo Operator (`%`)
- Prime Number Logic

---

## 🎯 Learning Outcome

By completing this project, I learned:

- How to accept user input using the `Scanner` class.
- How to use loops to solve mathematical problems.
- How to determine the factors of a number.
- How to implement conditional logic in Java.
- Basic algorithm design for checking prime numbers.

---

## ⚠️ Note

This program uses a simple factor-counting approach, making it ideal for beginners. For larger numbers, a more optimised solution checks divisibility only up to the square root of the number.

---

````md
# 🔢 Factorial of a Number (Java)

A simple Java program that calculates the **factorial of a number** using **Recursion**. The program accepts an integer from the user and recursively computes its factorial.

This project is part of my **#100DaysOfCode** journey, helping me understand recursion, functions, loops, and basic Java programming concepts.

---

## 🚀 Features

- **User Interactive:** Accepts user input using the `Scanner` class.
- **Recursive Solution:** Calculates the factorial using recursion.
- **Easy to Understand:** Demonstrates the concept of recursive function calls.
- **Beginner Friendly:** Ideal for learning Java methods and recursion.

---

## 🛠️ Prerequisites

Before running this program, make sure you have:

- **Java Development Kit (JDK)** 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or a terminal with Java installed

---

## 📂 Project Structure

```text
Day1/
│── FactorialOfNumber.java
│── README.md
```

---

## 💻 How to Run

### 1. Clone the repository

```bash
git clone https://github.com/YOUR_USERNAME/100-days-of-coding-Java.git
```

### 2. Navigate to the project folder

```bash
cd 100-days-of-coding-Java/Day1
```

### 3. Compile the Java file

```bash
javac FactorialOfNumber.java
```

### 4. Run the program

```bash
java FactorialOfNumber
```

---

## 📝 Code Explanation

The program uses **recursion** to calculate the factorial.

- If `n` is less than `1`, the function returns `1` (Base Case).
- Otherwise, it multiplies `n` by the factorial of `n - 1`.

```java
public static int factorial(int n) {
    if (n < 1) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}
```

---

## 📋 Example Output

| Input | Output |
|:-----:|:------:|
| 5 | Factorial of 5 is 120 |
| 6 | Factorial of 6 is 720 |
| 0 | Factorial of 0 is 1 |
| 1 | Factorial of 1 is 1 |

---

## 📚 Concepts Used

- Java Basics
- Variables
- User Input (`Scanner`)
- Methods
- Recursion
- Conditional Statements (`if-else`)
- Mathematical Computation

---

## 🎯 Learning Outcome

By completing this project, I learned:

- How recursion works in Java.
- The importance of the base case in recursive functions.
- How to define and call methods.
- How recursive function calls solve mathematical problems.
- Basic problem-solving using recursion.

---

## 🔄 Other Approaches

This project also includes two additional implementations for calculating factorial:

- ✅ Using a `while` loop (Iterative approach)
- ✅ Using a separate method (Function-based approach)
- ✅ Using **Recursion** (Current implementation)

These approaches help compare different ways of solving the same problem in Java.

---

## ⚠️ Note

- Factorials grow very quickly.
- Since this program uses the `int` data type, it works correctly only for relatively small numbers (up to **12!**). For larger values, consider using `long` or `BigInteger`.

---

````md id="fibonacci-readme"
# 🔢 Fibonacci Series (Java)

A simple Java program that generates the **Fibonacci Series** up to a specified number of terms entered by the user. The program uses a **method** and a **for loop** to print the Fibonacci sequence.

This project is part of my **#100DaysOfCode** journey, helping me strengthen my understanding of loops, methods, variables, and basic Java programming concepts.

---

## 🚀 Features

- **User Interactive:** Accepts the number of terms using the `Scanner` class.
- **Efficient Logic:** Generates the Fibonacci sequence using a `for` loop.
- **Method-Based Implementation:** Uses a separate method for better code organization.
- **Beginner Friendly:** Great for learning loops and sequence generation in Java.

---

## 🛠️ Prerequisites

Before running this program, make sure you have:

- **Java Development Kit (JDK)** 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or a terminal with Java installed

---

## 📂 Project Structure

```text
Day1/
│── FibonacciSeries.java
│── README.md
```

---

## 💻 How to Run

### 1. Clone the repository

```bash
git clone https://github.com/YOUR_USERNAME/100-days-of-coding-Java.git
```

### 2. Navigate to the project folder

```bash
cd 100-days-of-coding-Java/Day1
```

### 3. Compile the Java file

```bash
javac FibonacciSeries.java
```

### 4. Run the program

```bash
java FibonacciSeries
```

---

## 📝 Code Explanation

The program initializes the first two Fibonacci numbers (`0` and `1`) and calculates each subsequent number by adding the previous two numbers.

```java
public static void fibonacci(int n) {
    int a = 0, b = 1;
    int c = 0;

    System.out.print("Fibonacci Series: 0, 1, ");

    for (int i = 2; i < n; i++) {
        a = b;
        b = c;
        c = a + b;
        System.out.print(c + " ");
    }
}
```

---

## 📋 Example Output

| Input | Output |
|:-----:|:------:|
| 5 | 0, 1, 1, 2, 3 |
| 8 | 0, 1, 1, 2, 3, 5, 8, 13 |
| 10 | 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 |

---

## 📚 Concepts Used

- Java Basics
- Variables
- User Input (`Scanner`)
- Methods
- `for` Loop
- Sequence Generation
- Mathematical Logic

---

## 🎯 Learning Outcome

By completing this project, I learned:

- How to generate the Fibonacci sequence.
- How to use loops for repetitive calculations.
- How to organize code using methods.
- How variables are updated during each iteration.
- Basic algorithm design in Java.

---

## ⚠️ Note

- This program prints the Fibonacci sequence based on the **number of terms** entered by the user.
- The Fibonacci series starts with **0** and **1**, and every subsequent number is the sum of the previous two numbers.

---

````md id="reverse-number-readme"
# 🔢 Reverse Number (Java)

A simple Java program that takes an integer input from the user and reverses its digits using a **while loop** and arithmetic operations.

This project is part of my **#100DaysOfCode** journey, helping me strengthen my understanding of loops, methods, and number manipulation in Java.

---

## 🚀 Features

- **User Interactive:** Accepts user input using the `Scanner` class.
- **Efficient Logic:** Reverses a number using arithmetic operators without converting it to a string.
- **Method-Based Implementation:** Uses a separate method to improve code organization.
- **Beginner Friendly:** Demonstrates number manipulation using loops.

---

## 🛠️ Prerequisites

Before running this program, make sure you have:

- **Java Development Kit (JDK)** 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or a terminal with Java installed

---

## 📂 Project Structure

```text
Day1/
│── ReverseNumber.java
│── README.md
```

---

## 💻 How to Run

### 1. Clone the repository

```bash
git clone https://github.com/YOUR_USERNAME/100-days-of-coding-Java.git
```

### 2. Navigate to the project folder

```bash
cd 100-days-of-coding-Java/Day1
```

### 3. Compile the Java file

```bash
javac ReverseNumber.java
```

### 4. Run the program

```bash
java ReverseNumber
```

---

## 📝 Code Explanation

The program repeatedly extracts the last digit of the number using the modulo operator (`%`) and builds the reversed number.

```java
public static void reverseNumber(int n) {
    int rev = 0;

    while (n != 0) {
        rev = rev * 10 + n % 10;
        n /= 10;
    }

    System.out.println("The reverse number is " + rev);
}
```

### Algorithm

1. Read an integer from the user.
2. Initialize `rev` to `0`.
3. Extract the last digit using `n % 10`.
4. Append the digit to `rev`.
5. Remove the last digit using `n /= 10`.
6. Repeat until the number becomes `0`.
7. Print the reversed number.

---

## 📋 Example Output

| Input | Output |
|:-----:|:------:|
| 12345 | The reverse number is 54321 |
| 9876 | The reverse number is 6789 |
| 1000 | The reverse number is 1 |
| 505 | The reverse number is 505 |

---

## 📚 Concepts Used

- Java Basics
- Variables
- User Input (`Scanner`)
- Methods
- `while` Loop
- Arithmetic Operators (`%`, `/`)
- Number Manipulation

---

## 🎯 Learning Outcome

By completing this project, I learned:

- How to reverse a number using arithmetic operations.
- How to use the modulo (`%`) operator to extract digits.
- How integer division (`/`) removes the last digit.
- How to organize code using methods.
- How loops can solve digit-based problems efficiently.

---

## ⚠️ Note

- This program reverses the digits using arithmetic operations instead of converting the number into a string.
- If the input number ends with one or more zeros (e.g., `1200`), the reversed output will not contain leading zeros (`21`), since integers do not store leading zeros.

---

## 📌 Author

**Pratyush Kumar Mishra**

Part of my **#100DaysOfCode** Java journey 🚀

---

⭐ If you found this project helpful, consider giving the repository a star!
````
