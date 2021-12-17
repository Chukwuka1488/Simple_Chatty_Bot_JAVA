import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        int val3 = scanner.nextInt();


        if (val1 >= val2 && val1 <= val3) {
            System.out.println(true);
        } else if (val1 <= val2 && val1 >= val3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}