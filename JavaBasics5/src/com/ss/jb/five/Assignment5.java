package com.ss.jb.five;

public class Assignment5 {
	
	public static boolean groupSumClump(int start, int[] numbers, int target) {
		if (start >= numbers.length) {
			return (target == 0);
		}
		if (start<numbers.length-1 && numbers[start]==numbers[start+1])
		{
			return groupSumClump(start+2, numbers, target);
		}
		if (groupSumClump(start + 1, numbers, target)) {
			return true;
		}
		if (groupSumClump(start + 1, numbers, target - numbers[start])) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		int testArray[] = {1,2,4,8,1};
		
		System.out.print(groupSumClump(0, testArray, 14));

	}

}
