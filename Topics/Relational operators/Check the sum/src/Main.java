import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        int val3 = scanner.nextInt();
        int pair1 = val1 + val2;
        int pair2 = val1 + val3;
        int pair3 = val2 + val3;
        // int tot = val1 + val2 + val3;
        boolean ans = pair1 == 20 || pair2 == 20 || pair3 == 20;
        System.out.println(ans);
    }
}
