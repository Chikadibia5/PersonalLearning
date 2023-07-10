package saturdayproject;

import javax.swing.JOptionPane;

public class GUIintro {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter you name");
		JOptionPane.showMessageDialog(null,"hello "+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("	Enter your age"));
		JOptionPane.showMessageDialog(null,"you are "+age+" years old");
		
		
		int  height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null,"you are "+height+" cm tall");
		
		
		
		
		

	}

}
