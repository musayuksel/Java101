package Interfaces;

public interface OperateCar {
    // similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types
    // Interfaces cannot be instantiated—they can only be implemented by classes or extended by other interfaces
    // constant declarations, if any
    // method signatures
    // INTERFACES are MORE restrictive, ABSTRACTS are less restrictive
    // You can NOT implement concrete methods

    void speedUp(int increment);//DOESN'T HAVE BODY
     void speedDown(int decrement);
}
