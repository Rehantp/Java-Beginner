/*
   Write a program to display the day of the week when you provide the value.
   Expected Output
   Value of the day : 4
   Day of the week : Thursday
   Good Bye!   
   
You must use “switch – case” statement.
Display “Invalid Day” when some invalid value is provided.
*/
import java.util.Scanner;

public class switchprac {

	   public static void main(String[] args)
	   {
		   
		   int num;
		   
		   Scanner sc = new Scanner(System.in);
		   System.out.print("Value of the day : ");
		   num = sc.nextInt();
		   
		 
		   switch (num) 
		   {
		     case 1:
		       System.out.println("Day of the week : Monday");
		       System.out.println("Good Bye!");
		       break;
		     case 2:
		       System.out.println("Day of the week : Tuesday");
		       System.out.println("Good Bye!");
		       break;
		     case 3:
		       System.out.println("Day of the week : Wednesday");
		       System.out.println("Good Bye!");
		       break;
		     case 4:
		       System.out.println("Day of the week : Thursday");
		       System.out.println("Good Bye!");
		       break;
		     case 5:
		       System.out.println("Day of the week : Friday");
		       System.out.println("Good Bye!");
		       break;
		     case 6:
		       System.out.println("Day of the week : Saturday");
		       System.out.println("Good Bye!");
		       break;
		     case 7:
		       System.out.println("Day of the week : Sunday");
		       System.out.println("Good Bye!");
		       break;
		   }
		   
		   
	   }
	
	
}
