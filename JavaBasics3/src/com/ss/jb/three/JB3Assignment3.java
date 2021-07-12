/**
 * 
 */
package com.ss.jb.three;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author SeanW
 *
 */
public class JB3Assignment3 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("resources/in/JB3Assignment3.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character or string to search for: ");
		String stringToSearch = sc.nextLine().toLowerCase();
		int count = 0;

		try {
			String lineToRead;
			while((lineToRead = br.readLine()) != null) {
				int startIndex = lineToRead.toLowerCase().indexOf(stringToSearch);
				while(startIndex != -1) {
					count++;
					startIndex = lineToRead.indexOf(stringToSearch, startIndex + stringToSearch.length());
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			br.close();
			sc.close();
		}
		System.out.print(count);
	}

}
