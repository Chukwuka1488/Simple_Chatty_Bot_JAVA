import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();

        int numberOfChairs1 = group1 / 2 + group1 % 2;
        int numberOfChairs2 = group2 / 2 + group2 % 2;
        int numberOfChairs3 = group3 / 2 + group3 % 2;

        int total = numberOfChairs1 + numberOfChairs2 + numberOfChairs3;
        System.out.println(total);
    }
}