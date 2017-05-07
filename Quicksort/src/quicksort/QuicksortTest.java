package quicksort;
import org.junit.Test ;
import static org.junit.Assert.*;

public class QuicksortTest {
	QuicksortAussen qs;
	QuicksortMedian qsm;

	
		
//		int[] liste = {0,9,4,6,2,8,5,1,7,3};
		//QuickSort qs = new QuickSort(); 
		//qs.sortiere(liste);
	      
	@Test
	public void	teste_qs_aussen(){
			QuicksortAussen qs = new QuicksortAussen();
			int[] array = {0,9,4,6,2,8,5,1,7,3};
			int[] erg= {0,1,2,3,4,5,6,7,8,9};
			qs.quickSort(array, 0, array.length - 1);
			assertArrayEquals(erg, array);
			
			
		}
	@Test
	public void	teste_qs_random(){
			QuicksortRandom qsr = new QuicksortRandom();
			int[] array = {0,9,4,6,2,8,5,1,7,3};
			int[] erg= {0,1,2,3,4,5,6,7,8,9};
			qsr.quickSort(array, 0, array.length - 1);
			assertArrayEquals(erg,array);
		}
	@Test
	public void	teste_qs_median(){
		QuicksortMedian qsm = new QuicksortMedian();
		int[] array = {0,9,4,6,2,8,5,1,7,3};
		int[] erg= {0,1,2,3,4,5,6,7,8,9};
		//assertEquals(erg, qs.sortiere(liste2));
		qsm.quickSort(array, 0, array.length - 1);
		assertArrayEquals(erg, array);
	}
		
	
	
}
