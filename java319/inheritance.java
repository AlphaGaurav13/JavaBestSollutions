package java319;

class Product{
  String name;
  int productid;
  double price;


  Product(){
    name = "Unknown";
    productid = -1;
    price = 0.0;
  }

  Product(String name, int productid, double price){
    this.name = name;
    this.productid = productid;
    this.price = price;
  }

  void displayProductDetails(){
    System.out.println("Product Name: " + name);
    System.out.println("Product ID: " + productid);
    System.out.println("Price: $" + price);
  }
}
public class inheritance {

  public static void main(String args[]) {
    Product p1 = new Product("Laptop", 123, 50000.0);
    p1.displayProductDetails();
  }
  
}


//Inheritance: means we are creating a child class and inheriting the properties of another class.


// when we create a object it is stored in heap memory --> JVM garbage collector will take care of the memory. --> stack memory
// Problem: The Product Class (Simplified)

// Create a Java class called Product that represents a product sold in a store. The Product class should have the following attributes (instance variables):

// name (String): The name of the product.
// productId (int): A unique identifier for the product.
// price (double): The price of the product.
// Requirements:

// Default Constructor: Create a default constructor (no arguments) that initializes the name to "Unknown", productId to -1, and price to 0.0.

// Parameterized Constructor: Create a parameterized constructor that takes the name, productId, and price as arguments and initializes the corresponding instance variables.

// displayProductDetails() Method: Create a method called displayProductDetails() that prints the details of the product in the following format:

// Product Name: [name]
// Product ID: [productId]
// Price: $[price]
// Main Method (Testing):

// In the main method of a separate class (e.g., ProductTest), do the following:

// Create a Product object using the default constructor.
// Create a Product object using the parameterized constructor (e.g., "Laptop", 12345, 999.99).
// Call displayProductDetails() on both objects to verify their values.

