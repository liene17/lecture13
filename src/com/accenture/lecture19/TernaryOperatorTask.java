package com.accenture.lecture19;

public class TernaryOperatorTask {

	public static void main(String[] args) {
		// receive passed arguments and parse them from string to integers
		int arg1 = Integer.parseInt(args[0]);
		int arg2 = Integer.parseInt(args[1]);
		int arg3 = Integer.parseInt(args[2]);

		// Task1 rewrite current condition to Ternary operator

		// if(arg1 > arg2) {
		// biggestValue = arg1;
		// }else {
		// biggestValue = arg2;
		// }

		int value = (arg1 > arg2) ? arg1 : arg2;
		int max = (arg3 > value) ? arg3 : value; 
		
		System.out.println("The biggest value is: " + max);

	}

}
