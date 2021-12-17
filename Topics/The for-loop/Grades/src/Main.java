import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number = scanner.nextInt();
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;
        for (int i = 0; i < number; i++) {
            int val = scanner.nextInt();
            if (val == 2) {
                gradeD++;
            } else if (val == 3) {
                gradeC++;
            } else if (val == 4) {
                gradeB++;
            } else if (val == 5) {
                gradeA++;
            }
        }
        System.out.println(gradeD + " " + gradeC + " " + gradeB + " " + gradeA);
    }
}