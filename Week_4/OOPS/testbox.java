package theproject;

public class testbox {

	public static void main(String[] args) {
		box b = new box(6,3);
		System.out.println("Area:"+ b.area());
		box3d b3 = new box3d(2,3,5);
		System.out.println("Volume:"+ b3.volume());
	}

}
