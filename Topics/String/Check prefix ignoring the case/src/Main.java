import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        String str = scanner.nextLine().toUpperCase();

        char ignoreCase = ('J');

        char indexValue = str.charAt(0);

        boolean answer = ignoreCase == indexValue;


        System.out.println(answer);
    }
}