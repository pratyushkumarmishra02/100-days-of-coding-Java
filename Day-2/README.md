# 🔢 Day 2 - Check Palindrome Number (Java)

A simple Java program that checks whether a given integer is a **Palindrome** or **Not a Palindrome** by reversing the number and comparing it with the original value.

This project is part of my **#100DaysOfCode** journey, helping me strengthen my understanding of loops, methods, conditional statements, and number manipulation in Java.

---

## 🚀 Features

- **User Interactive:** Accepts user input using the `Scanner` class.
- **Palindrome Check:** Reverses the number and compares it with the original.
- **Method-Based Implementation:** Uses a separate method for better code organization.
- **Beginner Friendly:** Demonstrates the use of loops and arithmetic operations.

---

## 🛠️ Prerequisites

Before running this program, make sure you have:

- **Java Development Kit (JDK)** 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or a terminal with Java installed

---

## 📂 Project Structure

```text
Day2/
│── CheckPalindrome.java
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
cd 100-days-of-coding-Java/Day2
```

### 3. Compile the Java file

```bash
javac CheckPalindrome.java
```

### 4. Run the program

```bash
java CheckPalindrome
```

---

## 📝 Code Explanation

The program stores the original number, reverses its digits using a `while` loop, and compares the reversed number with the original number.

```java
public static void checkPalindrome(int n) {
    int rev = 0;
    int temp = n;

    while (temp != 0) {
        rev = rev * 10 + temp % 10;
        temp /= 10;
    }

    System.out.println(n == rev ? "Palindrome" : "Not a Palindrome");
}
```

### Algorithm

1. Read an integer from the user.
2. Store the original number in a temporary variable.
3. Reverse the number digit by digit.
4. Compare the reversed number with the original number.
5. Print **"Palindrome"** if both are equal; otherwise print **"Not a Palindrome"**.

---

## 📋 Example Output

| Input | Output |
|:-----:|:------:|
| 121 | Palindrome |
| 1221 | Palindrome |
| 123 | Not a Palindrome |
| 1001 | Palindrome |

---

## 📚 Concepts Used

- Java Basics
- Variables
- User Input (`Scanner`)
- Methods
- `while` Loop
- Conditional (Ternary) Operator (`?:`)
- Arithmetic Operators (`%`, `/`)
- Number Manipulation

---

## 🎯 Learning Outcome

By completing this project, I learned:

- How to reverse a number using arithmetic operations.
- How to compare values to determine if a number is a palindrome.
- How to use the modulo (`%`) and division (`/`) operators.
- How to organize code using methods.
- How loops can solve digit-based problems efficiently.

---

## ⚠️ Note

- This program works with **integer values** only.
- A palindrome number reads the same forwards and backwards (e.g., `121`, `1331`, `1001`).

---

## 📌 Author

**Pratyush Kumar Mishra**

Part of my **#100DaysOfCode** Java journey 🚀

---

⭐ If you found this project helpful, consider giving the repository a star!
=======
\- How loops can solve digit-based problems efficiently.



\---



\## ⚠️ Note



\- This program works with \*\*integer values\*\* only.

\- A palindrome number reads the same forwards and backwards (e.g., `121`, `1331`, `1001`).



\---



# 🔢 Day 2 - Armstrong Number (Java)

A simple Java program that checks whether a given integer is an **Armstrong Number** or **Not an Armstrong Number** by calculating the sum of the cubes of its digits and comparing it with the original number.

This project is part of my **#100DaysOfCode** journey, helping me strengthen my understanding of loops, methods, arithmetic operations, and number manipulation in Java.

---

## 🚀 Features

- **User Interactive:** Accepts user input using the `Scanner` class.
- **Armstrong Number Check:** Calculates the sum of the cubes of each digit and compares it with the original number.
- **Method-Based Implementation:** Uses a separate method for better code organization.
- **Beginner Friendly:** Demonstrates digit extraction and mathematical computations using loops.

---

## 🛠️ Prerequisites

Before running this program, make sure you have:

- **Java Development Kit (JDK)** 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or a terminal with Java installed

---

## 📂 Project Structure

```text
Day-2/
│── ArmstrongNumber.java
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
cd 100-days-of-coding-Java/Day-2
```

### 3. Compile the Java file

```bash
javac ArmstrongNumber.java
```

### 4. Run the program

```bash
java ArmstrongNumber
```

---

## 📝 Code Explanation

The program extracts each digit of the number, calculates its cube, and adds it to a running sum. Finally, it compares the sum with the original number.

```java
public static void armstrongNumber(int n) {
    int temp = n, sum = 0;

    while (temp != 0) {
        int num = temp % 10;
        sum += num * num * num;
        temp /= 10;
    }

    System.out.println(sum == n ? "Armstrong Number" : "Not an Armstrong Number");
}
```

### Algorithm

1. Read an integer from the user.
2. Store the original number in a temporary variable.
3. Extract each digit using the modulo (`%`) operator.
4. Calculate the cube of each digit.
5. Add the cubes to a running sum.
6. Compare the sum with the original number.
7. Print whether the number is an **Armstrong Number** or **Not an Armstrong Number**.

---

## 📋 Example Output

| Input | Output |
|:-----:|:------:|
| 153 | Armstrong Number |
| 370 | Armstrong Number |
| 371 | Armstrong Number |
| 407 | Armstrong Number |
| 123 | Not an Armstrong Number |

---

## 📚 Concepts Used

- Java Basics
- Variables
- User Input (`Scanner`)
- Methods
- `while` Loop
- Arithmetic Operators (`%`, `/`)
- Conditional (Ternary) Operator (`?:`)
- Number Manipulation

---

## 🎯 Learning Outcome

By completing this project, I learned:

- How to extract digits from a number.
- How to perform mathematical operations on each digit.
- How to compare calculated values with the original input.
- How to organize code using methods.
- How loops simplify digit-based computations.

---

## ⚠️ Note

- This implementation correctly checks **3-digit Armstrong Numbers** because it calculates the **cube** of each digit.
- For an **n-digit Armstrong Number**, each digit should be raised to the power of **n** instead of always using the cube.

Example:

- `153` → \(1³ + 5³ + 3³ = 153\) ✅
- `9474` is also an Armstrong Number, but it requires each digit to be raised to the power of **4**.

---

## 📌 Author

**Pratyush Kumar Mishra**

Part of my **#100DaysOfCode** Java journey 🚀

---

⭐ If you found this project helpful, consider giving the repository a star!
