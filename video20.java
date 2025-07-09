import java.util.Scanner;

public class video20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int computer = (int)(Math.random() * 3); // 0=Rock, 1=Paper, 2=Scissors

        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissors:");
        int user = sc.nextInt();

        if (user == computer) {
            System.out.println("It's a tie!");
        } else if ((user == 0 && computer == 2) || 
                   (user == 1 && computer == 0) || 
                   (user == 2 && computer == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

        System.out.println("Computer chose: " + computer);
    }
}
// rock paper scissor game


