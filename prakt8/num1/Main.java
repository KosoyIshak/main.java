package prakt8.num1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        for (int i = 1; i <= n; ) {
            for (int j = 1; j <= k; j++) {
                if (i <= n) {
                    System.out.print(k + " ");
                    i++;
                } else {
                    break;
                }
            }
            k++;
        }
        sc.close();
    }
}