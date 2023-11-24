package prak1.num7;
import java.util.Scanner;
class Main {
    public static double fact(int f){
        double factorial_result = 1;
        for (int i = 1; i <= f; i++) {
            factorial_result *= i;
        }
        return factorial_result;
    }
    public static void main(String[] args) {
        System.out.print("Введите число, для которого нужно посчитать факториал: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(fact(i));
        sc.close();
    }
}