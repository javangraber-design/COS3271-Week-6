//Programmer: Javan Graber
//Date: 10/6/26

package javanproject;

import java.util.Scanner;

public class MyProject {   
    static Scanner userinput = new Scanner(System.in); 
    public static void main(String[] args) throws InterruptedException {
    	//Create the random word string builder
    	StringBuilder randomWord = new StringBuilder("");
    	
    	//Create the ASCII range (the numbers that stand for the letters of the alphabet) 
    	int minimum = 97;
		int maximum = 122;
		int range = (maximum - minimum) + 1;
		
		//Create the loop that generates the beginning random word of 10 letters
    	for (int i = 1; i <= 10; i++) {
    		//Generate a random number that will correspond to a letter in ASCII
    		int randomNumber = (int)(Math.random()*range) + minimum;
    		//Change the generated number between 97 and 122 to its ASCII value and append it to the random word variable
    		char randomLetter = (char)(randomNumber);
    		randomWord.append(randomLetter);
    	}
    	
    	//Display the random word
    	System.out.println("Word #1 (the original word): " + randomWord);
    	System.out.print("\n");
    	
    	//Create a loop that selects an index, chooses a different letter, and swaps it into the random word
    	//Start at 2 and end at 20 to ensure that the original word changes 19 times (per the assignment instructions)
    	for (int i = 2; i <= 20; i++) {
    		
    		//Generate a number from 0 to 9 that will be the index to be adjusted
    		int randomIndex = (int)(Math.random()*10);
    		
    		//Generate the new letter for that index
    		int randomNumber = (int)(Math.random()*range) + minimum;
    		char newRandomLetter = (char)(randomNumber);

    		//Set the new character in the place of the old one and display the new word
    		randomWord.setCharAt(randomIndex, newRandomLetter);
            System.out.println("Word #" + i + ": " + randomWord);
            System.out.print("\n");
    	}
    		
    	}
    	
    }
