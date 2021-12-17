import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        int val3 = scanner.nextInt();

        boolean ans1 = val1 > 0;
        boolean ans2 = val2 > 0;
        boolean ans3 = val3 > 0;

//        boolean finalAnsa1 = (ans1 ^ ans2);
//        boolean finalAnsa2 = (ans1 ^ ans3);
//        boolean finalAnsa3 = (ans3 ^ ans2);

        if (ans1 == true && ans2 == false && ans3 == false) {
            System.out.println(true);
        } else if (ans2 == true && ans1 == false && ans3 == false) {
            System.out.println(true);
        } else if (ans3 == true && ans1 == false && ans2 == false) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}