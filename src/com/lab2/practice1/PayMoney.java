package com.lab2.practice1;

import java.util.Scanner;

public class PayMoney {
	public static void main(String[] args) {
		int size;
		int transaction;
		int target;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of transaction array:");
		size = in.nextInt();
		
		int array[] = new int[size];
		System.out.println("Enter the values of array:");
		
		for(transaction=0;transaction<size;transaction++)
			array[transaction]=in.nextInt();
		System.out.println("Enter total no of targets that needs to be achieved");
		int t=in.nextInt();
		for (int i=1;i<=t;i++) {
		System.out.println("Enter the value of target:");
		target=in.nextInt();
		
		int sum=0;
		for(transaction=0;transaction<size;transaction++) {
			sum=sum+array[transaction];
			if(sum>=target) {
				sum=sum+array[transaction];
				break;
			}
		}
		if(sum<target) {
			System.out.println("Given target is not achieved");
		}
		else
			System.out.println("Target acheived after "+ (transaction+1)+ " Transactions");
		
		}		
	in.close();} 
}
