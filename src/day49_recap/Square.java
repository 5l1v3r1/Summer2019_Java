package day49_recap;

public class Square extends Shape {
	
	double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	@Override
	protected void Area() {
		double Area = side*side;
		System.out.println("Area of the square is "+Area);
	}
	
	@Override
    protected void Perimeter() {
        double perimeter = side * 4;
        System.out.println("perimeter of the square is "+perimeter);
    }

}
