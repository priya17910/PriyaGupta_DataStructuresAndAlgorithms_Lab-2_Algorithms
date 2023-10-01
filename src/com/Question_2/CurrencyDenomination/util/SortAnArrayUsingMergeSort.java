package com.Question_2.CurrencyDenomination.util;

// MERGE SORT METHOD TO SORT THE ARRAY IN DESCENDING ORDER
public class SortAnArrayUsingMergeSort {
	
	public void sort(int[] arr, int low, int high)
	{
		if (low < high)
		{
			int mid = low + (high - low) / 2;
			
			// LEFT PART
			sort (arr, low, mid);
			
			// RIGHT PART
			sort (arr, mid + 1, high);
			
			// MERGING TWO ARRAYS WHICH ARE ALREADY SORTED IN INITIAL STEPS
			merge (arr, low, mid, high);
		}
	}

	private void merge(int[] arr, int low, int mid, int high) {
		
		int n1 = mid - low + 1;
		int n2 = high - mid;
		
		int[] left = new int[n1];	// LEFT SUBARRAY
		int[] right = new int[n2];	// RIGHT SUBARRAY
		
		// LOOP TO COPY LEFT SUBARRAY ELEMENTS
		for (int i = 0; i < n1; i++)
		{
			left[i] = arr[low + i];
		}
		
		// LOOP TO COPY RIGHT SUBARRAY ELEMENTS
		for (int j = 0; j < n2; j++)
		{
			right[j] = arr[mid + 1 + j];
		}
		
		int i = 0, j = 0;
		int k = low;
		
		// COMPARE THE ELEMENTS OF LEFT SUBARRAY AND RIGHT SUBARRAY
		while (i < n1 && j < n2)
		{
			if (left[i] < right[j])
			{
				arr[k] = right[j];
				j ++;
			}
			else
			{
				arr[k] = left[i];
				i ++;
			}
			k ++;
		}
		
		// CHECKING THE REMAINING ELEMENTS OF THE LEFT SUBARRAY
		while (i < n1)
		{
			arr[k] = left[i];
			i ++;
			k ++;
		}
		
		// CHECKING THE REMAINING ELEMENTS OF RIGHT SUBARRAY
		while (j < n2)
		{
			arr[k] = right[j];
			j ++;
			k ++;
		}
	}
}
