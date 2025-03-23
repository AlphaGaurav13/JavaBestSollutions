package java319;

public class Rectangle {
  int l,b;

  Rectangle(){
    this.l=0;
    this.b=0;
  }

  Rectangle(int l,int b){
    this.l=l;
    this.b=b;
  }

}

class Square extends Rectangle{
  Square(){
    this.l=0;
    this.b=0;
  }

  Square(int l){
    this.l=l;
    this.b=l;
  }
  
}


// Problem: Rectangle and Square Classes
// In this problem, you are going to design two classes:

// Rectangle Class: Represents a rectangle with length and width.

// It should have two constructors:
// A default constructor that initializes the rectangle's length and width to 0.
// A parameterized constructor that initializes the rectangle with a given length and width.
// Square Class: Represents a square, which is a special case of a rectangle where the length and width are the same.

// It should have two constructors:
// A default constructor that initializes the side of the square to 0.
// A parameterized constructor that initializes the side of the square with a given value. You can call the parameterized constructor of the Rectangle class inside this constructor.
// Task:
// Create the Rectangle and Square classes with the described fields and constructors.
// The Square class should inherit from the Rectangle class.
// In the main method, create objects of both Rectangle and Square, and call a method displayArea() in both classes to calculate and display the area of the shapes.