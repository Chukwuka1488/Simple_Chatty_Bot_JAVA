import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number = scanner.nextInt();
        int shipped = 0;
        int fixed = 0;
        int rejected = 0;
        for (int i = 0; i < number; i++) {
            int val = scanner.nextInt();
            if (val == 0) {
                shipped++;
            } else if (val == 1) {
                fixed++;
            } else if (val == -1) {
                rejected++;
            }
        }
        System.out.println(shipped + " " + fixed + " " + rejected);
    }
}