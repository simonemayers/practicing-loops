import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) {
        System.out.println("Do you want to take a break?");
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        while(!answer.equals("yes")){
            System.out.println("Do you want to take a break?");
            answer = input.next();
        }

    }
}




