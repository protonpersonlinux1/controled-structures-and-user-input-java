import java.util.Scanner;

class File1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scn.nextLine();
        System.out.println("The string you entered is: " + str);
        
        System.out.print("Enter an integer: ");
        int num = scn.nextInt();
        System.out.println("The integer you entered is: " + num);

        System.out.print("Enter a float: ");
        float fnum = scn.nextFloat();
        System.out.println("The float you entered is: " + fnum);

        scn.close();
    }
}
