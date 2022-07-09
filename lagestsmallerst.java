import java.util.Scanner;

/*Write	a	program	to	input	3	integers	and	print	the	largest	ad	
the	smallest	of	the	3	numbers	entered.*/

public class lagestsmallerst {

    public static void main(String[] args) {

        System.out.print("Insert Number 1 : ");
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();

        System.out.print("Insert Number 2 : ");
        int num2 = num.nextInt();

        System.out.print("Insert Number 3 : ");
        int num3 = num.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Largest Number is " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Largest Number is " + num2);
        } else if (num3 >= num2 && num3 >= num1) {
            System.out.println("Largest Number is " + num3);
        }

        if (num1 <= num2 && num1 <= num3) {
            System.out.println("Smallest Number is " + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("Smallest Number is " + num2);
        } else if (num3 <= num2 && num3 <= num1) {
            System.out.println("Smallest Number is " + num3);
        }

    }
}
