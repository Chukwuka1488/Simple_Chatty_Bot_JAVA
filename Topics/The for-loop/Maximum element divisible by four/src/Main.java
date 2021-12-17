import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int val = scanner.nextInt();
        int max = 0;
        for (int i = 0; i < val; i++) {
            int number = scanner.nextInt();
            if (number % 4 == 0 && number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
}
