import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        
        int solution = ((n + 1) * n + 2) * n + 3;
        
        System.out.println(solution);
    }
}
