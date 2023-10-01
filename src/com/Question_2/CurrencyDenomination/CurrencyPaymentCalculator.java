package com.Question_2.CurrencyDenomination;

import com.Question_2.CurrencyDenomination.util.SortAnArrayUsingMergeSort;

public class CurrencyPaymentCalculator {
	/* CORE METHOD TO CALCULATE PAYMENT USING DIFFERENT CURRENCY DENOMINATIONS */
	public void calculatePayment(int[] denominations, int amount) {
		
	// SORTING THE DENOMINATION ARRAY IN ORDER TO GET HIGHEST VALUE FIRST AND GET THE MINIMUM NUMBER OF NOTES AS RESULT
	SortAnArrayUsingMergeSort sortArray = new SortAnArrayUsingMergeSort ();
	sortArray.sort(denominations, 0, denominations.length - 1);
		
        System.out.println("Your payment approach in order to give the minimum number of notes will be:");

        // LOOP TO TRAVERSE DENOMINATION ARRAY AND CHECK THE 
        for (int i = 0; i < denominations.length; i++) {
            int count = amount / denominations[i];
            if (count > 0) {
                System.out.println(denominations[i] + ":" + count);
                amount %= denominations[i];
            }
        }
    }
}
