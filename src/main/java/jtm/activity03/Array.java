package jtm.activity03;

import java.util.Arrays;

public class Array {
	static int[] array;

	public static void main(String[] args) {
		// TODO Use passed parameters for main method to initialize array
		// Hint: use Run— Run configurations... Arguments to pass parameters to
		// main method when calling from Eclipse
		// Sort elements in this array in ascending order
		Arrays.sort(args);
		// Hint: use Integer.parseInt(args[n]) to convert passed
		// parameters from String to int
		int length = args.length;
		array = new int[length];
		for (int i = 0; i < length; i++) {
			array [i] = Integer.parseInt(args[i]);
		}
		// Hint: use Arrays.sort(...) from
		Arrays.sort(array);
		// https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
	}

	public static void printSortedArray() {
		// TODO print content of array on standard output
		// Hint: use Arrays.toString(array) method for this
		System.out.println(Arrays.toString(array));
	}

	public static int[] returnSortedArray() {
		// TODO return reference to this array
		if(array != null) {
			return array;
		}
		return null;
	}

}
