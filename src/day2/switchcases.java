package day2;
import java.util.Scanner;

public class switchcases {
    public static void main(String[]args){
        int age;
        System.out.println("Enter Your Age ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("You r going to become an Adult");
                break;

            case 23:
                System.out.println("You r going to join a job!");
                break;

            case 68:
                System.out.println("You r going to get retired!");
                break;

            default:
                System.out.println("Enjoy your Life!");


        }
    }
}
