package theproject;

public class Outer {
	void display() {
		
	}
	public class Inner{
		void display() {
			
		}
	}

	public static void main(String[] args) {
		Outer o = new Outer();
		o.display();
		Outer.Inner i = o.new Inner();
		i.display();

	}

}
