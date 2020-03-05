package day49_recap;

/*
 WarmUp: 
    1. create a class called Shape
            Actions: Area(), perimeter(), capacity()
    2. create sub classes of Shape:
                        Circle
                        rectangle
                        square
                        cylinder
        and give the instance variables that are needed to calculate the Area, perimeter, and Volume of those shapes
    3. override super class' Area(), perimeter(), capacity() methods to the sub classes
 */

public class Shape {
	
	protected void Area() {
		System.out.println("area is 0");
	}
	
	protected void Perimeter() {
		System.out.println("perimeter is 0");
	}
	
	protected void Capacity() {
		System.out.println("volume is 0");
	}
	
	public static void main(String[] args) {
		Rectangle obj = new Rectangle(30, 20);
		obj.Area();
		obj.Capacity(); //0 we didn'n write its method because
		obj.Perimeter();
		
		Square obj2 = new Square(35);
		obj2.Area();
		obj2.Perimeter();
		
		Circle obj3 = new Circle(4);
		obj3.Area();
		obj3.Perimeter();
		
		Cylinder obj4 = new Cylinder(3, 6);
		obj4.Area();
		obj4.Perimeter();
		
	}

}
