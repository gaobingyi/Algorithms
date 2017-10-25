import java.util.ArrayList;
import java.util.List;

public class Combination {

	public static void main(String[] args) {
		combination("abc");
	}
	
	public static void combination(String s) {
		if (s == null)
			return;
		List<Character> list = new ArrayList<Character>();
		for (int i = 1; i <= s.length(); i++) {
			combination(s, i, list);
		}
	}
	
	public static void combination(String s, int n, List<Character> list) {
		if (n == 0) {
			System.out.println(list);
			return;
		}
		if (s.length() == 0)
			return;		
		list.add(s.charAt(0));
		combination(s.substring(1), n-1, list);
		list.remove(list.size() - 1);
		combination(s.substring(1), n, list);
	}

}
