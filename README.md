# Software Engineering Fundamentals (SEF)

This repository contains laboratory exercises and course materials for the Software Engineering Fundamentals course.

## Overview

The labs cover various software engineering concepts including UML modeling, software development processes (Scrum), version control with Git, testing with JUnit, and build tools (Maven, Gradle, NPM). While the labs are sequential in numbering, they are largely independent and focus on different aspects of software engineering.

## Lab Structure

### Lab 1 - Java Fundamentals
A simple Java exercise covering:
- Inheritance and object-oriented programming
- File processing and I/O operations

### Lab 2 - UML Use Case Diagrams
Introduction to UML modeling through use case diagrams.

### Lab 3 - Scrum Process Simulation
A documentation exercise simulating a complete Scrum process:
- Product backlog with user stories
- Sprint planning and sprint backlog
- Task breakdown with story points
- Reflection on the process

### Lab 4 - Student Manager Application (JavaFX)
A fully implemented JavaFX application for managing student information:
- Student and teacher accounts
- Personal details and grade management
- Built with Maven and JavaFX

**Submodule:** [SEF_Lab4](https://github.com/ChrisMicea/SEF_Lab4)

### Lab 5 - Student Manager Application (Git & JavaFX Learning)
A learning exercise focusing on:
- Git workflow and version control
- Basic introduction to JavaFX
- Integration with Jira for issue tracking

**Note:** This is a learning exercise. For the fully implemented application, see Lab 4.

**Submodule:** [SEF_Lab5](https://github.com/ChrisMicea/SEF_Lab5)

### Lab 7 - CLI Greeting App
Three implementations of a CLI greeting application demonstrating different build tools:
- Maven implementation
- Gradle implementation
- NPM implementation

Features:
- Multi-language support (English, German, Spanish, Romanian)
- Colored output per language
- Optional language parameter

**Submodule:** [SEF_Lab7](https://github.com/ChrisMicea/SEF_Lab7)

### Lab 9 - UML Diagrams
UML modeling exercises:
- Creating sequence diagrams from existing code
- Implementing code from UML class diagrams

### Lab 11 - Unit Testing with JUnit
Comprehensive introduction to unit testing using JUnit 5:
- JUnit 5 annotations (@Test, @BeforeEach, @AfterEach, etc.)
- Assertions and exception testing
- Test-Driven Development (TDD) approach
- Code coverage with JaCoCo
- Maven and Gradle configuration for testing

**Submodule:** [SEF_Lab11](https://github.com/ChrisMicea/SEF_Lab11)

## Course Materials

The `Lectures/` directory contains course lecture materials (PDFs and archived files).

## Repository Structure

- **Labs 1, 2, 3, 9** - Regular directories in this repository
- **Labs 4, 5, 7, 11** - Git submodules pointing to separate repositories

## Getting Started

To clone this repository with all submodules:

```bash
git clone --recursive <repository-url>
```

If you've already cloned without submodules:

```bash
git submodule update --init --recursive
```

To update submodules to their latest commits:

```bash
git submodule update --remote
```
