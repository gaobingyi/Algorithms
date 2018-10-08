

import java.util.ArrayList;
import java.util.List;

/**
 * 全组合
 * @author Administrator
 *
 */
public class Combination {
	public static void main(String[] args) {
		char[] chs = {'a', 'b', 'c'};
		List<List<Character>> resultList = combination(chs);
		for (List<Character> list : resultList) {
			System.out.println(list);
		}
	}
	
	/**
	 * 获取字符数组的全组合（即从m个元素中选择n（0<n<=m）个元素的所有组合）
	 * @param chs 字符数组
	 * @return
	 */
	public static List<List<Character>> combination(char[] chs) {
		if (chs == null || chs.length == 0)
			return new ArrayList<>();
		List<List<Character>> resultList = new ArrayList<>();
		List<Character> tempList = new ArrayList<Character>();
		for (int i = 1; i <= chs.length; i++) {
			combination(chs, 0, i, tempList, resultList);
		}
		return resultList;
	}
	
	/**
	 * 获取从chs.length个字符中选择size个元素的所有组合
	 * @param chs 字符数组
	 * @param start 选择范围的起始位置
	 * @param size 选择的元素个数
	 * @param tempList 存放某一种组合
	 * @param resultList 存放所有组合
	 */
	public static void combination(char[] chs, int start, int size, List<Character> tempList, List<List<Character>> resultList) {
		if (size == 0) {
			resultList.add(new ArrayList<Character>(tempList));
			return;
		}
		if (start == chs.length)
			return;		
		// 假设选中第一个元素，则从后面的子串中选择size-1个
		tempList.add(chs[start]);
		combination(chs, start+1, size-1, tempList, resultList);
		// 假设不选第一个元素，则从后面的子串中选择size个
		tempList.remove(tempList.size() - 1);
		combination(chs, start+1, size, tempList, resultList);
	}
}
