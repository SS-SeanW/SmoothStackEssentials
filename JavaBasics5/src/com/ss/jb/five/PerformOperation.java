package com.ss.jb.five;

@FunctionalInterface
public interface PerformOperation {
	int check(int a);
}
class Operations{
	public static int checkInt(PerformOperation p ,int num){
		return p.check(num);
	}
		
	PerformOperation isOdd() {
		PerformOperation p =  (a) -> {return a%2;};   
		return p;
	}

    PerformOperation isPrime () {
        PerformOperation p =  (a) -> { 
        	if (a == 1) {
        		return 1;
        	}
        	for(int i = 2;i<a/2+1;i++){
        		if((a%i)==0) {
        			return 1;
        			}
        	}
        	return 0;
        };
        return p;
    }

    PerformOperation isPalindrome() {
        PerformOperation p =  (a) -> {
        	String word = ""+a;
        	boolean isPalindrome = true;
        	for(int i = 0;i<(int)word.length()/2;i++) {
        		if(word.charAt(i) != word.charAt(word.length()-1-i)){
        			isPalindrome = false;
        			break;
        		}
        	}
        	return isPalindrome?0:1;
        };
        return p;
    }	
} 
