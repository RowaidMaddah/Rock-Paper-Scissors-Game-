import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors{
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("***********");
        System.out.println("Welcome to rock, paper, scissors! ");
        System.out.println("***********");

        ArrayList<String> moves = new ArrayList<>();

        moves.add("Rock");
        moves.add("Paper");
        moves.add("Scissors");

        while (true){

            Random random = new Random();

            int randomIndex = random.nextInt(moves.size());

            String AImove = moves.get(randomIndex).toLowerCase();

            System.out.println("Pick your move: ");
            System.out.println(moves);
            String move = scanner.nextLine().toLowerCase();

            System.out.println("You picked: " + move);
            System.out.println("Your opponent picked: " + AImove);

            if ("rock".equals(AImove)){
                if ("rock".equals(move)){
                    System.out.println("Tie!");
                }
                if ("paper".equals(move)){
                    System.out.println("You win!");
                }
                if ("scissors".equals(move)){
                    System.out.println("You lose!");
                }
            }
            
            if ("paper".equals(AImove)){
                if ("paper".equals(move)){
                    System.out.println("Tie!");
                }
                if ("scissors".equals(move)){
                    System.out.println("You win!");
                }
                if ("rock".equals(move)){
                    System.out.println("You lose!");
                }
            }

            if ("scissors".equals(AImove)){
                if ("scissors".equals(move)){
                    System.out.println("Tie!");
                }
                if ("rock".equals(move)){
                    System.out.println("You win!");
                }
                if ("paper".equals(move)){
                    System.out.println("You lose!");
                }
            }

            System.out.print("Would you like to play again?: ");

            String choice = scanner.nextLine().toLowerCase();
            
            if ("yes".equals(choice)){
            }
            if ("no".equals(choice)){
                System.out.println("Thanks for playing, visit again! ");
                break;
            }

        }

    }
}
