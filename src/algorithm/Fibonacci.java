package algorithm;


/**
 * Fibonacci数列：1,1,2,3,5,8,...
 * @author Administrator
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (int i = 1; i <= 50; i++) {
			// System.out.println("第" + i + "个Fibonacci数为" + fibonacci(i)); // 166473ms
			System.out.println("第" + i + "个Fibonacci数为" + fibonacci2(i)); // 3ms
		}
		long end = System.currentTimeMillis();
		System.out.println("共耗时" + (end - start) + "毫秒");

	}
	
	/**
	 * 递归实现
	 * @param n (n > 0)
	 * @return 第n个fibonacci数
	 */
	public static long fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	/**
	 * 循环实现
	 * @param n (n > 0)
	 * @return 第n个fibonacci数
	 */
	public static long fibonacci2(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		long pre = 1;
		long cur = 1;
		for (int i = 0; i < n - 2; i++) {
			long next = pre + cur;
			pre = cur;
			cur = next;
		}
		return cur;
	}

}
