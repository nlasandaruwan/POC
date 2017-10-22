package test;

public class Codelity {

	public static void main(String[] args) {

		Balloon red = new Balloon("Red"); //memory reference 50
		Balloon blue = new Balloon("Blue"); //memory reference 100
		
		swap(red, blue);
		System.out.println("red color 1 ="+red.getColor());
		System.out.println("blue color 2 ="+blue.getColor());
		
		Balloon temp = blue;
		blue = red;
		red=temp;
		
		System.out.println("red color 3 ="+red.getColor());
		System.out.println("blue color 4 ="+blue.getColor());
		
		foo(blue);
		System.out.println("blue color="+blue.getColor());
		
	}

	private static void foo(Balloon balloon) { //baloon=100
		balloon.setColor("Orange"); //baloon=100
		balloon = new Balloon("Green"); //baloon=200
		balloon.setColor("Blue"); //baloon = 200
	}

	//Generic swap method
	public static void swap(Balloon o1, Balloon o2){
		System.out.println("bfor swap 01 :"+o1.getColor());
		System.out.println("bfor swap 02 :"+o2.getColor());
		
		Balloon temp = o1;
		o1=o2;
		o2=temp;
		System.out.println("Aftr swap 01 :"+o1.getColor());
		System.out.println("Aftr swap 02 :"+o2.getColor());
	}
}
