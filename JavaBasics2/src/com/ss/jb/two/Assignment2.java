/**
 * 
 */
package com.ss.jb.two;

/**
 * @author SeanW
 *
 */
public class Assignment2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int array2D[][] = {{3, 5, 9, 27, 515}, {28, 187, 78, 4, 0}, {66, 256, 4, 91, 31}};
		int maxInt = 0;
		int position[] = {0,0};

		for(int i = 0; i < array2D.length; i++) {
			for(int j = 0; j < array2D[i].length; j++) {
				if(array2D[i][j] > maxInt) {
					maxInt = array2D[i][j];
					position[0] = i;
					position[1] = j;
					
				}
			}
		}
		System.out.print(maxInt + "\n");
		System.out.print("Located at position: " + position[0] + ", " + position[1]);
	}

}
