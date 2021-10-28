
package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Ubbirthday {
public static void main(String[] args) { 
	String birthdayvalue = JOptionPane.showInputDialog("When is your birthday?");
	if (birthdayvalue.equalsIgnoreCase("10/28")){
		JOptionPane.showMessageDialog(null, "happy birthday!!!");
	}
		else {
			JOptionPane.showMessageDialog(null, "happy unbirthday!!!");
		}
	}
}

