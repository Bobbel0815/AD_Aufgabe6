package quicksort;

import java.util.Random;

public class QSR {
	private static int zaehler=0;
	
	   public  int[] sortiere(int x[]) {
	     zaehler++;
		   return qSort(x, 0, x.length-1);
	   }
	    
	   public  int[] qSort(int x[], int links, int rechts) {
	      zaehler++;
		   if (links < rechts) {
	         int i = partition(x,links,rechts);
	         qSort(x,links,i-1);
	         qSort(x,i+1,rechts);
	      }
		return x;
	   }
	    
	   public  int partition(int x[], int links, int rechts) {
	      zaehler++;
		   int pivot, i, j, help;
//	      pivot =  getPivot(x,links,rechts);   
		   Random rnd = new Random();
		   pivot= x[links + rnd.nextInt(rechts - links)];
	      i     = links;
	      j     = rechts-1;
	      while(i<=j) {
	         zaehler++;
	    	  if (x[i] > pivot) {     
	            // i größer als pivot. i nach rechts tauchen
	    		  //tausche x[i] und x[j]
	            help = x[i]; 
	            x[i] = x[j]; 
	            x[j] = help;                             
	          
	            	j--;
	            
	         } else i++;            
	      }
	      // i kleiner als pivot. i nach links  tauchen 
	      //tausche x[i] und x[rechts]
	      help      = x[i];
	      x[i]      = x[rechts];
	      x[rechts] = help;
	        
	      return i;
	   }
	   public int getPivot(int x[],int links,int rechts){
		   Random rn = new Random();
		   int answer = rn.nextInt(rechts - links + 1) + links;
			    return x[answer];
			}
		    
		        
		
	    
	   public static void main(String[] args) {
	      QSR qsm = new QSR();
		   int[] liste = {0,9,4,6,2,8,5,1,7,3};
	      qsm.sortiere(liste);
	      for (int i=0; i<liste.length; i++) 
	         System.out.print(liste[i]+" "); 
	      System.out.println();
	      System.out.println("QS Mitte Operationen: "+ zaehler);
	   }

	public  int getZaehler() {
		return zaehler;
	}

	public  void setZaehler(int zaehler) {
		QSR.zaehler = zaehler;
	}    
	}