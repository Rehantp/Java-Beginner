package question02;

import java.util.ArrayList;

public class TCalculation <T extends Number> {
	
	ArrayList<T> numList = new ArrayList<T>();

	void append(T value) {
		this.numList.add(value);
	}
	
	double average() {
		int total = 0;
		double avg;
		
		for (T value : numList) {
			total += value.doubleValue();
		}
		
		avg=total/numList.size();
		
		return avg;
	}
}
