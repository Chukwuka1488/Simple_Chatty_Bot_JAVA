import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number = scanner.nextInt();
        int number1 = number / 1000;
        int number2 = (number - number1 * 1000) / 100;
        int number3 = (number - number1 * 1000 - number2 * 100) / 10;
        int number4 = (number - number1 * 1000 - number2 * 100 - number3 * 10);
        int ans1 = number1 * 10 + number2;
        int ans2 = number4 * 10 + number3;
        if (ans1 == ans2) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }
    }
}