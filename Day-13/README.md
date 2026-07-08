# 🔄 Day 13 - Reverse Characters in a String (Java)

A simple Java program that reverses the characters of a string using the **Two Pointer** technique. The program swaps characters from both ends of the character array until the entire string is reversed.

This project is part of my **#100DaysOfCode** journey, helping me strengthen my understanding of arrays, strings, two-pointer algorithms, and in-place manipulation in Java.

---

# 🚀 Features

- Implements the **Two Pointer** technique.
- Reverses a character array **in-place**.
- Does not use any built-in reverse methods.
- Simple and beginner-friendly implementation.
- Demonstrates an important string manipulation technique used in coding interviews.

---

## 🛠️ Prerequisites

Before running this program, make sure you have:

- **Java Development Kit (JDK)** 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or a terminal

---

# 📂 Project Structure

```text
Day-13/
│── ReverseCharacterInString.java
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
cd 100-days-of-coding-Java/Day-13
```

### 3. Compile the Java file

```bash
javac ReverseCharacterInString.java
```

### 4. Run the program

```bash
java ReverseCharacterInString
```

---

# 📝 Code Explanation

The program stores the string as a character array. It initializes two pointers:

- **Left Pointer (`l`)** at the beginning.
- **Right Pointer (`r`)** at the end.

The characters at both pointers are swapped, and the pointers move toward each other until they meet.

```java
int l = 0;
int r = s.length - 1;

while (l < r) {
    char temp = s[l];
    s[l] = s[r];
    s[r] = temp;

    l++;
    r--;
}
```

---

# 🔄 Algorithm

1. Store the string as a character array.
2. Initialize two pointers:
   - Left pointer at index `0`
   - Right pointer at the last index.
3. Swap the characters at both pointers.
4. Increment the left pointer and decrement the right pointer.
5. Continue until both pointers meet.
6. Print the reversed string.

---

# 📋 Example Output

### Input

```text
Character Array:
[h, e, l, l, o]
```

### Output

```text
olleh
```

---

### Another Example

**Input**

```text
Character Array:
[J, a, v, a]
```

**Output**

```text
avaJ
```

---

# 📚 Concepts Used

- Java Basics
- Character Arrays
- Strings
- Two Pointer Technique
- Swapping
- Loops
- In-place Algorithm

---

# 🎯 Learning Outcomes

By completing this project, I learned:

- How to reverse a string using the Two Pointer approach.
- How in-place algorithms work without using extra memory.
- How to manipulate character arrays efficiently.
- Why the Two Pointer technique is useful for string-related interview problems.
- How to implement a common coding interview question in Java.

---

## ⚠️ Time & Space Complexity

| Complexity | Value |
|------------|:-----:|
| Time Complexity | **O(n)** |
| Space Complexity | **O(1)** |

---

## 📌 Note

- This solution reverses the string **in-place**, requiring no additional array.
- The **Two Pointer** approach is more memory-efficient than creating a new reversed string.
- This technique is commonly used in coding interviews and competitive programming.

---

## 📌 Author

**Pratyush Kumar Mishra**

Part of my **#100DaysOfCode** Java journey 🚀

---

⭐ If you found this project helpful, consider giving the repository a star!
