# 🔤 Day 18 - Longest Substring Without Repeating Characters (Java)

A simple Java program that solves the **Longest Substring Without Repeating Characters** problem using the **Sliding Window** technique and a **HashSet**. The program finds the length of the longest substring containing only unique characters.

This project is part of my **#100DaysOfCode** journey, helping me strengthen my understanding of sliding window algorithms, hash-based data structures, and string manipulation in Java.

---

# 🚀 Features

- Implements the **Sliding Window** algorithm.
- Uses a **HashSet** to track unique characters.
- Finds the length of the longest substring without repeating characters.
- Efficient solution with **O(n)** time complexity.
- Beginner-friendly implementation.
- Demonstrates a popular coding interview problem.

---

## 🛠️ Prerequisites

Before running this program, make sure you have:

- **Java Development Kit (JDK)** 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or a terminal

---

# 📂 Project Structure

```text
Day-18/
│── LongestSubstringWithoutRepeatingCharacters.java
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
cd 100-days-of-coding-Java/Day-18
```

### 3. Compile the Java file

```bash
javac LongestSubstringWithoutRepeatingCharacters.java
```

### 4. Run the program

```bash
java LongestSubstringWithoutRepeatingCharacters
```

---

# 📝 Code Explanation

The program uses a **Sliding Window** approach with two pointers (`start` and `end`).

- The **end** pointer expands the window by adding characters.
- If a duplicate character is encountered, the **start** pointer shrinks the window until the duplicate is removed.
- A **HashSet** stores the unique characters currently inside the window.
- The maximum window size is updated throughout the traversal.

```java
int start = 0, end = 0, max_len = 0;
Set<Character> set = new HashSet<>();

while (end < s.length()) {

    char c = s.charAt(end);

    if (!set.contains(c)) {
        set.add(c);
        end++;
        max_len = Math.max(max_len, set.size());
    } else {
        set.remove(s.charAt(start));
        start++;
    }
}

return max_len;
```

---

# 🔄 Algorithm

1. Initialize two pointers: `start` and `end`.
2. Create an empty `HashSet`.
3. Expand the window by moving `end`.
4. If the current character is unique:
   - Add it to the set.
   - Update the maximum substring length.
5. If a duplicate is found:
   - Remove characters from the beginning of the window.
   - Move `start` forward until the duplicate is removed.
6. Continue until the end of the string.
7. Return the maximum substring length.

---

# 📋 Example Output

### Example 1

**Input**

```text
abcabcbb
```

**Output**

```text
3
```

**Explanation**

The longest substring without repeating characters is:

```text
abc
```

---

### Example 2

**Input**

```text
bbbbb
```

**Output**

```text
1
```

---

### Example 3

**Input**

```text
pwwkew
```

**Output**

```text
3
```

**Explanation**

The longest substring is:

```text
wke
```

---

# 📚 Concepts Used

- Java Basics
- Strings
- HashSet
- Sliding Window Technique
- Two Pointer Technique
- Loops
- Conditional Statements
- `Math.max()`

---

# 🎯 Learning Outcomes

By completing this project, I learned:

- How the **Sliding Window** technique efficiently processes strings.
- How a **HashSet** helps detect duplicate characters in constant time.
- How to dynamically adjust the window size based on conditions.
- Why this approach is much faster than checking every possible substring.
- How to solve one of the most frequently asked coding interview problems.

---

## ⚠️ Time & Space Complexity

| Complexity | Value |
|------------|:-----:|
| Time Complexity | **O(n)** |
| Space Complexity | **O(min(n, m))** |

> Here, **n** is the length of the string and **m** is the size of the character set.

---

## 📌 Note

- This solution uses the **Sliding Window + HashSet** approach for optimal performance.
- Each character is processed at most twice, resulting in **O(n)** time complexity.
- This problem is one of the most popular interview questions on **LeetCode**, **GeeksforGeeks**, and **HackerRank**.
- An alternative solution uses a **HashMap** to store character indices, which can skip multiple characters at once.

---

## 📌 Author

**Pratyush Kumar Mishra**

Part of my **#100DaysOfCode** Java journey 🚀

---

⭐ If you found this project helpful, consider giving the repository a star!
