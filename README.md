# Natural Number on String Implementation

## Description
The **Natural Number on String Implementation** is a Java project that develops a kernel component for natural numbers layered on top of the `java.lang.String` class. The project involves implementing constructors and kernel methods (`multiplyBy10`, `divideBy10`, and `isZero`) for the `NaturalNumber` data structure while adhering to a strict representation invariant and abstraction function.

This project emphasizes:
- Kernel-level programming.
- Debugging complex interactions between methods.
- Designing and executing a robust, systematic test plan.

---

## Objectives
1. Implement the `NaturalNumberKernel` interface with a String-based representation.
2. Develop constructors and kernel methods for the component.
3. Create a thorough and systematic specification-based test plan.
4. Ensure the representation invariant and abstraction function are always upheld.

---

## Features
### 1. Natural Number Representation
- A natural number is represented using a `String` data structure.
- Supports arbitrarily large natural numbers within the constraints of the representation.

### 2. Implemented Kernel Methods
- **`multiplyBy10`**: Multiplies the number by 10 and appends a digit.
- **`divideBy10`**: Divides the number by 10 and returns the remainder.
- **`isZero`**: Checks whether the number is zero.

### 3. Robust Test Suite
- Specification-based test plan for systematic testing of:
  - Constructors
  - Kernel methods
- Tests use a reference implementation to verify correctness.

---

## Technologies Used
- **Java**: For implementing the kernel methods and constructors.
- **JUnit**: For unit testing.

---

## How to Run
### Prerequisites
- Java Development Kit (JDK)
- Eclipse IDE or any Java-compatible IDE

### Steps
1. Clone the repository:
   ```bash
   git clone [repository URL]
