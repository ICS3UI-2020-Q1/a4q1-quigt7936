import java.util.Scanner;
/**
 * The program counts down from 100 by 5 to the given number
 * @author Thomas Quigley
 */
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // ask the user the number to count down from
    System.out.println("Please enter an integer to count down to");
    int userNumber = input.nextInt();

    // delcare the number being said
    int outputNumber = 100;
    
    // say start the countdown
    System.out.println("Count Down:");

    // print number
    // while the number -5 is more than the said number continue
    do {
      System.out.println(outputNumber);
      outputNumber = outputNumber - 5;
    } while (outputNumber >= userNumber);
  }
}
