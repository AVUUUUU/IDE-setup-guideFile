import java.util.Scanner;

public class WritingControl  {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        i = scanner.nextInt();

        for(i = 0;  i <= message ; i++){

            message = (i%2==0) ? i+ "is even number" : i+ " is odd number";
            System.out.println(message);

        }



    }
}
