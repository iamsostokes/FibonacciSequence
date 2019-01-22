package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int fsValue = 0;
        int a = 0;
        int b = 1;
        int finalValue = 0;
        for (int i = 0; i <=40; i++) {
            if (i % 2 == 0) {
                fsValue = a + b;
                a = b;
                b = fsValue;
                finalValue += fsValue;
                System.out.println("The final total is " + finalValue);
            }

        }

    }
}
