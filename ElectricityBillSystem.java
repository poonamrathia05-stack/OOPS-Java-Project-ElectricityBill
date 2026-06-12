//  This class is a blueprint for consumer data
class Consumer {
    //  Private data for security
    private int id;
    private String name;
    private int unitsConsumed;

    //  Constructor to create object
    public Consumer(int id, String name, int unitsConsumed) {
        this.id = id;
        this.name = name;
        this.unitsConsumed = unitsConsumed;
    }

    //  Public methods to get data safely
    public int getId() { return id; }
    public String getName() { return name; }
    public int getUnitsConsumed() { return unitsConsumed; }
}

//  This class has the billing logic
class TariffCalculator {
    
    //  This method takes a Consumer object and returns the bill
    public double generateBill(Consumer consumer) {
        int units = consumer.getUnitsConsumed();
        
        //  Check for wrong input
        if (units < 0) {
            System.out.println("Error: Units cannot be negative");
            return 0;
        }
        
        double billAmount = 0.0;

        //  if-else ladder for slab calculation
        if (units <= 100) {
            billAmount = units * 1.5;
        } else if (units <= 200) {
            billAmount = 100 * 1.5 + (units - 100) * 2.5;
        } else if (units <= 300) {
            billAmount = 100 * 1.5 + 100 * 2.5 + (units - 200) * 4.0;
        } else {
            billAmount = 100 * 1.5 + 100 * 2.5 + 100 * 4.0 + (units - 300) * 6.0;
        }

        double fixedCharges = 125.0; // Fixed cost
        return billAmount + fixedCharges;
    }

    public void displayBill(Consumer consumer) {
        double totalBill = generateBill(consumer);
        System.out.println("Consumer ID: " + consumer.getId());
        System.out.println("Name: " + consumer.getName());
        System.out.println("Units Consumed: " + consumer.getUnitsConsumed());
        System.out.println("Total Electricity Bill: " + totalBill);
    }
}

// main() is the starting point of the program
public class ElectricityBillSystem {
    public static void main(String[] args) {
        // Create a consumer object
        Consumer c1 = new Consumer(101, "Rahul", 250);
        
        // Create calculator object
        TariffCalculator calculator = new TariffCalculator();
        
        // Display the bill
        calculator.displayBill(c1);
    }
}