import java.util.Scanner;

public class WritingControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int limit = scanner.nextInt();  // Read the number from the user

        for (int i = 0; i <= limit; i++) {
    
            String message = (i % 2 == 0) ? i + " is an even number" : i + " is an odd number";
            
            System.out.println(message);
        }

        scanner.close();  
    }
}
