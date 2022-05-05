import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        System.out.println("Give me a number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n != 5){
            System.out.println("Give me a number");
            n = input.nextInt();
        }
    }
}
