import java.util.Scanner;
public class File2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float fnum = scn.nextFloat();
        if(fnum > 10) {
            System.out.println("The number is greater than 10.");
        } else {
            System.out.println("Sorry i feel bad");
        }
        scn.close();
    }

}
