package com.ss.jb.one;

import java.util.*;

public class Assignment2 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int upper = 100;
		int randomNumber = rand.nextInt(upper);
		int guessesTaken = 0;
		System.out.print("Guess a number: ");

		while(guessesTaken <= 4) {
			int numberGuessed = sc.nextInt();
			int isInRange = randomNumber - numberGuessed;
			if(numberGuessed == randomNumber) {
				System.out.print("You guessed it!");
				break;
			}else if(Math.abs(isInRange) <= 10) {
				System.out.print("You were close! Correct answer: " + randomNumber);
				break;
			} else {
				System.out.print("Guess again!\n");
				guessesTaken++;
				if(guessesTaken == 5) {
					System.out.print("Sorry! Correct Answer: " + randomNumber);
				}
			}
		}
		sc.close();
	}

}
