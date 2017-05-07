package quicksort;

public class QuicksortAussen implements sort {
	private static int zaehler = 0;

	public int partition(int arr[], int left, int right) {
		zaehler++;
		int i = left, j = right;
		int tmp;

		int pivot = arr[left]; // Pivot immmer das Rechts aessere

		while (i <= j) {
			zaehler++;
			while (arr[i] < pivot) {
				zaehler++;
				i++;
			}
			while (arr[j] > pivot) {
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

	public void quickSort(int arr[], int left, int right) {
		zaehler++;
		int index = partition(arr, left, right);
		if (left < index -1)
			quickSort(arr, left, index-1);
		if (index < right)
			quickSort(arr, index, right);
	}

	public static void main(String[] args) {
		QuicksortAussen qsa = new QuicksortAussen();
		int i;
		int array[] = { 4,6,7,2,1,0,9,8,3,5 };

		System.out.println("Vor dem Sortieren:\n");
		for (i = 0; i < array.length; i++)
			System.out.print(array[i] + "  ");
		System.out.println();
		qsa.quickSort(array, 0, array.length - 1);
		System.out.println("\nNach dem sortieren:\n");
		for (i = 0; i < array.length; i++)
			System.out.print(array[i] + "  ");
		System.out.println("\nOperationen: " + zaehler);

	}

	public int getZaehler() {
		return zaehler;
	}

	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}
}