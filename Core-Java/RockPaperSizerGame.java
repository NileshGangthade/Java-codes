import java.util.*;
public class RockPaperSizerGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random random = new Random();
        System.out.println("rock: 0  ");
        System.out.println("paper: 1");
        System.out.println("sizer: 2 ");
        System.out.print("Enter Your Choice: ");
        int user = sc.nextInt();
        int computer = random.nextInt(3);
        if(user == 0){
                    System.out.println("Your choice is Rock");
                }
                else if(user == 1){
                    System.out.println("Your choice is Paper");
                }
                else if(user == 2){
                    System.out.println("Your choice is Sizer");
                }
                else{
                    System.out.println("Invalid Choice");
                }
                if(computer == 0){
                    System.out.println("Computer choice is Rock");
                }
                else if(computer == 1){
                    System.out.println("Computer choice is Paper");
                }
                else if(computer == 2){
                    System.out.println("Computer choice is Sizer");
                }
                else{
                    System.out.println("Invalid Choice");
                }
                if(user == 0 && computer == 0){
                    System.out.println("Draw");
                }
                else if(user == 0 && computer == 1){
                    System.out.println("You lose");
                }
                else if(user == 0 && computer == 2){
                    System.out.println("You win");
                }
                else if(user == 1 && computer == 0){
                    System.out.println("You win");
                }
                else if(user == 1 && computer == 1){
                    System.out.println("You Draw");
                }
                else if(user == 1 && computer == 2){
                    System.out.println("you lose");
                }
                else if(user == 2 && computer == 0){
                    System.out.println("You lose");
                }
                else if(user == 2 && computer == 1){
                    System.out.println("You win");
                }
                else if(user == 2 && computer == 2){
                    System.out.println("Draw");
                }
                else{
                    System.out.println("Invalid Choice");
                }
               
sc.close();;
       
   
     }
}
