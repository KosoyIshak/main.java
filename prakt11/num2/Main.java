package prakt11.num2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("Текущая дата и время: " + currentDate);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату: ");
        String userInput = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        try {
            Date userDate = dateFormat.parse(userInput);
            System.out.println("Введенная дата и время: " + userDate);
            if (currentDate.before(userDate)) {
                System.out.println("Введенная дата находится в будущем.");
            } else if (currentDate.after(userDate)) {
                System.out.println("Введенная дата находится в прошлом.");
            } else {
                System.out.println("Введенная дата совпадает с текущей датой.");
            }
        } catch (ParseException e) {
            System.out.println("Некорректный формат даты.");
        }
        scanner.close();
    }
}