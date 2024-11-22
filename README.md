# Java-Observer-Design-Pattern
The Observer Design Pattern is a behavioral design pattern that defines a one-to-many dependency between objects. 
When one object (the subject) changes state, all its dependents (observers) are notified and updated automatically.
# Key Components
1. Subject: The object being observed. It maintains a list of observers and notifies them when its state changes.
2. Observer: The interface or abstract class for objects that need to be notified of changes.
3. ConcreteSubject: The implementation of the subject, which contains the actual state and methods to manage observers.
4. ConcreteObserver: Implements the observer interface and defines the update behavior.