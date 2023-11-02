package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.stream.Stream;


public class Rearrange {

	void PrintArray(int[] arr, int n) {
		
	Arrays.stream(arr).forEach(System.out::print);
		
}

	public static void main(String[] args) {

		Rearrange rearrange = new Rearrange();

		int arr[] = { 1, 2, -3, 4, -7, 9, 0, 6, 7, 9, 3 };
		int n = arr.length;

		System.out.println("Given Array Is: " );
		
		rearrange.PrintArray(arr, n);
		
		
		
				
		
	
		
		
	}

}
