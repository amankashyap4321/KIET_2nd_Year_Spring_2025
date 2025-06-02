package p1;

public class DrawingDemo {
	public static void main(String[] args) {
		Circle c = new Circle(10);
		Rectangle r = new Rectangle(10,20);
		DrawingApp d = new DrawingApp(c);
		d.draw();
	}
}
