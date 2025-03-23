// Coding Question: Vehicle Rental System
// You are tasked with building a simple Vehicle Rental System where customers can rent different types of vehicles (e.g., cars, bikes, and trucks). Your system should have the following requirements:

// Create a base class Vehicle:

// This class should have a method rent() that outputs a generic message like "Vehicle rented!"
// Create subclasses:

// Car, Bike, and Truck should inherit from the Vehicle class. Each subclass should override the rent() method to provide a more specific message, such as:
// "Car rented!" for Car
// "Bike rented!" for Bike
// "Truck rented!" for Truck
// Demonstrate Polymorphism:

// In the main method, create an array of Vehicle references. The array should contain instances of Car, Bike, and Truck.
// Use a loop to process the rental of each vehicle and call the rent() method dynamically using runtime polymorphism.
// Additional Challenge (Optional):

// Add an additional feature where the rent() method accepts an argument (e.g., int hours for how many hours the vehicle is rented). You can overload the rent() method to handle both cases:
// Without arguments: Rent a vehicle for a default period.
// With arguments: Rent the vehicle for a specified number of hours.
// Requirements:
// Use polymorphism (method overriding) to demonstrate runtime polymorphism, where the rent() method behaves differently depending on the type of the vehicle.
// Use inheritance to share common behavior across different types of vehicles.
// Optionally, use method overloading to provide flexibility in renting vehicles for different durations.
package java319;

class Vehicle {
    public void rent() {
        System.out.println("Vehicle rented!");
    }

    public void rent(int hours) {
        System.out.println("Vehicle rented for " + hours + " hours!");
    }
}

class Car extends Vehicle {
    public void rent() {
        System.out.println("Car rented!");
    }
}

class Bike extends Vehicle {
    public void rent() {
        System.out.println("Bike rented!");
    }
}

class Truck extends Vehicle  {
    public void rent() {
        System.out.println("Truck rented!");
    }
}


class question1 {
    public static void main(String args[]) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car();
        vehicles[1] = new Bike();
        vehicles[2] = new Truck();

        for (Vehicle vehicle : vehicles) {
            vehicle.rent();
        }

        vehicles[0].rent(2);
    }
}