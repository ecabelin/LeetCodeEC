// Interface Sample
// Abstract Data Types (ADT) - 
/* A specification of a data type from the user's POV
    - Consists of...
        - A class of objects 
        - A set of operations on the objects
*/ 

// Interface - A way to specify an ADT in Java
public interface IntCollection {
    void add(int k); // Add element to set
    boolean contains(int k); // Check if element is in set
    int size(); // Return number of elements in set
}

// How do we use an ADT?
// We implement the inteface with a class that 
// provides the actual data structure and algorithms for the operations
public class UnsortedIntCollection implements IntCollection {
    private int[] data;
    public UnsortedIntCollection() {
        // Constructor 
    }
    void add(int k) {
        // Implementation of add operation
    }
    boolean contains(int k) {
        // Implementation of contains operation
    }
    int size() {
        // Implementation of size operation
    }
}
public class Lecture2 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}