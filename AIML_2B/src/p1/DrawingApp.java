package p1;

public class DrawingApp {
	//private Circle c;
	private Shape c;

//	public DrawingApp(Circle c) {
//		super();
//		this.c = c;
//	}
	public DrawingApp(Shape c) {
		super();
		this.c = c;
	}

	public void draw() {
		System.out.println(c);
	}
}
