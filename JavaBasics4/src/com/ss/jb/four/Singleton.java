/**
 Assignment 1
 */
package com.ss.jb.four;

/**
 * @author SeanW
 *
 */
public class Singleton {
	
	private static volatile Singleton instance = null;
	private Singleton() {}
	public static Singleton getInstance() {
		Singleton result = instance;
		if(instance == null) {
			synchronized(Singleton .class) {
				if(instance == null) {
					instance = result = new Singleton();
				}
			}
		}
		return result;
	}
}
