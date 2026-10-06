//Programmer: Javan Graber
//Date: 10/5/26

package javanproject;

import java.util.Scanner;

public class MyProject {   
    static Scanner userinput = new Scanner(System.in); 
    public static void main(String[] args) throws InterruptedException {
    	//Create the variables and ask for the user input
    	System.out.print("Please enter your first name: ");
	    String firstName = userinput.nextLine();
	    System.out.print("Please enter your middle name: ");
	    String middleName = userinput.nextLine();
	    System.out.print("Please enter your last name: ");
	    String lastName = userinput.nextLine();
	    
	    //Create a StringBuilder to combine the user input into one full name
	    StringBuilder fullName = new StringBuilder("");
	    fullName.append(firstName).append(" " + middleName).append(" " + lastName);
	    System.out.print("\n");
	    System.out.println("Your full name: " + fullName);

    }
}
