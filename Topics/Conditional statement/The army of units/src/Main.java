import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int val = scanner.nextInt();

        if (val < 1) {
            System.out.println("no army");
        } else if (val >= 1 && val <= 19) {
            System.out.println("pack");
        } else if (val >= 20 && val <= 249) {
            System.out.println("throng");
        } else if (val >= 250 && val <= 999) {
            System.out.println("zounds");
        } else if (val >= 1000) {
            System.out.println("legion");
        }
    }
}