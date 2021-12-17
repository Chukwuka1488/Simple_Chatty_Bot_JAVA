import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < number; i++) {
            int val = scanner.nextInt();
            if (val % 6 == 0) {
                sum += val;
            }
        }
        System.out.println(sum);
    }
}