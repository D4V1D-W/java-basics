# 🌱 Java Basics - My Learning Journey

Hello! I'm David and this is my daily practice space with Java. Here I will document my progress from zero to building professional projects.

## 🚀My Mission
"One commit a day keeps incompetence away"

Main goal: Systematically learn Java and create a portfolio that demonstrates my growth as a developer.

Progress Metrics
## 📈  Progress Metrics 💪
```bash
# Current status:
✅ First repository created
🔄 Consecutive days: 26
📊 Practices completed: 26
🏆 Mini-projects: 0
🎯 Final project: To be defined
```



## Day 1 – Variables and Conditional Logic
- Java project setup
- Variables declaration
- `if / else` statements
- Simple logic to determine if a person is an adult

---

## Day 2 – User Input with Scanner
- Reading user input using `Scanner`
- Handling integer input
- Basic interaction through the console
- Improving program usability

---

## Day 3 – Control Flow and Input Validation
- Input validation using `hasNextInt()`
- Handling invalid user input
- Conditional logic with `if / else if / else`
- Defensive programming practices

---

## Day 4 – Loops and Validation Logic
- `while` loops
- Repeating input until valid data is entered
- Preventing program crashes
- Cleaner and safer input handling

---

## Day 5 – Menus, Methods and Program Flow
- Interactive menu using `while`
- `switch` statement
- Method separation
- Program flow control
- Building more realistic console applications

---

## Day 6 – Classes and Objects (OOP Basics)
- Introduction to Object-Oriented Programming (OOP)
- Creation of classes and objects
- Understanding attributes (state) and methods (behavior)
- Using objects to access data and execute actions
- Separating responsibilities between classes

---

## Day 7 – Encapsulation (private, getters and setters)
- Data encapsulation using private attributes
- Controlled access with getters and setters
- Using `this` keyword
- Input validation inside setters
- Writing safer and more maintainable code

---

## Day 8 – Constructors
- Understanding constructors in Java
- Initializing objects using constructors
- Using default and parameterized constructors
- Using `this` keyword
- Creating safer object initialization

 ---

- ## Day 9 – Inheritance

- Implemented inheritance using `extends`
- Created a parent class (`Person`)
- Created a child class (`Student`)
- Reused attributes and methods
- Practiced the "is-a" relationship in Java

---

- ## Day 10 – Polymorphism and Method Overriding

On this day, I learned and applied polymorphism in Java using inheritance
and encapsulation.

Key concepts practiced:
- Method overriding using `@Override`
- Using parent class references to point to child class objects
- Runtime method dispatch (dynamic polymorphism)
- Clean object-oriented design without conditionals (`if` / `instanceof`)

I implemented different behaviors for the same method (`greet()`)
depending on the actual object type, reinforcing how Java resolves
method calls at runtime.

---

## Day 11 – Abstraction and Interfaces

On this day, I learned how to use interfaces in Java to achieve abstraction
and decouple system components.

Key concepts practiced:
- Creating and using interfaces as contracts
- Implementing interfaces with different classes
- Applying polymorphism through interfaces
- Designing flexible and scalable code

This approach is fundamental for building real-world
applications and is widely used in frameworks like Spring Boot.

--- 

## Day 12 – Abstract Classes vs Interfaces

On this day, I learned the difference between abstract classes
and interfaces in Java and how they are used together.

Key concepts practiced:
- Creating abstract classes with shared state and behavior
- Implementing abstract methods in child classes
- Defining interfaces as contracts
- Combining inheritance with interfaces

This knowledge is essential for designing clean architectures
and is widely used in enterprise frameworks like Spring.

--- 

## Day 13 – Abstract Classes and Design Improvement
- Introduction to abstract classes in Java
- Conversion of the Person class into an abstract class
- Use of abstract methods to enforce implementation in subclasses
- Implementation of specific behaviors in Student and Teacher using @Override
- Improved object-oriented design through inheritance and abstraction
- Refactoring without breaking existing functionality

--- 

## Day 14 – Polymorphism with Arrays
- Use of arrays with parent class references (Person[])
- Storing different child objects (Student, Teacher) in the same array
- Iterating objects using for-each loop
- Runtime method dispatch (dynamic polymorphism)
- Cleaner and more scalable object management

Today I learned how to use arrays with polymorphism to manage multiple objects in a cleaner and more scalable way.

Instead of creating and using each object separately, I created an array of type Person and stored different objects like Student and Teacher.

Then, I iterated through the array and called the same methods for all objects.

