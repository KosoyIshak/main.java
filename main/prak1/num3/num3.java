package prak1.num3;
class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int summa = 0;
        for (int j : array) {
            summa = summa + j;
        }
        System.out.println(summa);
        System.out.println(summa/array.length);

    }
}
