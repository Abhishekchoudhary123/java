//import java.util.*;
import java.time.format.DateTimeFormatter;

import java.time.LocalDateTime;
public class dateTime {
    public static void main(String[] args) {
        
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println("Current Date and Time: " + newDateTime);
    }
}

// Introduction to Java : History and Features of Java, Java program structure, Writing simple Java
// class and main() method, Command-line arguments, Understanding JDK, JRE and JVM
// Data In the Cart : Using primitive data types, Type conversion, Keywords, Identifiers, Variables,
// Access modifiers, static keyword, Wrapper class
// Operators : Working with Bit-wise, arithmetic, logical, and relational operators, Unary, assignment
// and Ternary operator, Operator precedence
// Conditional Statements : Using if/else constructs and switch-case statements

// Unit II
// Loops : Working with for loop, while loop, do-while loop and for-each loop
// Arrays and Enums : Fundamentals about Arrays, Multi-dimensional arrays, Array Access and
// Iterations, Using varargs, Enumerations
// OOP Concepts : Basics of class and objects, Writing constructors and methods, Overloading methods
// and constructors, this keyword, initializer blocks
// String Class : Constructors and methods of String and String Builder class

// Unit III
// Inheritance and Polymorphism : Inheritance, Method overriding, super keyword, Object class and
// overriding toString() and equals() method, Using super and final keywords, instanceof operator
// Abstract Class and Interface : Abstract method and abstract class, Interfaces, static and default
// methods.

// Unit IV
// Nested Class and Lambda Expressions: : Nested Class, Understanding the importance of static
// and non-static nested classes, Local and Anonymous class, Functional Interface, Lambda expressions
// Utility Classes : Working with Dates
// Exceptions and Assertions : Exception overview, Exception class hierarchy and exception types,
// Propagation of exceptions, Using try, catch and finally for exception handling, Usage of throw and
// throws, handling multiple exceptions using multi-catch, Autoclose resources with try-with resources
// statement, Creating custom exceptions, Testing invariants by using assertions

// Unit V
// I/O Fundamentals : Describing the basics of input and output in Java, Read and write data from
// various sources, Using streams to read and write files, Writing and read objects using serialization
// Generics : Creating a custom generic class, Using the type inference diamond to create an object,
// Using bounded types and Wild Cards.

// Unit VI
// Collections : Creating a collection by using generics, Implementing an ArrayList, Implementing
// TreeSet using Comparable and Comparator interfaces, Implementing a HashMap, Implementing a
// Deque.
// Java Database Programming : Introduction to JDBC, JDBC Drivers, CRUD operation Using JDBC,
// Connecting to non-conventional Data
