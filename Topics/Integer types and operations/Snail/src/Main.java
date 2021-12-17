import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int height = scanner.nextInt();
        int feetUpPerDay = scanner.nextInt();
        int feetDownPerNight = scanner.nextInt();

        int start = 0;
        int numberOfDays = 0;
        while (start < height) {
            int dayPosition = start + feetUpPerDay;

            if (dayPosition >= height) {
                numberOfDays++;
                break;
            }
            int nightPosition = dayPosition - feetDownPerNight;
            start = nightPosition;
            numberOfDays++;

        }
        System.out.println(numberOfDays);
    }
}