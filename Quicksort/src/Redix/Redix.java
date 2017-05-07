package Redix;

import java.util.*;

public class Redix {
	

	// int[] a;

	// public int[] befuellen(ArrayList<Integer> array,int N ) {
	// int key;
	// int counter =1;
	// int[] array2 ;
	// for(int i = 0;i< N ;i++){
	// if(counter ==1){
	// key = ((700*N)) + (int)((Math.random()) * (100+i));
	// }else{
	// key = ((700*N)+counter) + (int)((Math.random()) * (100+i));
	// }
	// array.add(i, key);
	//
	// counter+=100;
	// }
	// Collections.shuffle(array);
	// array2 = array.stream().mapToInt(i -> i).toArray();
	// return array2;
	// }
	public static int[] sort(int n,int arr[]){
        int[] output = new int[n];
        int mod = 7*n;
        for(int i = 0; i < arr.length;i++){
            int index =(arr[i]/100)%mod;
            output[index] = arr[i];
            //zaehler++;
        }
        return output;
    }
	
	
	
	
	public static void spezialBefuellt(int k, int[] elemente) {
		int beginning = 700 * (int) Math.pow(10, k);
		for (int i = 0; i < elemente.length; i++) {
			elemente[i] = (int) (beginning + (100 * i) + (Math.random() * 100));
		}
	}

	public static void spezialZufaellig(int k, int[] elemente) {
		spezialBefuellt(k, elemente);
		int index, temp;
		Random random = new Random();
		for (int i = elemente.length - 1; i > 0; i--) {
			index = random.nextInt(i + 1);
			temp = elemente[index];
			elemente[index] = elemente[i];
			elemente[i] = temp;
		}
	}

	public static void ausgeben(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	// A utility function to get maximum value in arr[]
	static int getMax(int arr[], int n) {
		int mx = arr[0];
		for (int i = 1; i < n; i++) {
			
			if (arr[i] > mx)
				mx = arr[i];
		}
		return mx;
	}
	static int counter = 0;
	  public static void countSort(int arr[], int n, int exp)
	    {
	        int output[] = new int[n]; // output array
	        int i;
	        int count[] = new int[10];
	        Arrays.fill(count,0);
	 
	        // Store count of occurrences in count[]
	        for (i = 0; i < n; i++){
	            count[ (arr[i]/exp)%10 ]++;
	            counter++;
	        }
	 
	        // Change count[i] so that count[i] now contains
	        // actual position of this digit in output[]
	        for (i = 1; i < 10; i++){
	            count[i] += count[i - 1];
	            counter++;
	        }
	 
	        // Build the output array
	        for (i = n - 1; i >= 0; i--)
	        {
	            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
	            count[ (arr[i]/exp)%10 ]--;
	            counter++;
	        }
	 
	        // Copy the output array to arr[], so that arr[] now
	        // contains sorted numbers according to curent digit
	        for (i = 0; i < n; i++){
	            arr[i] = output[i];
	            //counter++;
	        }
	    }
	 
	    // The main function to that sorts arr[] of size n using
	    // Radix Sort
	  public  static void radixsort(int arr[], int n)
	    {
	        // Find the maximum number to know number of digits
	        int m = n*10;
	 
	        // Do counting sort for every digit. Note that instead
	        // of passing digit number, exp is passed. exp is 10^i
	        // where i is current digit number
	        for (int exp = 1; m / exp > 0; exp *= 10) {
	            countSort(arr, n, exp);
	            counter++;
	        }
	    }
	 
	    // A utility function to print an array
	    static void print(int arr[], int n)
	    {
	        for (int i=0; i<n; i++)
	            System.out.print(arr[i]+" ");
	    }

	

	public int getZaehler() {
		return counter;
	}

	public void setZaehler(int zaehler) {
		Redix.counter = zaehler;
	}

	/* Driver function to check for above function */

	/* This code is contributed by Devesh Agrawal */

	// public static void main(String[] args) {
	// // TODO Auto-generated method stub
	// Count test = new Count();
	// int N = 10;
	// int k = 1;
	//// ArrayList<Integer> array = new ArrayList<>(N);
	//
	//// array = new int[ 1000 ];
	//// test.befuellen(array,N);
	//
	//// Collections.shuffle(array);
	//// int[] array2 = array.stream().mapToInt(i -> i).toArray();
	//
	//
	//
	//
	// int[] array = new int[N];
	//
	//
	//
	// test.spezialZufaellig(k,array);
	// ausgeben(array);
	//
	// System.out.println();
	//
	// int n = array.length;
	// radixsort(array, n);
	// ausgeben(array);
	//// print(array, n);
	//
	// }
	//

}
