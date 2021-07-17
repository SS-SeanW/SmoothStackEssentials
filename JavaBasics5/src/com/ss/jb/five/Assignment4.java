package com.ss.jb.five;

import java.util.Arrays;
import java.util.List;

public class Assignment4 {
	
	public static List<String> noX(List<String> strings){
		strings.replaceAll(character -> character.replace("x", ""));
		return strings;
	}
	
	public static void main(String[] args) {
				
		List<String> stringList = Arrays.asList("ax", "bxbx", "xxcxx");
		
		noX(stringList);
		
		for(String input : stringList) {
			System.out.print(input + " ");
		}
	}
	
}
