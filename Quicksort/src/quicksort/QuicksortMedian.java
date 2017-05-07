package quicksort;

public class QuicksortMedian implements sort {
	private static int zaehler = 0;

	public int partition(int arr[], int left, int right) {
		zaehler++;
		int i = left, j = right;
		int tmp;

		int pivot = medianVon3(arr, left, right);

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
		if (left < index - 1)
			quickSort(arr, left, index - 1);
		if (index < right)
			quickSort(arr, index, right);
	}

	public int medianVon3(int[] x, int links, int rechts) {
		zaehler++;
		int mitte = (links + rechts) / 2;

		if (x[links] > x[mitte])
			swap(x, links, mitte);

		if (x[links] > x[rechts])
			swap(x, links, rechts);

		if (x[mitte] > x[rechts])
			swap(x, mitte, rechts);

		swap(x, mitte, rechts - 1);
		return x[rechts - 1];
	}

	public void swap(int[] x, int dex1, int dex2) {
		zaehler++;
		int temp = x[dex1];
		x[dex1] = x[dex2];
		x[dex2] = temp;
		
	}

	public int getZaehler() {
		return zaehler;
	}

	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}

	public static void main(String[] args) {
		QuicksortMedian qsm = new QuicksortMedian();
		int i;
		int array[] = { 10, 9, 1, 2, 3, 4, 100, 200, 300, 400 };

		System.out.println("Vor dem Sortieren:\n");
		for (i = 0; i < array.length; i++)
			System.out.print(array[i] + "  ");
		System.out.println();
		qsm.quickSort(array, 0, array.length - 1);
		System.out.println("\nNach dem sortieren:\n");
		for (i = 0; i < array.length; i++)
			System.out.print(array[i] + "  ");
		System.out.println();

	}
}