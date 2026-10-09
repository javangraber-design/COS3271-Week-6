//Programmer: Javan Graber
//Date: 10/8/26

package javanproject;

import java.util.Scanner;

public class MyProject {   
    static Scanner userinput = new Scanner(System.in); 
    public static void main(String[] args) throws InterruptedException {
    	
    	//Get the sentence
    	System.out.print("Please enter the standard English sentence: ");
    	String sentence = userinput.nextLine();
    	System.out.println("Original Sentence: " + sentence);
    	
    	//Find the length of the sentence
    	int sentenceLength = sentence.length();
    	
    	//Make a string builder
    	StringBuilder finalSentence = new StringBuilder("");

    	//Establish the variable that will affect the sentence both if two consonants 
    	//in a row are detected or if just one is found
    	boolean previousConsonant = false;
    	
    	//Create the loop that goes over every character in the sentence
    	for (int it = 0; it < sentenceLength; it++) {
    		
    		//Isolate the current character to be examined and make it a string
    		char characterForExamination = sentence.charAt(it);
    		String currentCharacter = Character.toString(characterForExamination);
    		
			//Scan for any letters
	    	for (int i = 65; i <= 122; i++) {
	    		
	    		//Replace the iteration with the ASCII character
	    		char letterSubstitute = (char)(i);
	    		
	    		//Change the character to a string
	    		String letterChange = Character.toString(letterSubstitute);

	    		//Check if this character is in this part of the sentence
		    	boolean containsLetter = currentCharacter.contains(letterChange);
		    	
		    	//If it is in the sentence, check if it is a consonant or a vowel
		    	if (containsLetter) {
		    		
		    		//Check if it was a vowel (whether capital or not) through the ASCII numbers for vowels
		    		if (i==65 || i==69 || i==73 || i==79 || i==85 || i==89 || i==97 || i==101 || i==105 || i==111 || i==117 || i==121) {
		    			
		    			//If the word added before this vowel was a consonant, add an "opp" before you add the vowel
		    			if (previousConsonant) {
		    				finalSentence.append("opp");
		    				finalSentence.append(letterChange);
			    			
			    			//Change the previous consonant variable to false
			    			previousConsonant = false;
		    			}
		    			
		    			//If the word added before this vowel was not a consonant, simply add only this vowel to the final sentence variable
		    			else {
		    				//Append this value to the final sentence
			    			finalSentence.append(letterChange);
			    			
			    			//Change the previous consonant variable to false
			    			previousConsonant = false;
		    			}	
		    			
		    		}
		    		
		    		//If it is a consonant, adjust depending on the previous addition
		    		else {
		    			
		    			//If the previous addition was also a consonant, add this consonant
		    			if (previousConsonant) {
		    				finalSentence.append(letterChange);

		    			}
		    			
		    			//If the previous addition was not a consonant, add this consonant while also changing 
		    			//the previous consonant variable to true
		    			else {
		    				finalSentence.append(letterChange);

		    				//Change the previous consonant variable to true
		    				previousConsonant = true;
		    			}
		    		}
		    	}
		    	
		    	
		    	}
	    	//Make any spaces underscores by
    		//finding the ASCII value for the current character
    		int asciiValue = (int)characterForExamination;

    		//If it is a space, insert an underscore
    		//and change the previous consonant variable to false
    		if (asciiValue == 32) {
    			finalSentence.append("_");
    			previousConsonant = false;
    		}
	    	
	    	//Create the end for the whole sentence iteration
    	}
    	
    	//Display the final sentence
    	System.out.println("Final Sentence: " + finalSentence);
    		
    	}
    	
    }
