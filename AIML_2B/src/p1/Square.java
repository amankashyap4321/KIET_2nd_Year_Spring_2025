package p1;

public class Square  implements Shape{
	private int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Square(int side) {
		super();
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

}
