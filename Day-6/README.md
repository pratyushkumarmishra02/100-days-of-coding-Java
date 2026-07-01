\# 🔍 Day 6 - Linear Search (Java)



A simple Java program that implements the \*\*Linear Search\*\* algorithm to search for a given element in an array. The program scans each element one by one until the target element is found or the array ends.



This project is part of my \*\*#100DaysOfCode\*\* journey, helping me strengthen my understanding of arrays, loops, and searching algorithms in Java.



\---



\# 🚀 Features



\* \*\*User Interactive:\*\* Accepts array elements and the search key using the `Scanner` class.

\* \*\*Linear Search Algorithm:\*\* Searches the array sequentially.

\* \*\*Beginner Friendly:\*\* Demonstrates the fundamentals of searching algorithms.

\* \*\*Simple Implementation:\*\* Easy to understand and modify.



\---



\## 🛠️ Prerequisites



Before running this program, make sure you have:



\* \*\*Java Development Kit (JDK)\*\* 8 or higher

\* Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or a terminal



\---



\# 📂 Project Structure



```text

Day-6/

│── LinearSearch.java

│── README.md

```



\---



\# 💻 How to Run



\### 1. Clone the repository



```bash

git clone https://github.com/YOUR\_USERNAME/100-days-of-coding-Java.git

```



\### 2. Navigate to the project folder



```bash

cd 100-days-of-coding-Java/Day-6

```



\### 3. Compile the Java file



```bash

javac LinearSearch.java

```



\### 4. Run the program



```bash

java LinearSearch

```



\---



\# 📝 Code Explanation



The program first accepts the size of the array and its elements from the user. It then reads the element to be searched and performs a \*\*Linear Search\*\* by checking each array element one by one.



```java

boolean found = false;



for (int num : arr) {

&#x20;   if (num == key) {

&#x20;       found = true;

&#x20;       break;

&#x20;   }

}



System.out.println(found ? "Found" : "Not Found");

```



\---



\# 🔄 Algorithm



1\. Read the size of the array.

2\. Input all array elements.

3\. Read the element to be searched.

4\. Traverse the array from the first element to the last.

5\. Compare each element with the search key.

6\. If a match is found, stop searching and print \*\*"Found"\*\*.

7\. If no match is found after traversing the entire array, print \*\*"Not Found"\*\*.



\---



\# 📋 Example Output



\### Example 1



\*\*Input\*\*



```text

5

10 20 30 40 50

30

```



\*\*Output\*\*



```text

Found

```



\---



\### Example 2



\*\*Input\*\*



```text

6

12 45 67 89 23 10

99

```



\*\*Output\*\*



```text

Not Found

```



\---



\# 📚 Concepts Used



\* Java Basics

\* Arrays

\* User Input (`Scanner`)

\* Enhanced `for` Loop

\* Conditional Statements

\* Boolean Variables

\* Linear Search Algorithm



\---



\# 🎯 Learning Outcomes



By completing this project, I learned:



\* How the Linear Search algorithm works.

\* How to traverse an array using an enhanced `for` loop.

\* How to search for an element sequentially.

\* How to use boolean variables to track search results.

\* The importance of simple searching algorithms before learning advanced ones like Binary Search.



\---



\## ⚠️ Time Complexity



| Case         | Complexity |

| ------------ | ---------- |

| Best Case    | \*\*O(1)\*\*   |

| Average Case | \*\*O(n)\*\*   |

| Worst Case   | \*\*O(n)\*\*   |



\### Space Complexity



\*\*O(1)\*\* (Constant Extra Space)



\---



\## 📌 Note



\* Linear Search works on both \*\*sorted\*\* and \*\*unsorted\*\* arrays.

\* It is simple to implement but may be slower than Binary Search for large datasets because it checks each element sequentially.



\---



\## 📌 Author



\*\*Pratyush Kumar Mishra\*\*



Part of my \*\*#100DaysOfCode\*\* Java journey 🚀



\---



⭐ If you found this project helpful, consider giving the repository a star!



