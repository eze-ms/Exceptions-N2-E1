# Exceptions-N2-E1

## 📄 Description
This project demonstrates how to handle different types of exceptions in Java using a utility class `Entrada` for validating user inputs through the console. The program ensures that invalid inputs are managed gracefully by prompting the user until correct data is provided.

### Functionality
1. **Utility Class `Entrada`:**
   - Provides static methods for reading various data types from the console (`byte`, `int`, `float`, `double`, `char`, `String`, `boolean`).
   - Includes robust error handling using `InputMismatchException` and a custom exception `FormatInvalidException`.

2. **Methods:**
   - `llegirByte`, `llegirInt`, `llegirFloat`, `llegirDouble`: Handle numeric inputs with validation and clear user prompts.
   - `llegirChar`, `llegirString`, `llegirSiNo`: Manage textual inputs with additional validation logic.
   - Ensures data integrity by repeatedly prompting the user until valid input is provided.

3. **Main Class:**
   - Demonstrates the usage of the `Entrada` utility class.
   - Handles exceptions for each input type and provides user-friendly messages.

---

## 💻 Technologies Used
- **Java 17**
- **IntelliJ IDEA** as the development environment

---

## 📋 Requirements
- **Java Development Kit (JDK):** Version 17 or higher.
- **IDE:** IntelliJ IDEA or any Java-compatible IDE.

---

## 🛠️ Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/eze-ms/Exceptions-N2-E1
