

import java.util.ArrayList;
import java.util.List;

/**
 * 全排列
 * @author Administrator
 *
 */
public class Permutation {
	public static void main(String[] args) {
		String str = "abc";
		List<String> resultList = permutation(str);
		for (String string : resultList) {
			System.out.println(string);
		}
	}
	
	/**
	 * 获取字符串的全排列
	 * @param str
	 * @return 
	 */
	public static List<String> permutation(String str) {
		char[] chs = str.toCharArray();
		List<String> resultList = new ArrayList<>();
		permutation(chs, 0, resultList);
		return resultList;
	}
	
	/**
	 * 
	 * @param chs
	 * @param beginPos
	 */
	private static void permutation(char[] chs, int beginPos, List<String> resultList) {
		if (beginPos == chs.length - 1) {
			resultList.add(new String(chs));
		}
		for (int i = beginPos; i < chs.length; i++) {
			if (isSwap(chs, beginPos, i)) {
				swap(chs, beginPos, i);
				permutation(chs, beginPos + 1, resultList);
				swap(chs, beginPos, i);
			}
		}
	}
	
	/**
	 * 功能：判断是否应该交换元素，从而去除重复的排列情况
	 * 若在当前字符之前的元素中存在当前字符，则不交换。
	 * @param chs
	 * @param beginPos
	 * @param curPos
	 * @return
	 */
	private static boolean isSwap(char[] chs, int beginPos, int curPos) {
		for (int i = beginPos; i < curPos; i++) {
			if (chs[i] == chs[curPos]) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 交换数组中两个位置的元素
	 * @param chs
	 * @param pos1
	 * @param pos2
	 */
	private static void swap(char[] chs, int pos1, int pos2) {
		if (pos1 == pos2) {
			return;
		}
		char temp = chs[pos1];
		chs[pos1] = chs[pos2];
		chs[pos2] = temp;
	}

}
