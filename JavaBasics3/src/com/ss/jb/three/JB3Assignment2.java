/**
 * 
 */
package com.ss.jb.three;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author SeanW
 *
 */
public class JB3Assignment2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		File file = new File("resources/in/JB3Assignment2.txt");
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Text to append to JB3Assignment2.txt: ");
			String text = sc.nextLine();
			bw.write(text + " ");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
			bw.close();
			fw.close();
		}
	}

}
