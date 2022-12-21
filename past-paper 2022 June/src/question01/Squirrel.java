package question01;

public class Squirrel extends Pet{
	private String command;
	
	public Squirrel(String command) {
		this.command = command;
	}

	public void feed() {
		System.out.println("Feeding the Squirrel");
		setPoints(5);
	}

	public void clean() {
		System.out.println("Cleaning the Squirrel");
		setPoints(10);
	}

	public void cuddle() {
		System.out.println("Cuddling the Squirrel");
		setPoints(15);
	}
	
	public void isCaught(String command) {
		try {
			if(command.equals("Run5")) {
				throw new CaughtException("Caught");
			}
			else {
				System.out.println("Did not caught");
				System.out.println("Total point is " + getPoints() + "\n");
			}
			
		} catch (CaughtException e) {
			e.printStackTrace();
			System.out.print("\n");
		}
	}
	
	class CaughtException extends Exception {
		CaughtException(String message) {
			super(message);
		}
	}
	
	public void GetTotalPoints() {
		isCaught(command);
	}
}
