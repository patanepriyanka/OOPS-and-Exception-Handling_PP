package Test_OOPs_PP;

public class Challenge_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Implement an abstract class "Shape" with an abstract method "getArea()". Create subclasses "Rectangle" and "Circle" and implement "getArea()" for each.
		Shape rectangle = new Rectangle(5, 3);
		Shape circle = new Circle(4);
		System.out.println("rectangle Area: " + rectangle.getArea());
		System.out.println("Circle Area: " + circle.getArea());
	}

}

abstract class Shape {
	abstract double getArea();
}

class Rectangle extends Shape {
	double length;
	double width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	double getArea() {
		return length * width;
	}
}

class Circle extends Shape {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double getArea() {
		return Math.PI * radius * radius;
	}
}

