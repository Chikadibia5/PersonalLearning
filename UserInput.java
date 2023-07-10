package saturdayproject;  

import java.util.Scanner;  //you import from java

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("what is your name? ");
		String name = scanner.nextLine();
		System.out.println("how old are you?");
		int age = scanner.nextInt();
		
		
		
		
		System.out.println("hello  "+name);
		System.out.println("You are "+age+" years old");
		
		

	}

}
