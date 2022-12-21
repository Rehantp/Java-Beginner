package question01;

public class Demo {

	public static void main(String[] args) {
		
		Pet squirrel1 = new Squirrel("Run3");
		squirrel1.cuddle();
		squirrel1.feed();
		squirrel1.GetTotalPoints();
		
		Pet squirrel2 = new Squirrel("Run5");
		squirrel2.cuddle();
		squirrel2.feed();
		squirrel2.GetTotalPoints();
		
		Pet garfield = new Cat();
		garfield.clean();
		garfield.cuddle();
		garfield.feed();
		garfield.GetTotalPoints();
		
		Pet parrot1 = new Parrot("Walk");
		parrot1.feed();
		parrot1.GetTotalPoints();
	}

}
