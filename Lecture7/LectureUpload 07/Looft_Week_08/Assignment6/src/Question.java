package homework6;

import java.util.Scanner;

/**
   A question with a text and an answer.
*/
public class Question {
   protected String text;
   protected String answer;

   /**
      Constructs a question with empty question and answer.
   */
   public Question() {
      text = "";
      answer = "";
   }

   /**
      Sets the question text.
      @param questionText the text of this question
   */
   public void setText(String questionText) {
      text = questionText;
   }

   /**
      Sets the answer for this question.
      @param correctResponse the answer
   */
   public void setAnswer(String correctResponse) {
      answer = correctResponse;
   }

   /**
      Checks a given response for correctness.
      @param response the response to check
      @return true if the response was correct, false otherwise
   */
   public boolean checkAnswer(String response) {
       return this.answer.equals(response);
   }

   /**
      Displays this question.
   */
   public void display() {
       System.out.println(this.text);
       System.out.print("Your answer: ");
       Scanner reader = new Scanner(System.in);
       try {
       	String answer = reader.nextLine();
       	boolean correct = this.checkAnswer(answer);
       	System.out.println(correct);
       } catch(Exception e) {
    	   System.out.println(e);
       }
       
   }
}