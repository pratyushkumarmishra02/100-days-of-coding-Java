\# Check Even or Odd (Java)



A straightforward Java program that takes an integer input from the user and determines whether the number is \*\*Even\*\* or \*\*Odd\*\* using the modulo operator (`%`). 



This project is part of my #100DaysOfCode journey, focusing on foundational logic and basic Java syntax.



\---



\## 🚀 Features

\* \*\*User Interactive:\*\* Uses the `Scanner` class to accept real-time user input via the console.

\* \*\*Efficient Logic:\*\* Utilizes a simple arithmetic condition (`n % 2 == 0`) to determine parity instantly.



\---



\## 🛠️ Prerequisites

Before running this program, ensure you have the following installed:

\* \*\*Java Development Kit (JDK):\*\* Version 8 or higher.

\* An IDE (like Eclipse, IntelliJ IDEA, VS Code) or just a terminal.



\---



\## 💻 How to Run



1\. \*\*Clone the repository:\*\*

&#x20;  git clone https://github.com/YOUR\_USERNAME/100-days-of-coding-Java.git



2\. \*\*Navigate to the file directory:\*\*

&#x20;  cd 100-days-of-coding-Java/Day1



3\. \*\*Compile the Java file:\*\*

&#x20;  javac ChekEvenOdd.java



4\. \*\*Run the program:\*\*

&#x20;  java ChekEvenOdd



\---



\## 📝 Code Breakdown



The core logic relies on the \*\*modulo operator (`%`)\*\*, which returns the remainder of a division. 



\* If a number is divisible by `2` with a remainder of `0`, it is \*\*Even\*\*.

\* Otherwise, it is \*\*Odd\*\*.
if (n % 2 == 0) {

System.out.println("Even");

} else {

System.out.println("Odd");

}

### Example Input/Output



| Input | Expected Output |

| :---: | :---: |

| 4     | Even            |

| 7     | Odd             |

| 0     | Even            |



\---

