import java.util.ArrayList;
import java.util.List;

public class Utils {
	
	public static void printArr(int[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1) {
				sb.append(arr[i] + ", ");
			} else {
				sb.append(arr[i] + "]");
			}
		}
		System.out.println(sb);
	}
	
	public static void printArr(char[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1) {
				sb.append(arr[i] + ", ");
			} else {
				sb.append(arr[i] + "]");
			}
		}
		System.out.println(sb);
	}
	
	public static void printArr(String[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1) {
				sb.append(arr[i] + ", ");
			} else {
				sb.append(arr[i] + "]");
			}
		}
		System.out.println(sb);
	}
	
	public static List<Integer> arraytoList(int[] array) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		return list;
	}

	public static List<Character> arraytoList(char[] array) {
		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		return list;
	}
	
	public static List<String> arraytoList(String[] array) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		return list;
	}
	
	public static int[] intListtoArray(List<Integer> list) {
		int[] array = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		return array;
	}
	
	public static char[] charListtoArray(List<Character> list) {
		char[] array = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		return array;
	}
	
	public static String[] strListtoArray(List<String> list) {
		String[] array = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		return array;
	}
	
	public static char[] subArray(char[] array, int from, int to) {
		char[] newArray = new char[to-from];
		for (int i = from; i < to; i++) {
			newArray[i-from] = array[i];
		}
		return newArray;
	}
}
