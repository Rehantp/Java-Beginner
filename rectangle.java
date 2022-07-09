import java.util.Scanner;

public class rectangle {

    public static void main(String[] args) {

        System.out.print("Insert Legnth : ");
        Scanner rec = new Scanner(System.in);
        int len = rec.nextInt();

        System.out.print("Insert Width : ");
        int wid = rec.nextInt();

        System.out.println("Perimeter : " + (len + wid));

    }

}
