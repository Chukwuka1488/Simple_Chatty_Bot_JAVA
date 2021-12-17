import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        long squirrels = scanner.nextLong();
        long nuts = scanner.nextLong();
        
        long solution = nuts / squirrels;
        
        System.out.println(solution);
        
    }
}
