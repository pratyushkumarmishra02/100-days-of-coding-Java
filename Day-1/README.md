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

## 📌 Author

**Pratyush Kumar Mishra**

Part of my **#100DaysOfCode** Java journey 🚀

---
⭐ If you found this project helpful, consider giving the repository a star!