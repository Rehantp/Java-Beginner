package question01;

public class Cat extends Pet{
	
	public void feed() {
		System.out.println("Feeding the Cat");
		setPoints(5);
	}

	public void clean() {
		System.out.println("Cleaning the Cat");
		setPoints(10);
	}

	public void cuddle() {
		System.out.println("Cuddling the Cat");
		setPoints(15);
	}
	
	public void GetTotalPoints() {
		System.out.println("Total point is " + getPoints() + "\n");
	}
}
