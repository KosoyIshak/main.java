package prakt1;
import java.util.Arrays;
import java.util.Scanner;
import java.util.IntSummaryStatistics;
class num4 {
    public static void main(String[] args) {
        System.out.print("Введите длину массива: ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        IntSummaryStatistics stat = Arrays.stream(arr).summaryStatistics();
        int min = stat.getMin();
        int max = stat.getMax();
        System.out.println("Минимальный символ: " + min);
        System.out.println("Максимальный символ: " + max);
        sc.close();
    }
}