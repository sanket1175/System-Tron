/*TASK 1
Task : Make a Guess a Number With the help of JAVA
*/

import java.util.*; 
import java.io.*;
class Task1{ 
	public static void main(String args[]) throws IOException 
	{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int answer, guess,count = 0 ; 
		
		final int MAX = 100; 
		
	    Random rand = new Random();
	    
	    boolean correct = false;
	    
	    answer = rand.nextInt(MAX) + 1; 

		while (!correct) { 
		        ++count;
		
			System.out.println( 
				"Guess a number between 1 and 100: "); 

			guess = Integer.parseInt(br.readLine()); 

			if (guess > answer) { 
				System.out.println("Too high, try again"); 
			} 

			else if (guess < answer) { 
				System.out.println("Too low, try again"); 
			} 

			else { 

				System.out.println( 
					"Yes, you guessed the number."); 

				correct = true; 
			} 

    
		} 
    System.out.println("Number of total attempt: " + count);
		System.exit(0); 
	} 
}
