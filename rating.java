import java.util.Scanner;
public class rating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a rating (1-5): ");
        int rating = sc.nextInt();

        switch(rating) {
            case 1:
                System.out.println("Very Bad");
                break;
            case 2:
                System.out.println("Bad");
                break;
            case 3:
                System.out.println("Average");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 5:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Invalid rating. Please enter a number between 1 and 5.");
         }
        sc.close();
    }
}

    
