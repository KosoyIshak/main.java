package prakt8.num3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A < B) {
            for (int i = A; i <= B; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = A; i >= B; i--) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}