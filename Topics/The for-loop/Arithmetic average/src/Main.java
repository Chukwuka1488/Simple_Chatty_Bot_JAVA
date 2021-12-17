import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();

        int count = 0;
        double sum = 0;
        for (int i = val1; i <= val2; i++) {
            if (i % 3 == 0) {
                sum += i;
                count += 1;
            }
        }
        System.out.println(sum / count);
    }
}