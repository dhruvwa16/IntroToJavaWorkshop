package day3;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		StephenHawking.speak("In what country will you find the yellow river");
		String b = JOptionPane.showInputDialog("What is your answer");
		if(b.equals("China")){
			StephenHawking.speak("Correct");}
     	else
     		StephenHawking.speak("Wrong");
		
		StephenHawking.speak("Who is the last player to hold all 4 grand slams at once");
		String c = JOptionPane.showInputDialog("What is your answer");
		if(b.equals("Novak Djokivic")){
			StephenHawking.speak("Correct");}
     	else
     		StephenHawking.speak("Wrong");
		
	}

}
