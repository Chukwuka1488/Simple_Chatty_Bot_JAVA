import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int val1 = scanner.nextInt();
        boolean bol = scanner.nextBoolean();
        boolean ansa = val1 >= 10 && val1 <= 20 && bol == false;
        boolean ansb = val1 >= 15 && val1 <= 25 && bol == true;
        boolean ans = ansa || ansb;
        System.out.println(ans);
    }
}