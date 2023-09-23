# Table of Contents
- [Table of Contents](#table-of-contents)
- [Introduction](#introduction)
- [Creational patterns](#creational-patterns)
- [Structural patterns](#structural-patterns)
- [Behavioral pattern](#behavioral-pattern)
- [Functional patterns](#functional-patterns)
- [Architectural pattern](#architectural-pattern)


# Introduction
Here are the main design patterns in coding. For each of them, a small description and an example implementation is provided in the corresponding folder.

# Creational patterns
**Creational patterns** deal with object creation. They help to create objects in a way that is flexible, efficient, and maintainable. Some of the most common creational patterns include:

- **Abstract factory pattern** creates families of related objects without specifying their concrete classes.
- **Builder pattern** constructs complex objects step by step.
- **Factory method pattern** delegates object creation to subclasses.
- **Prototype pattern** creates a new object by copying an existing object.
- **Singleton pattern** ensures that only one object of a particular class is ever created.

# Structural patterns
**Structural patterns** deal with the way objects are composed together. They help to make code more modular and reusable. Some of the most common structural patterns include:

- **Adapter pattern** converts the interface of one class into an interface that another class can understand.
- **Bridge pattern** decouples an abstraction from its implementation.
- **Composite pattern** treats individual objects and compositions of objects in a uniform way.
- **Decorator pattern** dynamically adds responsibilities to an object without affecting its structure.
- **Facade pattern** provides a simplified interface to a complex system.
- **Null object pattern** represents the absence of an object. This can be useful for avoiding null pointer exceptions and for simplifying code.
- **Flyweight pattern** minimizes memory usage by sharing objects that are identical or similar. This can be useful for implementing large sets of objects or for caching frequently used objects.
- **Proxy pattern** provides a surrogate or placeholder for another object to control access to it. This can be used to control access to a resource, to provide a level of indirection, or to defer the creation of an object until it is actually needed.
- **Delegate pattern** allows one object to delegate its responsibilities to another object. This can be used to decouple the two objects and to make the code more modular.
- **Aggregation pattern** allows one object to be composed of other objects. This can be used to create more complex objects from simpler ones and to make the code more reusable. Essentially, it's like the Composite pattern, but children can outlive parents (the "part" is not owned by the "whole", it can exist independently of the whole; this means hte whole is not responsible for creating or destroying the part).

# Behavioral pattern
**Behavioral patterns** deal with the way objects communicate with each other. They help to make code more flexible and maintainable. Some of the most common behavioral patterns include:

- **Chain of responsibility pattern** allows a request to be passed to a chain of objects until one of them handles it.
- **Command pattern** encapsulates a request as an object, allowing it to be passed around and executed later.
- **Iterator pattern** provides a way to traverse a collection of objects without exposing its underlying implementation.
- **Mediator pattern** allows objects to communicate with each other without knowing about each other explicitly.
- **Observer pattern** allows objects to subscribe to changes in other objects.
- **Strategy pattern** allows you to encapsulate a family of algorithms and make them interchangeable. This pattern lets you vary the behavior of an object at runtime without changing its code.
- **Finite State Machine pattern** (also known as **FSM** or **State pattern**) allows an object to change its behavior based on its internal state. This can be useful for implementing objects that have multiple modes of operation. This pattern is closely related to the concept of a finite-state machine.
- **Memento pattern** captures and externalizes an object's internal state so that it can be restored later. This can be useful for implementing undo/redo functionality or for debugging.
- **Visitor pattern** allows you to separate the algorithms from the objects on which they operate. This can be useful for implementing generic operations on different types of objects.
- **Template method pattern** defines the skeleton of an algorithm, deferring some steps to subclasses. This can be useful for implementing algorithms that are common to a set of subclasses.
- **Specification pattern** allows you to express constraints on objects. This can be useful for implementing search engines or for validating data.

# Functional patterns
**Functional patterns** use functions to abstract away complexity and make code more reusable. They can be used to solve a wide variety of problems, such as data transformation, error handling, and testing. Some of the most common functional patterns include:

- **Currying** is a technique for transforming a function that takes multiple arguments into a function that takes one argument and returns another function. This can be useful for making code more concise and reusable.
- **Partial application** is a technique for fixing some of the arguments of a function before calling it. This can be useful for making code more flexible and adaptable to changes.
- **Memoization** is a technique for caching the results of a function call so that the function does not have to be called again if the same input is given. This can be useful for improving the performance of a function.
- **Introspection** is the ability to inspect the structure of a function or data structure. This can be useful for debugging code or for writing generic code that can work with different types of functions or data structures.
- **Composition** is the ability to combine functions or data structures to create new functions or data structures. This can be useful for creating complex functionality from simpler pieces.
- **Higher-order functions** are functions that take other functions as arguments or return functions as results. This can be useful for creating generic code or for writing code that is more expressive and concise.
- **Monads** are a way of abstracting away side effects. They can be used to implement things like error handling and concurrency.
- **Pipelines** are a way of chaining together functions. This can be useful for implementing complex operations in a modular way.
- **Continuations** are a way of suspending and resuming the execution of a function. This can be useful for implementing things like backtracking and recursion.

# Architectural pattern
**Architectural design patterns** are solutions to recurring problems in software architecture. They are often used to make software systems more flexible, scalable, and maintainable. Here are some of the most common architectural design patterns:

- **Layered architecture** is a pattern that divides a software system into layers, each of which performs a specific task. This can help to improve the modularity and maintainability of the system.
- **Client-server architecture** is a pattern that divides a software system into two parts: a client and a server. The client is responsible for interacting with the user, and the server is responsible for providing the data and functionality. This can help to improve scalability and performance.
- **Microservices architecture** is a pattern that divides a software system into a collection of small, independent services. This can help to improve scalability, flexibility, and maintainability.
- **Event-driven architecture** is a pattern that decouples components by having them communicate with each other through events. This can help to improve scalability, flexibility, and decoupling.
- **Domain-driven design** is a pattern that focuses on the domain of the problem being solved. This can help to improve the clarity and maintainability of the system.
- **Pipe-filter architecture** is a pattern that divides a software system into a series of pipes and filters. The pipes are responsible for transporting data, and the filters are responsible for processing the data. This can help to improve modularity and scalability.
- **Broker architecture** is a pattern that decouples producers and consumers of data by having them communicate through a broker. This can help to improve scalability, flexibility, and decoupling.
- **Model-view-controller (MVC) architecture** is a pattern that divides a software system into three parts: the model, the view, and the controller. The model is responsible for storing data, the view is responsible for displaying data, and the controller is responsible for handling user input. This can help to improve separation of concerns and modularity.
- **Service-oriented architecture (SOA)** is a pattern that divides a software system into a collection of services. The services are loosely coupled and can be reused in different applications. This can help to improve scalability, flexibility, and maintainability.
- **Microkernel architecture** is a pattern that minimizes the core functionality of a software system and delegates other functionality to modules. This can help to improve modularity, scalability, and flexibility.
