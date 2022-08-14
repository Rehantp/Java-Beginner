/ Shape_example.java
// Lecture 02 - Slide Deck
// Shape Class Inheritence Example
// IT2030 - Object Oriented Programming
// (c) SLIIT 2022

class Shape {
    protected String name;
    public Shape() {};
    public Shape (String tname) {
	    name = tname;
    }
    public void print() {
	    System.out.println("\nThen name of shape is: " + name);
    }		 
    public int area(){ return 0;}
}
class Rectangle extends Shape {
       
    protected int width;
    protected int height;
    
    public Rectangle (String tname, int w, int h) {
        super(tname);
	    width = w;
        height = h;
    }

    public int area() {
	   return width * height;
    }

    public void print() {
	    super.print();
	    System.out.println("\nThe height of rectangle is: " + height);
        System.out.println("\nThe width of rectangle is: " + width);
    }
}
class Circle extends Shape {
    protected int radius;
		
    public Circle (String tname, int r) {
        super(tname);
        radius = r;
    }
    public int area() {
	    return (int) (22/7.0 * radius* radius);
    }
    public void print() {
	    super.print();
        System.out.println("\nThe radius of circle is: " + radius);
    }
}

class Main {	
    public static void main(String args[]) {
	    Rectangle R = new Rectangle("Rectangle", 4 , 6);
	    Circle C = new Circle("Circle", 3 );

	    R.print();
	    System.out.println("\nThe area of rectangle is: " + R.area());

	    System.out.println("\n\n*****************************");

	    C.print();
	    System.out.println("\nThe area of circle is: " + C.area());
    }
