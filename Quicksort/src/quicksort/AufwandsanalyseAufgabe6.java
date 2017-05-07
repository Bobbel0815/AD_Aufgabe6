package quicksort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class AufwandsanalyseAufgabe6 {

	
    public static void main(String[] args) {
    	sort sortieren;
    
    	
    	   
	     sortieren = new QuicksortAussen();
	     System.out.print("Aufwand QuicksortAussen \n");
	     aufwandsAnalyse(sortieren);

	     sortieren = new QuicksortMedian();
	     System.out.print("Aufwand QuicksortMedian\n");
	     aufwandsAnalyse(sortieren);


	     sortieren = new QuicksortRandom();
	     System.out.print("Aufwand QuicksortRandom\n");
	     aufwandsAnalyse(sortieren);



	}
    private static void spezialBefuellt(int k, int[] elemente){
        int beginning = 700*(int)Math.pow(10, k);
        for (int i = 0; i < elemente.length; i++)
        {
            elemente[i] = beginning+(int)Math.pow(10, k+1)*i;
        }
    }

    
	private static void aufwandsAnalyse(sort sortieren) {
    	for(int k =10;k<=10000;k*=10){
    		System.out.println("N ="+ k);
    		int[] arrayAZ =new int[k];
    	
     	 
    	for (int i=0 ; i < k; i++) {
    	   arrayAZ[i]=i;
	}
    	sortieren.quickSort(arrayAZ, 0, arrayAZ.length-1);
	System.out.println("\n A-Z: " + sortieren.getZaehler());
	sortieren.setZaehler(0);   
	
	
	int[] arrayZA =new int[k];
 	 
	for (int i=k-1 ; i >= 0; i--) {
	   arrayZA[i]=i;
    }
	sortieren.quickSort(arrayZA, 0, arrayZA.length-1);
	System.out.println(" Z-A: " + sortieren.getZaehler());
	sortieren.setZaehler(0);   

	ArrayList<Integer> random = new ArrayList<Integer>();
	for (int i=0 ; i < k; i++) {
		random.add(i, i);
	}

	Collections.shuffle(random);
	int[] arrayRan = random.stream().mapToInt(i -> i).toArray();
	sortieren.quickSort(arrayRan, 0, arrayRan.length-1);
	System.out.println(" Random: " + sortieren.getZaehler()+"\n");
	sortieren.setZaehler(0);
    	}
	}
	
}