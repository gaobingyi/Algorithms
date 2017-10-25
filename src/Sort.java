
public class Sort {

	public static void main(String[] args) {
		int[] array = {2,1,3,-1,4,3};
		// Quick Sort
		quickSort(array);
		Utils.printArr(array);
	}
	
	/*
	 * Quick Sort
	 */
	public static void quickSort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}
	
	private static void quickSort(int[] array, int low, int high) {
		if (low < high) {
			int index = partition(array, low, high);
			quickSort(array, low, index-1);
			quickSort(array, index+1, high);
		}
	}

	private static int partition(int[] array, int low, int high) {
		int pivot = array[low]; // select the first element as pivot
		while (low < high) {
			while (low < high && array[high] >= pivot)
				high--;
			array[low] = array[high];
			while (low < high && array[low] <= pivot)
				low++;
			array[high] = array[low];
		}
		// now low is equal to high
		array[low] = pivot;
		return low;
	}

}
