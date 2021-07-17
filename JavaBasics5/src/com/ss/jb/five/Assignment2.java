package com.ss.jb.five;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment2 {
	
	public static List<Integer> rightMostDigit(List<Integer> input) {
		input.replaceAll(value -> value%10);
		return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = new ArrayList<Integer>();
		System.out.print("enter any number of integers");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			if(sc.hasNextInt()) {
				String input = sc.nextLine();
				String inputArray[] = input.split(" ");
				try {
					for(int i = 0; i < inputArray.length; i++) {
						numbers.add(Integer.parseInt(inputArray[i]));
					}
				} catch(Exception e) {
					System.out.print("One of those wasn't an integer. Try again: ");
					numbers.clear();
					continue;
				}
			}
			break;
		}
		rightMostDigit(numbers);
		for(int value:numbers) {
			System.out.print(value);
		}
		sc.close();
	}
}