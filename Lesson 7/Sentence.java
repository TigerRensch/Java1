//Author: Sachin Haldipur
//Date: 05/09/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 7
//Exercise 1 
/**Description of Program:
 *
 *This class will create a sentence using the StringBuilder append method.
 *   
 */
 
 import java.util.Scanner;
 
 public class Sentence
 {
   
   public static void main(String[] args)
   {
      String subject;
      String verb;
      String adverb;
      
      Scanner input = new Scanner(System.in);
      boolean createSentence = true;
      
      while (createSentence){
         System.out.print("\nPlease enter a subject (e.g. person, place, thing): ");
         subject = input.nextLine();
         
         System.out.print("\nPlease enter a verb (e.g. doing, eating, running etc.: ");
         verb = input.nextLine();
         
         System.out.print("\nPlease enter an adverb(e.g. carefully, slowly, quickly etc.: ");
         adverb = input.nextLine();
         
         StringBuilder subjectEval = new StringBuilder(subject);
                  
         StringBuilder verbEval = new StringBuilder(verb);
         
         StringBuilder adverbEval = new StringBuilder(adverb);
         
         StringBuilder sentence = new StringBuilder(subjectEval.append(" ").append(verbEval).append(" ").append(adverbEval));
         
         String completeSentence = sentence.toString() + ".";
                         
         System.out.print(completeSentence);

      }
   }

 }