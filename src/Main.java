import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int val1 = sc.nextInt();
        System.out.println("Введите второе число: ");
        int val2 = sc.nextInt();
        System.out.println("Введите третье число: ");
        int val3 = sc.nextInt();
        int SumOfTheTwoVal = sum(val1, val2, val3);
        System.out.println("Результат чисел = " + SumOfTheTwoVal);

    }
    public static int sum(int val1, int val2, int val3) {
        return val1 + val2 + val3;
    }
}