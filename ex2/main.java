import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        ArrayList<student> StudentList = new ArrayList<>();

        student s1 = new student(1, "Amal", 3.1f);
        student s2 = new student(2, "kmal", 3.6f);
        student s3 = new student(3, "vmal", 3.3f);

        StudentList.add(s1);
        StudentList.add(s2);
        StudentList.add(s3);

        for (student s : StudentList) {
            s.getter();
            System.out.println("");

        }
    }

}
