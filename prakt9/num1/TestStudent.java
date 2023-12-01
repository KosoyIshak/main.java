package prakt9.num1;
public class TestStudent {
    public static void main(String[] args) {
        Student[] students1 = {
                new Student("Тимур", 4),
                new Student("Антон", 3),
                new Student("Георгий", 1),
                new Student("Александр", 2)
        };
        for (Student i: students1) {
            System.out.println(i);
        }
        for (int i = 0; i < students1.length; i++) {
            Student student_i = students1[i];

            while (i > 0 && students1[i - 1].getIDNumber() > student_i.getIDNumber()) {
                students1[i] = students1[i - 1];
                i--;
            }
            students1[i] = student_i;
        }
        System.out.println();
        for (Student i: students1) {
            System.out.println(i);
        }
    }
}