package com.Question_1.PayMoneyTransaction;

public class CheckTargetAchievement {
	
	/* CORE METHOD TO CHECK WHETHER TARGET CAN BE ACHEIVED OR NOT + CALCULATE THE NUMBER OF TRANSACTION REQUIRED TO ACHEIVE THE TARGET */
	public void checkTargetAchieved (int[] transactions, int targetValue)
	{
		// TRANSACTION COUNT INDICATES THE NUMBER OF TRANSACTIONS REQUIRED TO ACHEIVE THE TARGET
        int transactionCount = 0;
        
        
        /* LOOP TO TRAVERSE THE TRANSACTION ARRAY STARTS HERE */
        for (int i = 0; i < transactions.length; i++) {
        	targetValue -= transactions[i];
            transactionCount++;

            // CODE TO DISPLAY NUMBER OF TRANSACTIONS
            if (targetValue <= 0) {
                System.out.println("Target achieved after " + transactionCount + " transactions");
                break;
            }
        }
        /* LOOP TO TRAVERSE THE TRANSACTION ARRAY ENDS HERE */

        // CHECKING THIS CONDITION TO KNOW WHETHER TARGET CAN BE ACHIEVED OR NOT
        if (targetValue > 0) {
            System.out.println("Given target is not achieved");
        }
	}
}
