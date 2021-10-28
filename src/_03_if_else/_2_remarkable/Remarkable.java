package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.

		// 2. Ask the user to enter a name. Store their answer in a variable.

		// 3. In a pop-up, tell the user what is remarkable about that person. 
	String igor = "igor is remarkable because he has adidas shoes";
	String person = JOptionPane.showInputDialog("Who is remarkable?");
	if (person.equalsIgnoreCase("igor")){
	JOptionPane.showMessageDialog(null, igor);
	}
	else if (person.equalsIgnoreCase("Daniel")){
		String Daniel = "Daniel is remarkable because of the stars on his jacket!";
		JOptionPane.showMessageDialog(null, Daniel);
	}
		else {
			String Dave = "Dave is remarkable becaus of his vans";
			JOptionPane.showMessageDialog(null, Dave);
}
}
}
