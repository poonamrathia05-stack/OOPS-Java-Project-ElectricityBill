// File: Consumer.java
// This class stores consumer details using private variables

public class Consumer {
    // Private variables - can't access directly from outside
    private int id;
    private String name;
    private int unitsConsumed;

    // Constructor - runs when we create a new Consumer
    public Consumer(int id, String name, int unitsConsumed) {
        this.id = id;
        this.name = name;
        this.unitsConsumed = unitsConsumed;
    }

    // Getter methods - to read the private data
    public int getId() { 
        return id; 
    }
    
    public String getName() { 
        return name; 
    }
    
    public int getUnitsConsumed() { 
        return unitsConsumed; 
    }
}