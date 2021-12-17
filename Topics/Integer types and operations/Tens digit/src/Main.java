import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] digits = scanner.nextLine().split("");
        if (digits.length > 1) {
            System.out.println(digits[digits.length - 2]);
        } else {
            System.out.println("0");
        }
    }
}