package day49_recap;

/*
  Area of the cylinder: (2 * 3.14 * radius * radius) + height(2*3.14*radius)
  volume of cylinder: 3.14 * radius * radius * height
 */

public class Cylinder extends Shape{
	
	final double pi = 3.14;
	double radius;
	double height;
	
	public Cylinder(double radius, double height) {
		this.height = height;
		this.radius = radius;
	}
	
	@Override
	protected void Area() {
		double Area = (2 * 3.14 * radius * radius)+(height*pi*radius);
		System.out.println("Area of the cylinder is "+Area);
	}
	
	@Override
    protected void Perimeter() {
        double perimeter = (2*pi*radius)*2;
        System.out.println("perimeter of the cylinder is "+perimeter);
    }

}
