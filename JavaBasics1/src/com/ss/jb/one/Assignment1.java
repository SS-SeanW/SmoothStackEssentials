package com.ss.jb.one;

public class Assignment1 {

	public static void main(String[] args) {
		
		one();
		two();
		three();
		four();
	}
	public static void one() {
		int row = 5;
		System.out.print("1)\n");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j <=i; j++) {
					System.out.print("*");
			}
			System.out.println();
			if(i == 4) {
				System.out.print(".........");
				System.out.println();
			}
		}
	}
	
	public static void two() {
		int row = 4;
		System.out.print("2)\n");
		for(int i = row; i >= 0; i--) {
			for(int j = 4; j >= i; j--) {
				if(i == 4) {}
				System.out.print("*");
			}
			System.out.println();
			if(i == 0) {
				System.out.print("..........");
				System.out.println();
			}
		}
	}
	
	public static void three() {
		int row = 4;
		System.out.print("3)\n");
		for(int i = 0; i < row; i++) {
			for(int j = row - i; j >= 0; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
				if(j>=1) {
					for(int k = 0; 2*k < j; k+=2) {
						System.out.print("*");
					}
				}
			}
			System.out.println();
			if(i == 3) {
				System.out.print("...........");
				System.out.println();
			}
		}
	}
	
	public static void four() {
		int row = 4;
		System.out.print("4)\n");
		for(int i = 0; i<row; i++) {
			if(i == 0) {
				System.out.print("............");
				System.out.println();
			}
			for(int j = 0; j <=i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k+1<=2*(row-i)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}