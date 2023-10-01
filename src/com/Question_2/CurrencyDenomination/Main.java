package com.Question_2.CurrencyDenomination;

import java.util.Scanner;

// MAIN CLASS CONTAINING THE DRIVER METHOD
public class Main {

	public static void main(String[] args) {
		CurrencyPaymentCalculator currencyPaymentCalculator = new CurrencyPaymentCalculator ();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("enter the size of currency denominations");
			int size = 0;

			// TRY CATCH BLOCK TO HANDLE INPUT MISMATCH EXCEPTION
			try
			{
			    size = sc.nextInt();
			} 
			catch (java.util.InputMismatchException e) 
			{
			    System.out.println("Invalid input. Please enter an integer for the size.");
			    System.exit(1);
			}

			int[] denominations = new int[size];

			System.out.println("enter the currency denominations value");

			for (int i = 0; i < size; i++) {
				// TRY CATCH BLOCK TO HANDLE INPUT MISMATCH EXCEPTION
			    try {
			        denominations[i] = sc.nextInt();
			    } 
			    catch (java.util.InputMismatchException e) 
			    {
			        System.out.println("Invalid input. Please enter integers for currency denominations.");
			        System.exit(1);
			    }
			}

			System.out.print("enter the amount you want to pay");
			int amount = 0;

			// TRY CATCH BLOCK TO HANDLE INPUT MISMATCH EXCEPTION
			try {
			    amount = sc.nextInt();
			} 
			catch (java.util.InputMismatchException e) 
			{
			    System.out.println("Invalid input. Please enter an integer for the amount.");
			    System.exit(1);
			}
			
			// METHOD CALL --- CALCULATE PAYMENT
			currencyPaymentCalculator.calculatePayment (denominations, amount);
		}
        
	}

}
