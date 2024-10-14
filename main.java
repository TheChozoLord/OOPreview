package OOP14;
import java.util.Scanner;
import java.util.Random;
static Random rand = new Random();
static Scanner scan = new Scanner(System.in);
public class main {
    public static void main(String[] args) {
        int selection;
        System.out.println("Are you a Priority member?");
        System.out.println("1-Yes 2-No");
        selection = scan.nextInt():
        if(selection == 1){
            priorityMember();
        }
        if(selection == 2){
            normalMember();
        }
        else{
            System.out.println("Please enter a valid input.")
        }
    }
}
