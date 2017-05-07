package quicksort;

public interface sort {
	public  int partition(int arr[], int left, int right);
	public  void quickSort(int arr[], int left, int right);
	public int getZaehler();
	public void setZaehler(int zahl);
}