Thanks to polymorphism, Java automatically executed the correct version of each method depending on the real object type.

Concepts applied together:
- Encapsulation  
- Inheritance  
- Interfaces  
- Method overriding  

--- 

## Day 15 – Polymorphism with ArrayList
- Introduction to Java Collections using ArrayList
- Replacement of fixed-size arrays with dynamic collections
- Managing multiple objects using a parent class reference (Person)
- Applying polymorphism with collections
- Iterating objects using enhanced for-each loop
- Cleaner and more scalable object-oriented design

On this day, I replaced arrays with an ArrayList to store and manage multiple objects such as Student and Teacher using the Person parent class.

By using an ArrayList, objects can be added dynamically, making the program more flexible and closer to real-world Java applications.

Polymorphism ensures that the correct overridden methods are executed at runtime when iterating through the collection.

---

## Day 16 – Programming to Interfaces with List
- Introduction to programming against interfaces
- Using List instead of concrete implementations
- Improved flexibility and decoupled design
- Polymorphism with collections
- Cleaner and more professional object-oriented architecture

On this day, I refactored the code to use the List interface instead of directly using ArrayList.

This approach allows changing the underlying collection implementation without affecting the rest of the program, improving flexibility and maintainability.

This design follows best practices used in real-world Java applications and frameworks like Spring Boot.

---

## Day 17 – Exception Handling in Java
- Introduction to exception handling using try-catch-finally
- Handling invalid data using IllegalArgumentException
- Improving program robustness and stability
- Preventing application crashes with controlled error handling
- Applying validation logic to existing object-oriented design

On this day, I added exception handling to manage invalid data and runtime errors without breaking the program.

Using try-catch blocks, the application can handle errors gracefully and continue execution in a controlled way.

This approach is essential for building reliable and professional Java applications, especially in backend development.

---

## Day 18 – Custom Exceptions in Java
- Introduction to custom exceptions in Java
- Creating user-defined exceptions by extending RuntimeException
- Applying domain-specific validation rules
- Improving error clarity and debugging
- Writing cleaner and more expressive error handling code

On this day, I implemented a custom exception to handle specific business rules instead of relying only on generic exceptions.

By creating my own exception class and extending RuntimeException, I was able to represent errors in a clearer and more meaningful way, improving code readability and maintainability.

This approach reflects real-world Java backend practices and prepares the codebase for scalable and professional application development.

---

---

## Day 19 – Code Organization and Refactoring

- Refactoring the Main class to improve readability
- Separating test logic into dedicated methods per learning day
- Improving code organization without changing functionality
- Applying clean code principles to existing Java projects
- Preparing the project structure for future testing and scalability

On this day, I focused on organizing and refactoring my existing code instead of adding new features.

I cleaned up the main method by extracting daily tests into separate methods, making the program easier to read, maintain, and extend.

This refactoring reflects real-world Java development practices, where improving code structure and clarity is just as important as learning new language features.

---

## Day 20 – Enums and Clean Domain Modeling

- Introduction to enums in Java
- Replacing magic strings with controlled enum values
- Improving type safety and code readability
- Refactoring existing classes to use enums
- Applying cleaner domain modeling practices

On this day, I learned how to use enums to represent fixed sets of values instead of relying on raw strings.

I refactored existing classes to replace repeated string values with enums, reducing potential errors and improving code clarity.

This approach reflects real-world Java development practices, where enums are commonly used to model states, categories, and domain-specific values.

---

## Day 21 – Separation of Responsibilities and Clean Design

- Applying Single Responsibility Principle (SRP)
- Avoiding bloated models in object-oriented design
- Separating validation logic from domain models
- Improving code maintainability and clarity
- Preparing the project structure for future scalability (Spring Boot-ready)

On this day, I focused on improving the overall design of the application by ensuring that each class has a clear and single responsibility.

I avoided placing excessive logic inside the Person model, reinforcing the idea that domain models should represent data and behavior, not handle all validations or business rules.

This approach leads to cleaner, more professional Java code and prepares the project for future growth and integration with frameworks like Spring Boot.

---

## Day 22 – Service Layer and Business Logic Separation

- Introducing the Service layer in Java applications
- Moving business logic out of domain models
- Coordinating validations and operations through services
- Improving testability and code organization
- Aligning the project structure with real-world backend architectures

On this day, I introduced a Service layer to handle business logic and application workflows, keeping domain models clean and focused on their core responsibilities.

By centralizing operations inside services, the codebase becomes easier to maintain, test, and extend without modifying core entities.

