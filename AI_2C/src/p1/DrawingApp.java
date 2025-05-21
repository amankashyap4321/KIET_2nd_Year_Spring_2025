package p1;

public class DrawingApp {
	private Shape c;

	public DrawingApp(Shape c) {
		super();
		this.c = c;
	}

	public void draw() {
		System.out.println(c);
	}
}
