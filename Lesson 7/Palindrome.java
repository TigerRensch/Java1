//Author: Sachin Haldipur
//Date: 05/09/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 7
//Exercise 2 
/**Description of Program:
 *
 *This program will detect a palindrome
 *   
 */
 
 import java.util.Scanner;

 
 public class Palindrome
 {
   public static void main(String[] args)
   {
      String phraseInput;
      
      Scanner input = new Scanner(System.in);
      boolean acceptPhrase = true;
      
      while(acceptPhrase)
      {
         System.out.print("\nEnter a phrase: ");
         phraseInput = input.nextLine();
         
         StringBuilder phraseEval = new StringBuilder(phraseInput);
         
         String phrase = phraseEval.toString();
         System.out.print("phrase is: " + phrase);
         
         String phraseReversed = phraseEval.reverse().toString();
         System.out.print("\nphrase reversed is: " + phraseReversed);

         if(phrase.equals(phraseReversed))
         {
            System.out.print("\n" + phrase + " is a palindrome.");
         }else{
            System.out.print("\n" + phrase + " is not a palindrome.");

         }
         
      }
  
   }
 }