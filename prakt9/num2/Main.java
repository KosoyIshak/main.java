package prakt9.num2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("Тимур", 5.0));
        students1.add(new Student("Антон", 2.2));
        students1.add(new Student("Георгий", 4.9));
        students1.add(new Student("Александр", 3.5));
        for (Student i: students1) {
            System.out.println(i);
        }
        Collections.sort(students1, new SortingStudentsByGPA());
        System.out.println();
        for (Student i: students1) {
            System.out.println(i);
        }
    }
}