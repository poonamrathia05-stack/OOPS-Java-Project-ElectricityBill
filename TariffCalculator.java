// File: TariffCalculator.java
// This class calculates bill using if-else slabs

public class TariffCalculator {
    
    // Method to calculate bill amount
    public double generateBill(Consumer consumer) {
        int units = consumer.getUnitsConsumed();
        
        // Check for invalid input
        if (units < 0) {
            System.out.println("Error: Units cannot be negative");
            return 0;
        }
        
        double billAmount = 0.0;

        // Slab 1: 0-100 units @ ₹1.5
        if (units <= 100) {
            billAmount = units * 1.5;
        } 
        // Slab 2: 101-200 units @ ₹2.5
        else if (units <= 200) {
            billAmount = 100 * 1.5 + (units - 100) * 2.5;
        } 
        // Slab 3: 201-300 units @ ₹4.0
        else if (units <= 300) {
            billAmount = 100 * 1.5 + 100 * 2.5 + (units - 200) * 4.0;
        } 
        // Slab 4: Above 300 units @ ₹6.0
        else {
            billAmount = 100 * 1.5 + 100 * 2.5 + 100 * 4.0 + (units - 300) * 6.0;
        }

        // Add fixed charge
        double fixedCharges = 125.0;
        return billAmount + fixedCharges;
    }

    // Method to print the final bill
    public void displayBill(Consumer consumer) {
        double totalBill = generateBill(consumer);
        System.out.println("Consumer ID: " + consumer.getId());
        System.out.println("Name: " + consumer.getName());
        System.out.println("Units Consumed: " + consumer.getUnitsConsumed());
        System.out.println("Total Electricity Bill: " + totalBill);
    }
}
