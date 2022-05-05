import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n != 0){
            if(n<0){
                System.out.println("Number must be a positive number");
            } else {
                System.out.println("Number is " + n);
            }
            System.out.println("Enter a number: ");
            n = input.nextInt();
        }
    }
}
