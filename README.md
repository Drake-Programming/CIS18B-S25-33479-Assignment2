## CIS18B-S25-33479 Assignment 2

### Overview
This repository contains Java source code for Assignment 2 of the CIS18B (Spring 2025) course. The project demonstrates basic object-oriented programming principles, including inheritance, interfaces, and the Singleton design pattern, using a simple library system as an example.

### Cloning the Repository
To copy this project, use the following command:

```bash
git clone https://github.com/Drake-Programming/CIS18B-S25-33479-Assignment2.git
```

### Running the Project
After cloning the repository, navigate to the `src` directory:

```bash
cd CIS18B-S25-33479-Assignment2/src
```

All main project files are located in this directory.

To compile and run the code from the terminal, use the following commands:

```bash
javac LibraryTest.java
java LibraryTest
```

### Important Notes
- The project includes files generated by IntelliJ IDE which are unnecessary if you're compiling and running via terminal.
- Ensure you are in the `src` directory when compiling and running the Java files.

### Project Structure
```
src/
│
├── Book.java
├── IBorrowable.java
├── Item.java
├── Library.java
├── LibraryItemFactory.java
├── LibraryTest.java
└── Magazine.java
```

### Main Execution
The entry point of the application is the `LibraryTest.java` file.

### Expected Output
When running the project, the program will print a list of available items, attempt to find certain items by title, and display appropriate messages for found or missing items.

---

*Author:* Drake Programming
