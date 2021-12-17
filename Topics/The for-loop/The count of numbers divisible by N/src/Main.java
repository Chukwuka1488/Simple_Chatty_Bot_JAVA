import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        int val3 = scanner.nextInt();
        int count = 0;
        for (int i = val1; i <= val2; i++) {
            if (i % val3 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}