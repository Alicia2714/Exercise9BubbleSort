package com.Exercise9BubbleSort.add;

import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		
		//Constant declaration
		final int ELEMENTS_ARRAY = 100;
		
		//Variable declaration
		int temp = 0;
		
		//Array declaration
		int[] unorderedArray= new int[ELEMENTS_ARRAY];
		int[] orderedArray = new int[ELEMENTS_ARRAY];
		
		Random randomnumbers = new Random(System.nanoTime());
		
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			unorderedArray[i] = randomnumbers.nextInt(ELEMENTS_ARRAY);
			System.out.print(unorderedArray[i] +", ");
		}
		
		System.out.println("");
		
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			orderedArray[i]=unorderedArray[i];
		}
		
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			for(int j=0; j<ELEMENTS_ARRAY-1; j++) {
				if(orderedArray[j] >orderedArray[j+1]) {
					temp = orderedArray[j+1];
					orderedArray[j+1]=orderedArray[j];
					orderedArray[j]=temp;
				}
			}
		}
		
		for (int i=0; i<ELEMENTS_ARRAY; i++) {
			System.out.print( orderedArray[i] +", ");
		}
		
		

	}

}
