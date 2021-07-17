package com.ss.jb.five;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaBasicsDay5_3 {

	public static void main(String[] args) {
		
		String inputArray[] = {"ack", "belt", "flat", "all", "Wood Chipper", "aim", "Can't", "Extraterrestrial"};
		List<String> strings = Arrays.asList(inputArray);
		
		System.out.print(threeLettersAndA(strings));

	}
	
	public static List<String> threeLettersAndA(List<String> input) {
		
		return input.stream().filter(i -> i.startsWith("a")).filter(i -> i.length() == 3).collect(Collectors.toList());
		
	}

}
