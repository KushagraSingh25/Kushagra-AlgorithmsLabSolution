package com.lab2.practice2;

import java.util.Scanner;

public class Money {
	
	public static void bubbleSort(int denomination[]) {
		int n= denomination.length;
		for(int i=0;i<n-i;i++) {
			for(int j=0;j<n-i-1;j++) {
				if (denomination[j]<denomination[j+1]) {
					int temp=denomination[j];
					denomination[j]=denomination[j+1];
					denomination[j+1]=temp;
				}
			}
		}
	}
	
	public static void noteCount(int denomination[], int amount ) {
	int[] noteCounter=new int[denomination.length];
	
	try {
		for(int i=0;i<denomination.length;i++)
			if(amount>=denomination[i]) {
				noteCounter[i]|=amount / denomination[i];
				amount= amount-noteCounter[i] * denomination[i];
			}
				
		if(amount > 0) {
			System.out.println("exact amount cannot be given with the highest denomination");
	}	else {
			System.out.println("Your payment approach in order to give min no of note will be");
			for(int i=0;i<denomination.length;i++) {
				if(noteCounter[i]!=0) {
					System.out.println(denomination[i] +":"+ noteCounter[i]);
			}
		}
	}
	}catch (ArithmeticException e) {
		System.out.println(e+"notes of denomination 0 is invalid");
	}	
	}
	
	
	public static void main(String[] args) {
		int size;
		int amount;
		Scanner in=new Scanner(System.in);
	
		System.out.println("Enter the size of currency denominations :");
		size=in.nextInt();
	
		int denomination[]=new int[size];
		System.out.println("Enter currency denomination value :");
		for(int i=0;i<size;i++)
		{
			denomination[i]=in.nextInt();
		}
		System.out.println("Enter the amount you want to pay :");
		amount=in.nextInt();
		bubbleSort(denomination);
		noteCount(denomination, amount);	
		in.close();
	}
}
