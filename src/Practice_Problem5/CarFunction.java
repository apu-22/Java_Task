package Practice_Problem5;


class Cr {
    // Attributes (Fields)
    private String owner;
    private String brand;
    private String serialNumber;
    private boolean isRunning;
    private double fuelLevel;

    // Constructor
    public Cr(String owner, String brand, String serialNumber, double fuelLevel) {
        this.owner = owner;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuelLevel = fuelLevel;
        this.isRunning = false; // Initially off
    }

    // Method to start the car
    public void start() {
        if (fuelLevel > 0) {
            isRunning = true;
            System.out.println("Car started.");
        } else {
            System.out.println("Cannot start. Fuel tank is empty.");
        }
    }

    // Method to stop the car
    public void stop() {
        isRunning = false;
        System.out.println("Car stopped.");
    }

    // Method to check fuel level
    public void checkFuel() {
        System.out.println("Fuel level: " + fuelLevel + " liters");
    }

    // Method to refuel the car
    public void refuel(double liters) {
        fuelLevel += liters;
        System.out.println("Car refueled by " + liters + " liters.");
    }

    // Optional: Display car info
    public void displayInfo() {
        System.out.println("Owner: " + owner);
        System.out.println("Brand: " + brand);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Fuel Level: " + fuelLevel + " liters");
        System.out.println("Running: " + (isRunning ? "Yes" : "No"));
    }
}


public class CarFunction {
    public static void main(String[] args) {
        Cr myCar = new Cr("Alice", "Toyota", "SN12345", 10.5);

        myCar.displayInfo();
        myCar.checkFuel();
        myCar.start();
        myCar.stop();
        myCar.refuel(5);
        myCar.checkFuel();
    }
}
