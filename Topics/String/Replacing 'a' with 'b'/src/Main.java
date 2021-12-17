import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str1 = scanner.next();

        String subStr1 = str1.replace('a', 'b');
        System.out.println(subStr1);
    }
}