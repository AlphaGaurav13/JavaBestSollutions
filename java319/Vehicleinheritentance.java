package java319;
class vehicle{
  public String model;
  public int Year;
  vehicle(){
  model="";
  Year=0;
  }
  vehicle(String model,int Year){
  this.model=model;
  this.Year=Year;
  }
  public void show(){
  System.out.println("Model: "+model);
  System.out.println("Year: "+Year);
  }
  }
  class car extends vehicle{
  int numdoors;
  car(int numdoors,String model,int Year){
  super(model,Year);
  this.numdoors=numdoors;
  }
  
  @Override
  public void show() {
  super.show();
  System.out.println("Doors: "+numdoors);
  }
  }
  class truck extends vehicle{
  double load;
  truck(double load,String model,int Year){
  super(model, Year);
  this.load=load;
  }
  
  @Override
  public void show() {
  super.show();
  System.out.println("Load: "+load+" Capacity");
  }
  }
  
  public class Vehicleinheritentance {
  public static void main(String[] args) {
  vehicle obj1=new vehicle("Toyota",2025);
  car obj2=new car(4,"Rolls Royce Ghost",2024);
  truck obj3=new truck(10.5,"Tata",2025);
  
  obj1.show();
  obj2.show();
  obj3.show();
  }
  }



// Problem: Vehicle Hierarchy
// You are going to design a Vehicle hierarchy with the following classes:

// Vehicle (Parent Class): This will be the base class for all vehicles. It should have the following properties:

// A String field called model (for the vehicle's model).
// An int field called year (for the year of manufacture).
// A method displayInfo() that prints the model and year of the vehicle.
// Car (Child Class): This class will inherit from the Vehicle class. It should have:

// An additional int field called numDoors (for the number of doors the car has).
// A method displayInfo() that overrides the one in the Vehicle class and also prints the number of doors.
// Truck (Child Class): This class will also inherit from the Vehicle class. It should have:

// An additional double field called loadCapacity (for the load capacity of the truck in tons).
// A method displayInfo() that overrides the one in the Vehicle class and also prints the load capacity.
// Task:
// Create the Vehicle, Car, and Truck classes with the described fields and methods.
// Create objects of Car and Truck in the main method and call their displayInfo() methods to test inheritance and method overriding.

// sa
// Sahil
// 8:22 PM
// Vehicle: Model: Toyota, Year: 2020
// Car: Model: Honda Civic, Year: 2022, Doors: 4
// Truck: Model: Volvo, Year: 2019, Load Capacity: 10.5 tons