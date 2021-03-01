import java.util.Scanner;
import java.util.Random;

public class rollDice{
   public static void main(String[] args) {
     //declarations
     Random randomNumber = new Random();
     Scanner keyboard = new Scanner(System.in);
     int dice1, dice2, totalDice;
     int userGuess;
     
     for (int count=1; count <=3; count++){
        // get users guess
           System.out.print(" Guess the sum of two dice: ");
              userGuess = keyboard.nextInt();
              while(( userGuess < 2) || (userGuess > 12)){
              System.out.print(" Number must be between 2 and 12. Please guess again: ");
                userGuess = keyboard.nextInt();
              }
              // roll dice
              dice1 = randomNumber.nextInt(6) +1;
              dice2 = randomNumber.nextInt(6) +1;
              totalDice = dice1 + dice2;
              System.out.println("The dice rolled " + dice1 + " " + dice2);
              // did the user guess the number correctly?
              if(userGuess == totalDice){
              System.out.println("You guessed it!");
              } else {
           System.out.println("You are incorrect, please try again: ");
           } //end if
        } //end for
   }//end main
}//end class