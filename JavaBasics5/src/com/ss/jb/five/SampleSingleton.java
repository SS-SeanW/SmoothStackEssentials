/*
 * Assignment 6
 */
package com.ss.jb.five;

public class SampleSingleton {
	
	private SampleSingleton() {}
	
	private static SampleSingleton instance = null; 

	public static SampleSingleton getInstance() { 
		SampleSingleton result = instance;
		if(instance == null) {
			instance = result = new SampleSingleton();
		}
		return result;
	}
} 