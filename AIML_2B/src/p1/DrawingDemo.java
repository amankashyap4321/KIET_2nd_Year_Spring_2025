package p1;

public class DrawingDemo {
	public static void main(String[] args) {
				Circle c = new Circle();
				Rectangle r = new Rectangle();
				Square s = new Square();
				//The constructor DrawingApp(Square) is undefined
				DrawingApp d = new DrawingApp(s);
				d.draw();
				
	}
}
