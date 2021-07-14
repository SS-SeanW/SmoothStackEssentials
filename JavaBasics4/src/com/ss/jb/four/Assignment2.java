/**
 * 
 */
package com.ss.jb.four;

/**
 * @author SeanW
 *
 */
public class Assignment2 {

	/**
	 * @param args
	 */
	
	 String first = "Test";
	 String second = "Code";
	 Thread threadOne = new Thread() {
		public void run() {
			while(true) {
				synchronized(first) {
					synchronized(second) {
						System.out.print(first + second);
					}
				}
			}
		}
	};
	 Thread threadTwo = new Thread() {
		public void run() {
			while(true) {
				synchronized(second) {
					synchronized(first) {
						System.out.print(second + first);
					}
				}
			}
		}
	};
	public static void main(String[] args) {

		Assignment2 deadLock = new Assignment2();
		deadLock.threadOne.start();
		deadLock.threadTwo.start();
		
	}

}
