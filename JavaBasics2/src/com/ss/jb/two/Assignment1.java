package com.ss.jb.two;

import java.util.Scanner;
import java.io.IOException;

public class Assignment1 {

	public static void main(String[] args) throws IOException {
		
		int addedInts = 0;
		System.out.print("Enter any number of integers: ");
		Scanner sc = new Scanner(System.in);
	//maybe make a do while loop instead
		while(sc.hasNext()) {
			if(sc.hasNextInt()) {
				String input = sc.nextLine();
				String stringNumbers[] = input.split(" ");
				int numbers[] = new int[stringNumbers.length];
		
				try {
					for(int i = 0; i < stringNumbers.length; i++) {
						numbers[i] = Integer.parseInt(stringNumbers[i]);
						addedInts += numbers[i];
					}
					System.out.print(addedInts);
					addedInts = 0;
				} catch(Exception e) {
					System.out.print("One of those wasn't an integer. Try again: ");
					addedInts = 0;
					continue;
				}
			}
			break;
		}
		sc.close();
	}
}