This structure closely mirrors professional Java and Spring Boot applications, where services act as the bridge between controllers and domain models.

---

## Day 23 – Generics

- Introduction to Generics in Java
- Creating reusable classes with type parameters using <T>
- Applying bounded generics with <T extends Person>
- Understanding why Generic types are essential in Java collections
- Connecting Generics to real-world Spring Boot patterns like JpaRepository<T, ID>

On this day, I learned how to create generic classes that work with any type,
and how to restrict them using bounded type parameters.

By using <T extends Person>, I was able to call Person methods inside the service
without losing flexibility, making the code reusable and type-safe.

This concept is fundamental for understanding how Spring Data repositories work
under the hood, where JpaRepository<Person, Long> follows the exact same pattern.

---

## Day 24 – Optional

- Introduction to Optional<T> in Java
- Eliminating null returns to prevent NullPointerException
- Using Optional.of(), Optional.empty(), and ifPresentOrElse()
- Refactoring findByName() in PersonService and BoundedPersonService
- Aligning the codebase with Spring Data patterns like findById()

On this day, I refactored the findByName() method across services to return
Optional<T> instead of null, eliminating a common source of runtime crashes.

Using Optional forces the caller to handle the case where no result is found,
making the code safer and more expressive.

This approach directly mirrors how Spring Data JPA handles queries, where
findById() returns Optional<Person> instead of a raw nullable object.


---

## Day 25 – Stream API

- Introduction to the Stream API in Java
- Using filter() to select elements by condition
- Using map() to transform collections into new types
- Using findFirst() combined with Optional
- Using anyMatch() to verify existence
- Using forEach() and method references (::)
- Replacing manual loops with cleaner and more expressive stream pipelines

On this day, I refactored PersonService to use the Stream API instead of
manual for loops, making the code more readable and expressive.

Streams allow chaining operations like filter, map and collect in a single
pipeline, reducing boilerplate and improving clarity.

This approach is widely used in real-world Spring Boot services when
processing collections returned from repositories.

---

## Day 26 – Lambdas and Functional Interfaces

- Understanding lambdas as anonymous functions
- Introduction to functional interfaces in Java
- Using Predicate<T> to evaluate conditions
- Using Function<T, R> to transform values
- Using Consumer<T> to execute actions without returning a value
- Using Supplier<T> to provide values without receiving parameters
- Combining Predicates with .and(), .or(), .negate()
- Creating a reusable PersonFilter class using functional interfaces

On this day, I formalized what lambdas actually are and how they connect
to functional interfaces in Java.

I realized I had already been using lambdas in filter(), map(), forEach()
and ifPresentOrElse() — this day gave me the vocabulary and structure
to understand and use them intentionally.

By creating PersonFilter with Predicate and Function parameters, I built
a flexible and reusable utility that accepts any condition or transformation
without modifying the class itself.

This pattern is fundamental in Spring Boot, where lambdas and functional
interfaces are used constantly in service layers, stream pipelines,
and repository operations.

---

## Day 27 – HashMap and Collections

- Introduction to HashMap and the Map interface in Java
- Understanding key-value storage vs index-based Lists
- Using put(), get(), containsKey(), remove() and entrySet()
- Iterating a Map using Map.Entry
- Using Optional.ofNullable() for safe null handling
- Creating a PersonRegistry class backed by a HashMap
- Understanding when to use List vs Map vs Set

On this day, I replaced the ArrayList-based service with a HashMap-based
registry, where each person is stored and accessed by their name as a key.

This approach makes lookups significantly faster and more expressive,
since instead of iterating the entire list to find a person, we access
them directly by key.

I also learned the difference between List, Map and Set, and when each
collection type is the right choice depending on the use case.

This pattern is widely used in Spring Boot for caching, grouping data,
and building in-memory stores before connecting to a real database.

---

## Day 28 – Builder Pattern

- Introduction to the Builder design pattern
- Understanding the problem with long constructors
- Creating a class with a private constructor and inner Builder
- Using method chaining to build objects expressively
- Handling optional fields without overloading constructors
- Connecting Builder pattern to Lombok's @Builder in Spring Boot

On this day, I implemented the Builder pattern manually to understand
how clean object construction works in Java.

Instead of passing all parameters in a constructor, the Builder allows
setting only the fields you need, in any order, making the code
significantly more readable and maintainable.

This pattern is essential in Spring Boot, where Lombok's @Builder
annotation generates this exact structure automatically — and now
I understand what it does under the hood.






