package day49_recap;

public class Circle extends Shape {
	
	double radius;
	final double pi = 3.14;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	protected void Area() {
		double Area = pi*radius*radius;
		System.out.println("Area of the circle is "+Area);
	}
	
	@Override
    protected void Perimeter() {
        double perimeter = 2*pi*radius;
        System.out.println("perimeter of the circle is "+perimeter);
    }

}
