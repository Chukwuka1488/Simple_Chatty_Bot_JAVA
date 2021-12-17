import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        int val3 = scanner.nextInt();

        if (val3 < val1) {
            System.out.println("Deficiency");
        } else if (val3 > val2) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }

    }
}
