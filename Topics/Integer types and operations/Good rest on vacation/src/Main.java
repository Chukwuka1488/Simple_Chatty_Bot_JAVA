import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numberOfDays = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int hotelPerNight = scanner.nextInt();
        
        int totalCosts = numberOfDays * foodCostPerDay + ((numberOfDays - 1) * hotelPerNight) + flightCost * 2;
        System.out.println(totalCosts);
    }
}
