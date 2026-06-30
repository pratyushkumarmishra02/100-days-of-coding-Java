# 🔤 Day 5 - String Interview Programs (Java)

This folder contains two beginner-friendly **Java String Interview Programs** that demonstrate common string manipulation techniques frequently asked in coding interviews.

These programs are part of my **#100DaysOfCode** journey, helping me strengthen my understanding of arrays, strings, sorting, and character manipulation in Java.

---

# 📂 Programs Included

| No. | Program                     | Description                                                                         |
| :-: | --------------------------- | ----------------------------------------------------------------------------------- |
|  1  | Check Anagram               | Determines whether two strings are anagrams of each other.                          |
|  2  | Remove Duplicate Characters | Removes duplicate characters from a string while preserving their first occurrence. |

---

## 🚀 Features

* Accepts user input using the `Scanner` class.
* Uses efficient string manipulation techniques.
* Demonstrates array sorting and character processing.
* Beginner-friendly and easy to understand.
* Covers commonly asked Java interview questions.

---

## 🛠️ Prerequisites

Before running these programs, make sure you have:

* **Java Development Kit (JDK)** 8 or higher
* Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or a terminal

---

# 📂 Project Structure

```text
Day-5/
│── CheckAnagram.java
│── RemoveDuplicateFromString.java
│── README.md
```

---

# 💻 How to Run

### 1. Clone the repository

```bash
git clone https://github.com/YOUR_USERNAME/100-days-of-coding-Java.git
```

### 2. Navigate to the folder

```bash
cd 100-days-of-coding-Java/Day-5
```

### 3. Compile the Java file

Example:

```bash
javac CheckAnagram.java
```

or

```bash
javac RemoveDuplicateFromString.java
```

### 4. Run the program

```bash
java CheckAnagram
```

or

```bash
java RemoveDuplicateFromString
```

---

# 📝 Program Overview

## 1️⃣ Check Anagram

An **Anagram** is a word or phrase formed by rearranging the letters of another word using all the original letters exactly once.

The program converts both strings into character arrays, sorts them, and compares the arrays.

### Example

**Input**

```text
listen
silent
```

**Output**

```text
Anagram
```

Another Example

**Input**

```text
hello
world
```

**Output**

```text
Not Anagram
```

### Concepts Used

* Strings
* Character Arrays
* `Arrays.sort()`
* `Arrays.equals()`
* User Input (`Scanner`)

---

## 2️⃣ Remove Duplicate Characters from a String

This program removes duplicate characters from a string while preserving the order of their first occurrence.

### Example

**Input**

```text
programming
```

**Output**

```text
progamin
```

Another Example

**Input**

```text
banana
```

**Output**

```text
ban
```

### Concepts Used

* Strings
* `toCharArray()`
* `indexOf()`
* Loops
* Character Manipulation

---

# 📚 Concepts Covered

* Java Basics
* Variables
* User Input (`Scanner`)
* Strings
* Arrays
* Character Arrays
* Sorting
* Loops
* String Manipulation

---

# 🎯 Learning Outcomes

After completing these programs, I learned:

* How to determine whether two strings are anagrams.
* How to sort character arrays using `Arrays.sort()`.
* How to compare arrays using `Arrays.equals()`.
* How to remove duplicate characters without using collections.
* How to manipulate strings efficiently in Java.

---

## ⚠️ Note

* The **Anagram** program is **case-sensitive**. To make it case-insensitive, convert both strings to lowercase before comparison.

* The **Remove Duplicate Characters** program preserves the order of the first occurrence of each character.

---

## 📌 Author

**Pratyush Kumar Mishra**

Part of my **#100DaysOfCode** Java journey 🚀

---

⭐ If you found this project helpful, consider giving the repository a star!
