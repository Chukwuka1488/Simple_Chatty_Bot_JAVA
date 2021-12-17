import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();
        int group4 = scanner.nextInt();

        int numberOfChairs1 = --group1;
        int numberOfChairs2 = --group2;
        int numberOfChairs3 = --group3;
        int numberOfChairs4 = --group4;

        System.out.print(numberOfChairs1);
        System.out.print(" ");
        System.out.print(numberOfChairs2);
        System.out.print(" ");
        System.out.print(numberOfChairs3);
        System.out.print(" ");
        System.out.print(numberOfChairs4);
    }
}