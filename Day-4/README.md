\# 🔢 Day 3 - GCD and LCM of Two Numbers (Java)



This folder contains two Java programs that calculate the \*\*Greatest Common Divisor (GCD)\*\* and \*\*Least Common Multiple (LCM)\*\* of two integers using the \*\*Euclidean Algorithm\*\*.



These programs are part of my \*\*#100DaysOfCode\*\* journey, helping me understand number theory, loops, and mathematical algorithms in Java.



\---



\# 📂 Programs Included



| No. | Program            | Description                                                                            |

| :-: | ------------------ | -------------------------------------------------------------------------------------- |

|  1  | GCD of Two Numbers | Finds the Greatest Common Divisor (GCD) of two integers using the Euclidean Algorithm. |

|  2  | LCM of Two Numbers | Calculates the Least Common Multiple (LCM) using the GCD of two integers.              |



\---



\## 🚀 Features



\* Accepts user input using the `Scanner` class.

\* Implements the efficient \*\*Euclidean Algorithm\*\*.

\* Calculates both \*\*GCD\*\* and \*\*LCM\*\*.

\* Beginner-friendly and easy to understand.

\* Demonstrates mathematical problem-solving in Java.



\---



\## 🛠️ Prerequisites



Before running these programs, make sure you have:



\* \*\*Java Development Kit (JDK)\*\* 8 or higher

\* Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or a terminal



\---



\# 📂 Project Structure



```text

Day-4/

│── GCDOf2Numbers.java

│── LCMOf2Numbers.java

│── README.md

```



\---



\# 💻 How to Run



\### 1. Clone the repository



```bash

git clone https://github.com/YOUR\_USERNAME/100-days-of-coding-Java.git

```



\### 2. Navigate to the folder



```bash

cd 100-days-of-coding-Java/Day-4

```



\### 3. Compile the Java file



Example:



```bash

javac GCDOf2Numbers.java

```



or



```bash

javac LCMOf2Numbers.java

```



\### 4. Run the program



```bash

java GCDOf2Numbers

```



or



```bash

java LCMOf2Numbers

```



\---



\# 📝 Program Overview



\## 1️⃣ GCD of Two Numbers



The program calculates the \*\*Greatest Common Divisor (GCD)\*\* of two integers using the \*\*Euclidean Algorithm\*\*.



\### Algorithm



1\. Read two integers from the user.

2\. Repeatedly divide the first number by the second.

3\. Replace the first number with the second and the second with the remainder.

4\. Continue until the remainder becomes `0`.

5\. The remaining value is the GCD.



\### Example



\*\*Input\*\*



```text

24

36

```



\*\*Output\*\*



```text

12

```



\---



\## 2️⃣ LCM of Two Numbers



The program first finds the \*\*GCD\*\* using the Euclidean Algorithm and then calculates the \*\*LCM\*\* using the formula:



```text

LCM = (a × b) / GCD

```



\### Algorithm



1\. Read two integers.

2\. Calculate their GCD.

3\. Apply the formula:



```text

LCM = (a × b) / GCD

```



4\. Display the LCM.



\### Example



\*\*Input\*\*



```text

12

18

```



\*\*Output\*\*



```text

36

```



\---



\# 📚 Concepts Used



\* Java Basics

\* Variables

\* User Input (`Scanner`)

\* Methods

\* `while` Loop

\* Euclidean Algorithm

\* Greatest Common Divisor (GCD)

\* Least Common Multiple (LCM)

\* Arithmetic Operations



\---



\# 🎯 Learning Outcomes



By completing these programs, I learned:



\* How the Euclidean Algorithm efficiently computes the GCD.

\* The mathematical relationship between GCD and LCM.

\* How to use loops for iterative calculations.

\* How to solve number theory problems in Java.

\* How to write clean and efficient Java code.



\---



\## ⚠️ Note



\* The Euclidean Algorithm is one of the fastest methods to calculate the GCD of two integers.

\* The formula used to calculate LCM is:



```text

LCM = (First Number × Second Number) ÷ GCD

```



\* These programs are designed for positive integers.



\---



\## 📌 Author



\*\*Pratyush Kumar Mishra\*\*



Part of my \*\*#100DaysOfCode\*\* Java journey 🚀



\---



⭐ If you found this project helpful, consider giving the repository a star!



