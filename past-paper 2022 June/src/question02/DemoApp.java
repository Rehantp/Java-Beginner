package question02;

import java.util.ArrayList;

public class DemoApp {

	public static void main(String[] args) {

		TCalculation<Integer> intArr = new TCalculation<Integer>();
		intArr.append(10);
		intArr.append(20);
		intArr.append(30);
		System.out.println("Average : " + intArr.average());
		
		TCalculation<Double> doubleArr = new TCalculation<Double>();
		doubleArr.append(30.0);
		doubleArr.append(40.0);
		doubleArr.append(50.0);
		System.out.println("Average : " + doubleArr.average());
	}
}
