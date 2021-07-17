/**
 * 
 */
package com.ss.jb.five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author SeanW
 *
 */
public class Assignment1 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Operations oper = new Operations();
		int A = Integer.parseInt(br.readLine());
		PerformOperation po;
		int returned = 0;
		String answer = null;
		
		for(int i = A; i > 0; i--) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int method = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			
			if(method == 1) {
				po = oper.isOdd();
				returned = Operations.checkInt(po, num);
				if(returned == 0) {
					answer = "EVEN";
				} else{
					answer = "ODD";
				}
			}
			else if(method == 2) {
				po = oper.isPrime();
				returned = Operations.checkInt(po, num);
				if(returned == 0) {
					answer = "PRIME";
				} else{
					answer = "COMPOSITE";
				}
			}
			else if(method == 3) {
				po = oper.isPalindrome();
				returned = Operations.checkInt(po, num);
				if(returned == 0) {
					answer = "PALINDROME";
				} else{
					answer = "NOT PALINDROME";
				}
			}
			System.out.println(answer);
		}
			
	}

}
