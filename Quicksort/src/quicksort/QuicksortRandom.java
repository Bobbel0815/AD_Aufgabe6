
package quicksort;

import java.util.Random;

public class QuicksortRandom implements sort{
private int zaehler=0;

	public  int partition(int arr[], int left, int right) {
		zaehler++;
		int i = left, j = right;
		int tmp;

		Random rnd = new Random();
		int pivot = arr[left + rnd.nextInt(right - left)];

		while (i <= j) {
			zaehler++;
			while (arr[i] < pivot){
				zaehler++;
				i++;
			}
			while (arr[j] > pivot){
				zaehler++;
				j--;
			}
			if (i <= j) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}

		return i;
	}

	public  void quickSort(int arr[], int left, int right) {
		int index = partition(arr, left, right);
		if (left < index - 1)
			quickSort(arr, left, index - 1);
		if (index < right)
			quickSort(arr, index, right);
	}

	public static void main(String[] args) {
		QuicksortRandom qsr= new QuicksortRandom();
		int i;
		int array[] = { 10, 9, 1, 2, 3, 4, 100, 200, 300, 400 };

		System.out.println("Vor dem Sortieren:\n");
		for (i = 0; i < array.length; i++)
			System.out.print(array[i] + "  ");
		System.out.println();
		qsr.quickSort(array, 0, array.length - 1);
		System.out.println("\nNach dem sortieren:\n");
		for (i = 0; i < array.length; i++)
			System.out.print(array[i] + "  ");
		System.out.println();

	}

	@Override
	public int getZaehler() {
		
		return zaehler;
	}

	@Override
	public void setZaehler(int zahl) {
		this.zaehler = zaehler;

	}
}