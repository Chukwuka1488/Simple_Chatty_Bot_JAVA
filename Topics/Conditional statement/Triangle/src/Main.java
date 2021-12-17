import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        int val3 = scanner.nextInt();

        if (val1 + val2 > val3 && val1 + val3 > val2 && val3 + val2 > val1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}