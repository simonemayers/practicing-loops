import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        System.out.println("Enter a number less than 11");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = n; i <= 11; i++){
            System.out.println(i);
        }
    }
}
