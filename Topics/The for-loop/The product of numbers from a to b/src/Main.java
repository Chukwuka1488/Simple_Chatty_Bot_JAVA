import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        int product = 1;
        for (int i = val1; i < val2; i++) {
            product *= i;
        }
        System.out.println(product);
    }
}