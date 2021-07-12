package com.ss.jb.one;

public class Assignment1 {

	public static void main(String[] args) {
		
		String patterns[] = {"1)\n*\n**\n***\n****\n.........\n", "2)\n..........\n****\n***\n**\n*\n", 
				"3)\n     *\n    ***\n   *****\n  *******\n...........\n", "4)\n...........\n  *******\n   *****\n    ***\n     *\n"};
		
		for(int i = 0; i < 4; i++) {			
			System.out.print(patterns[i]);
		}
	}
}