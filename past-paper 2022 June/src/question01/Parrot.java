package question01;

import question01.Squirrel.CaughtException;

public class Parrot extends Pet{
private String command;
	
	public Parrot(String command) {
		this.command = command;
	}

	public void feed() {
		System.out.println("Feeding the Parrot");
		setPoints(5);
	}

	public void clean() {
		System.out.println("Cleaning the Parrot");
		setPoints(10);
	}

	public void cuddle() {
		System.out.println("Cuddling the Parrot");
		setPoints(15);
	}
	
	public void isCaught(String command) {
		try {
			if(command.equals("Walk")) {
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
