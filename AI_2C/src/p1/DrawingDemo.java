package p1;

public class DrawingDemo {
	public static void main(String[] args) {
			Circle c = new Circle();
			Rectangle r = new Rectangle();
			DrawingApp d = new DrawingApp(r);
			d.draw();
	}
}
