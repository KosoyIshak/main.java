package prakt9.num4;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("Тимур", 5.0));
        students1.add(new Student("Антон", 2.2));
        students1.add(new Student("Георгий", 4.9));
        students1.add(new Student("Александр", 3.5));
        System.out.println(Double.valueOf(students1.get(0).getGPA()).compareTo(Double.valueOf(students1.get(1).getGPA())));
    }
}