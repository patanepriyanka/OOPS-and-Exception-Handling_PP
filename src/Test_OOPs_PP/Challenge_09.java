package Test_OOPs_PP;

public class Challenge_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an interface "Drawable" with a method "draw()". Implement this interface in classes "Circle" and "Rectangle".
		Drawable circle = new Cir();
		Drawable rectangle = new Rect();
		circle.draw();
		rectangle.draw();
		
	}	

}
 

class Cir implements Drawable {
	@Override
	public void draw() {
		System.out.println("Drawing a Circle");
	}
}

class Rect implements Drawable {
	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle");
	}
}
