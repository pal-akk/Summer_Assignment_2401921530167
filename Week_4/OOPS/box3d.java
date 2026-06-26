package theproject;

public class box3d extends box{
	private int height;
	public box3d(int length , int breadth , int height) {
		super(length , breadth);
		this.height = height;
	}
	public int volume() {
		return length * breadth * height;
	}
}
