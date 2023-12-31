package prakt3;
import java.util.Scanner;
public class num3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сумма и валюта для конвертации (100 USD): ");
        String input_str = scanner.nextLine();
        String[] parts = input_str.split(" ");
        String input_sum = parts[0];
        String input_currency = parts[0].toUpperCase();
        double sum = Double.parseDouble(input_sum);
        System.out.println("Валюта, в которую конвертируем (USD, EUR, RUB): ");
        String output_currency = scanner.nextLine().toUpperCase();
        double output_sum = 0;
        if (input_currency.equals("USD") && output_currency.equals("RUB")) {
            output_sum = sum * 96.0;
        } else if (input_currency.equals("EUR") && output_currency.equals("RUB")) {
            output_sum = sum * 102.0;
        } else if (input_currency.equals("EUR") && output_currency.equals("USD")) {
            output_sum = sum * 1.07;
        } else if (input_currency.equals("RUB") && output_currency.equals("USD")) {
            output_sum = sum / 96.0;
        } else if (input_currency.equals("RUB") && output_currency.equals("EUR")) {
            output_sum = sum / 102.0;
        } else if (input_currency.equals("USD") && output_currency.equals("EUR")) {
            output_sum = sum / 1.07;
        } else {
            System.out.println("Конвертация недоступна.");
        }
        System.out.println(input_sum + " " + input_currency + " равно " + output_sum + " " + output_currency);
        scanner.close();
    }
}