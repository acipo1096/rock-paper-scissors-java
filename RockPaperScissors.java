import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Computer comp = new Computer();
        String computerChoice = comp.computerChoice();
        System.out.println("Let's play Rock, Paper, Scissors!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        String yourPick = scanner.nextLine();
        String yourChoice = yourPick.substring(0, 1).toUpperCase() + yourPick.substring(1);
        System.out.println("You chose: "+ yourChoice);
        System.out.println("Computer chose: "+ computerChoice);

        // You win!
        if ((yourChoice.equals("Rock") && computerChoice.equals("Scissors")) || (yourChoice.equals("Paper") && computerChoice.equals("Rock")) || (yourChoice.equals("Scissors") && computerChoice.equals("Paper"))){
            System.out.println("Congratulations! You win!!");
        }
        // You lose :(
        else if ((computerChoice.equals("Rock") && yourChoice.equals("Paper")) || computerChoice.equals("Paper") && yourChoice.equals("Rock") || computerChoice.equals("Scissors") && yourChoice.equals("Paper")){
            System.out.println("Sorry! You lose!");
        }
        else {
            System.out.println("It's a draw! Try again!");
        }

        scanner.close();
    }
}
