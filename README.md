# Sample Project

A simple Java Maven project that demonstrates basic addition functionality with unit tests.

## Prerequisites

- **Java JDK 11 or higher**
  - Check version: `java -version`

- **Apache Maven 3.6+**
  - Check version: `mvn --version`
  - Install on macOS: `brew install maven`

## Setup

Build the project:
```bash
mvn clean install
```

## Running the Project

```bash
mvn compile exec:java -Dexec.mainClass="org.example.Main"
```

## Running Tests

Run all unit tests:
```bash
mvn test
```

## Project Structure

```
src/
├── main/java/org/example/
│   └── Main.java           # Main application with add() method
└── test/java/org/example/
    └── MainTest.java       # Unit tests
```

## Technologies

- Java 11
- Maven
- JUnit 5

