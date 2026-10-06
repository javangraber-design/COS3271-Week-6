//Programmer: Javan Graber
//Date: 10/6/26

package javanproject;

import java.util.Scanner;

public class MyProject {   
    static Scanner userinput = new Scanner(System.in); 
    public static void main(String[] args) throws InterruptedException {
    	//Create the variables that will be added to
    	StringBuilder randomWord = new StringBuilder("");
    	StringBuilder newRandomWord = new StringBuilder("");
    	
    	//Create the ASCII range 
    	int minimum = 97;
		int maximum = 122;
		int range = (maximum - minimum) + 1;
		
    	for (int i = 1; i <= 10; i++) {
    		//Generate a random number that will correspond to a letter in ASCII
    		int randomNumber = (int)(Math.random()*range) + minimum;
    		//Change the generated number between 97 and 122 to its ASCII value and append it to randomWord
    		char randomLetter = (char)(randomNumber);
    		randomWord.append(randomLetter);
    		
    	}
    	System.out.println("Random word: " + randomWord);
    	
    	for (int i = 1; i <= 5; i++) {
    		
    		//Generate number form 0 to 9 to be the index that will be changed
    		int randomIndex = (int)(Math.random()*10);
    		System.out.println("Random index: " + randomIndex);
    		
    		//Find the letter that will be swapped
    		char swapLetter = randomWord.charAt(randomIndex);
    		System.out.println("Here is the letter at that index: " + swapLetter);
    		String swapLetterString = Character.toString(swapLetter);
    		System.out.println("Here is the swapped letter: " + swapLetterString);
    		
    		//Generate the new letter for that index
    		int randomNumber = (int)(Math.random()*range) + minimum;
    		char newRandomLetter = (char)(randomNumber);
    		System.out.println("New letter to be added: " + newRandomLetter);
    		
    		
    		//Cut the original random word into parts, replacing the index to be changed with the new value
    		String newWordFirst = randomWord.substring(0, randomIndex);
    		System.out.println("First word: " + newWordFirst);
    		String newWordSecond = randomWord.substring(randomIndex + 1);
    		System.out.println("Second word: " + newWordSecond);
    		newRandomWord.append(newWordFirst).append(newRandomLetter).append(newWordSecond);
    		
    		System.out.println("The new random word: " + newRandomWord);
    		randomWord = newRandomWord;
    		
 
    		System.out.println("Now the original random word is: " + randomWord);
    		
    		randomWord = randomWord.replace(randomNumber, newRandomLetter, swapLetterString)
//    		newRandomWord.delete(0, 10);
//    		System.out.println("Here is the word emptied: " + newRandomWord);
//    		System.out.println("The original random word: " + randomWord);
    		
    		
    		//Reset the new random word
    		
    	}
    		
    		

    		
    	}
    	
    }
