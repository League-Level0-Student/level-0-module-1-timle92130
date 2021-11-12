package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

	int score=0; 

		String riddle = JOptionPane.showInputDialog("What travels around the world, yet still stays in one corner? ");

		if (riddle.equalsIgnoreCase("A stamp")) {
			System.out.println("Correct!");
			score +=1;
		}
		else {
			System.out.println("Incorrect!");
			System.out.println("The correct answer is a stamp.");
		}
		System.out.println(score);
		
		
		
	

		String riddle2 = JOptionPane.showInputDialog("If there are three kids in a family, and Seth has 2 siblings Friday and Saturday who is the third kid in the family.");
		
		if (riddle.equalsIgnoreCase("Seth")) {
			System.out.println("Correct!");
			score +=1;
		}
		else {
			System.out.println("Incorrect!");
			System.out.println("The correct answer is Seth.");
		}
		System.out.println(score);
		
		
		
		}
		
		
}


