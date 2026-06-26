package theproject;

public class box {
	protected int length;
	protected int breadth;
	public box(int length , int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public int area() {
		return length * breadth;
	}

}
