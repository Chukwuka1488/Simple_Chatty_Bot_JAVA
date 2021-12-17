import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        for (int i = 1; i <= 1000; i++) {
            double aa = a * Math.pow(i, 3);
            double bb = b * Math.pow(i, 2);
            int cc = c * i;
            if (aa + bb + cc + d == 0) {
                System.out.println(i);
            }
        }


    }
}