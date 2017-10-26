public class Sort {

	public static void main(String[] args) {
		int[] array = null;
		// Bubble Sort
		array = new int[] {2,1,3,-1,4,3};
		bubbleSort(array);
		Utils.printArr(array);
		// Select Sort
		array = new int[] {2,1,3,-1,4,3};
		selectSort(array);
		Utils.printArr(array);
		// Insert Sort
		array = new int[] {2,1,3,-1,4,3};
		insertSort(array);
		Utils.printArr(array);
		// Quick Sort
		array = new int[] {2,1,3,-1,4,3};
		quickSort(array);
		Utils.printArr(array);
	}
	
	/*
	 * Bubble Sort
	 */
	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			boolean flag = true;
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j+1]) {
					swap(array, j, j+1);
					flag = false;
				}
			}
			if (flag) {
				break;
			}
		}
	}
	
	/*
	 * Select Sort
	 */
	public static void selectSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int minIndex = i; // 假设第一个元素最小
			for (int j = i+1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				swap(array, minIndex, i);
			}
		}
	}
	
	/*
	 * Insert Sort
	 */
	public static void insertSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int j = i;
			while (j > 0 && array[j] < array[j-1]) {
				swap(array, j, j-1);
				j--;
			}
		}
	}
	
	private static void swap(int[] array, int s, int t) {
		int temp = array[s];
		array[s] = array[t];
		array[t] = temp;
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
