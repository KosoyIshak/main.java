package prakt14.num3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        String text = "Здесь представлены цены в валютах 25.98 USD, 100 RUB, 50.75 EU. Некорректные цены, которые не отображаются 44 ERR, 0.004 EU.";
        String regex = "\\b(\\d+\\.\\d+)\\s(USD|RUB|EU)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            double price = Double.parseDouble(matcher.group(1));
            String currency = matcher.group(2);

            System.out.println(price + " " + currency);
        }
    }
}