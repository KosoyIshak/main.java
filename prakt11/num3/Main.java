package prakt11.num3;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
public class Main {
    public static void main(String[] args) {
        try {
            Date birthDate = new SimpleDateFormat("dd.MM.yyyy").parse("15.05.2018");
            Student student = new Student("Тимур", "Ванин", "Информатика", 2, "Группа1", 2.0, birthDate);
            System.out.println(student.getDate("dd.MM.yy"));
            System.out.println(student.getDate("dd MMMM yyyy"));
        } catch (ParseException e) {
            System.out.println("Некорректный формат даты.");
        }

    }
}