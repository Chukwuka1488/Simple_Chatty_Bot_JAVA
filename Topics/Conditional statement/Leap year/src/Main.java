import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int val = scanner.nextInt();

        if (((val % 4 == 0) && (val % 100 != 0)) || (val % 400 == 0)) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}