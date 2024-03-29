package question;

public class Thermos {
	  private double availableVolume;
	    private String brand;
	    private String liquid;

	    // Constructor to initialize the thermos
	    public Thermos() {
	        availableVolume = 0; // Initially empty
	        brand = "Godrej";
	        liquid = "";
	    }

	    // Method to add liquid into thermos
	    public void addLiquid(double volume, String liquidType) {
	        if (availableVolume + volume <= 1.0) { // Capacity of 1 litre
	            availableVolume += volume;
	            liquid = liquidType;
	            System.out.println(volume + " litres of " + liquidType + " added to the thermos.");
	        } else {
	            System.out.println("Thermos is full. Cannot add more liquid.");
	        }
	    }

	    // Method to display thermos details
	    public void displayDetails() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Available Volume: " + availableVolume + " litres");
	        System.out.println("Liquid: " + liquid);
	    }
	}

	



	

}
