package com.ex01;

public class task02 {
	public static int main(String[] args) {
		testing_ulam();
		return 0;
	}
	public static void ulam(int n) {
		while(n > 1) {
			if(n % 2 == 0) n /= 2;
			else n = (n * 3) + 1;
		}
	}
	public static void testing_ulam() {
		for(int i = 1; i < 1000000; i++) {
			ulam(i);
		}
	}
}
