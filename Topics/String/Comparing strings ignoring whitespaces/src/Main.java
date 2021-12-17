import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str1 = scanner.nextLine().strip();
        String str2 = scanner.nextLine().strip();

        boolean check = str1.strip().replace(" ","").equals(str2.strip().replace(" ",""));
        System.out.println(check);
    }
}