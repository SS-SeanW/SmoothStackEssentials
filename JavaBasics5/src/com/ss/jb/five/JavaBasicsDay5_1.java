package com.ss.jb.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class JavaBasicsDay5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputArray[] = {"Natural", "Elephant", "Homemade", "Clap", "Wood Chipper", "Can't", "Extraterrestrial"};
				
		sortByLength(inputArray);
		System.out.println();
		sortByReverseLength(inputArray);
		System.out.println();
		sortByFirstCharacter(inputArray);
		System.out.println();
		firstLetterE(inputArray);
	}
	
	public static void sortByLength(String[] string) {
		List<String> strings = Arrays.asList(string);
		List<String> sortedStrings = strings.stream().sorted().collect(Collectors.toList());
		Collections.sort(sortedStrings, (a,b) -> Integer.compare(a.length(), b.length()));
		sortedStrings.forEach(n -> {
			System.out.println(n);
		});
	}
	
	public static void sortByReverseLength(String[] string) {
		List<String> strings = Arrays.asList(string);
		List<String> sortedStrings = strings.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		Collections.sort(sortedStrings, (a,b) -> Integer.compare(b.length(), a.length()));
		sortedStrings.forEach(n -> {
			System.out.println(n);
		});
	}
	
	public static void sortByFirstCharacter(String[] string) {
		List<String> strings = Arrays.asList(string);
		strings.sort((a,b) -> a.charAt(0) - b.charAt(0));		
		strings.forEach(n -> {
			System.out.println(n);
		});
	}
	
	public static void firstLetterE(String[] string) {
		List<String> strings = Arrays.asList(string);
		List<String> firstLetterE = new ArrayList<String>();
		strings.forEach(n -> {
			if(n.charAt(0) == 'e' || n.charAt(0) == 'E') {
				firstLetterE.add(0, n);
			} else {
				firstLetterE.add(n);
			}
		});
		firstLetterE.forEach(n -> {
			System.out.println(n);
		});
	}
}
