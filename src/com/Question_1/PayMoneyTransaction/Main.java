package com.Question_1.PayMoneyTransaction;

import java.util.Scanner;


// MAIN DRIVER METHOD CLASS
public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int size = 0, i, numOfTargets = 0, targetValue;
			CheckTargetAchievement checkTargetAchievement = new CheckTargetAchievement ();
			
			/* CODE FOR TAKING THE INPUT FROM USER STARTS HERE */
			System.out.println ("enter the size of transaction array");
			
			// TRY CATCH BLOCK TO CHECK THE INPUT MISMATCH EXCEPTION
			try {
			    size = sc.nextInt();
			} 
			catch (java.util.InputMismatchException e) 
			{
			    System.out.println("Invalid input. Please enter an integer for the size.");
			    System.exit(1);
			}
			
			
			int[] transactions = new int[size];
			System.out.println ("enter the values of array");
			
			// LOOP TO TAKE INPUT VALUES FOR TRANSACTION ARRAY
			for (i = 0; i < size; i++)
			{
				// TRY CATCH BLOCK TO CHECK THE INPUT MISMATCH EXCEPTION
				try
				{
					transactions [i] = sc.nextInt();
				}
				catch (java.util.InputMismatchException e) 
				{
			        System.out.println("Invalid input. Please enter integers for the array values.");
			        System.exit(1);
			    }
			}
			System.out.println ("enter the total no of targets that needs to be achieved");
			
			// TRY CATCH BLOCK TO CHECK THE INPUT MISMATCH EXCEPTION
			try
			{
				numOfTargets = sc.nextInt();
			}
			catch (java.util.InputMismatchException e) 
			{
			    System.out.println("Invalid input. Please enter an integer for the target.");
			    System.exit(1);
			}
			/* CODE FOR TAKING THE INPUT FROM USER ENDS HERE */
			
			
			do
			{
				System.out.println ("enter the value of target");
				targetValue = sc.nextInt();
				// CALLING CHECK TARGET ACHIEVED METHOD
				checkTargetAchievement.checkTargetAchieved (transactions, targetValue);
				numOfTargets --;
			} while (numOfTargets > 0);
			sc.close();
		}

	}

}
