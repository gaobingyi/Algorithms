public class Permutation {

	public static void main(String[] args) {
		permutation("abc");
	}
	
	public static void permutation(String s) {
		char[] array = s.toCharArray();
		permutation(array, 0);
	}
	
	private static void permutation(char[] array, int begin) {
		if (begin == array.length - 1) {
			System.out.println(array);
		}
		for (int i = begin; i < array.length; i++) {
			if (isSwap(array, begin, i)) {
				swap(array, begin, i);
				permutation(array, begin+1);
				swap(array, begin, i);
			}
		}
	}
	
	private static boolean isSwap(char[] array, int s, int t) {
		for (int i = s; i < t; i++) {
			if (array[i] == array[t]) {
				return false;
			}
		}
		return true;
	}
 
	private static void swap(char[] array, int s, int t) {
		char temp = array[s];
		array[s] = array[t];
		array[t] = temp;
	}

}
