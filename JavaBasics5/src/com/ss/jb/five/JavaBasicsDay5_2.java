package com.ss.jb.five;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaBasicsDay5_2 {

	public static void main(String[] args) {
		
		int inputInts[] = {5,3,6,63,3,45,4,34,24,4,54,54};
		List<Integer> input = new ArrayList<Integer>(inputInts.length);
		for(int i : inputInts) {
			input.add(i);
		}
		
		System.out.print(intString(input));
		
	}
	
	public static String intString(List<Integer> list) {
		return list.stream().map(n -> {
			if(n%2 == 0) {
				return "e" + n;
			} else {
				return "o" + n;
			}
		}).collect(Collectors.joining(","));
	}

}