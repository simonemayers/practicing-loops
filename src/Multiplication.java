import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
}
