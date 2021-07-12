/**
 * 
 */
package com.ss.jb.three;

import java.io.File;
import java.util.Scanner;

/**
 * @author SeanW
 *
 */
public class JB3Assignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.print("Enter a directory path: ");
		Scanner sc = new Scanner(System.in);

		//need to also search first sub directories for files as well
		while(true) {
			
			String fileName = sc.nextLine();
			File file = new File(fileName);
			File fileNamesFound[] = file.listFiles();
			
			try {
				for(int i = 0; i< fileNamesFound.length; i++) {
					if(fileNamesFound[i].isFile()) {
						System.out.print(fileNamesFound[i].getName() + "\n");
					} else if(fileNamesFound[i].isDirectory()){
						System.out.print(fileNamesFound[i].getName() + "\n");
						File sub = new File(fileNamesFound[i].getAbsolutePath());
						File subDirectory[] = sub.listFiles();
						for(int j = 0; j < subDirectory.length; j++) {
							System.out.print(subDirectory[j].getName() + "\n");
						}
					}
				}
				break;
			} catch (Exception e) {
				System.out.print("that directory doesn't exist. Try again: ");
				continue;
			}
		}	
		sc.close();		
	}
}