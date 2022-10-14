import java.util.ArrayList;
import java.util.Scanner;

/*Create an integer ArrayList object. Check array list is empty or not. If ArrayList is not empty,
add 10 numbers. The numbers must be taken as keyboard inputs. Access each element of
ArrayList and calculate the total print the 10 numbers. */

public class practice1 {

	public static void main(String[] args) 
	{

	  ArrayList<Integer> obj =new ArrayList<>();
    
    
	  //check empty or not
	    if(obj.isEmpty())
	     {
		      System.out.println("object is emphty");
	     }
    
	    //get 10 elements and add to ArrayList
		 for(int i=0 ;i<10 ; i++)
		 {
			 Scanner sc=new Scanner (System.in);
			 System.out.print("Insert Number " +(i+1)+" :");
       int x=sc.nextInt();
       
			 			 obj.add(x);
			
		 }	 

	 //get arrayList obj size and use for printing loop
	 int y= obj.size();
	 int sum = 0;
	 
	 
	 for(int i=0 ;i<y ; i++)
	 {
      //calculating sum
		  sum += obj.get(i);
	 }	 
	   
	   System.out.println(sum);
	   
		
		
	}

}
