package pattern;

public class Singleton {
	// 1.饿汉式
//	private static Singleton instance = new Singleton();
//	private Singleton() {}
//	public static Singleton getInstance() {
//		return instance;
//	}
	// 2.懒汉式（双重检验锁）
//	private static volatile Singleton instance;
//	private Singleton() {}
//	public static Singleton getInstance() {
//		if (instance == null) {
//			synchronized (Singleton.class) {
//				if (instance == null) {
//					instance = new Singleton();
//				}
//			}
//		}
//		return instance;
//	}
	// 3.静态内部类
	private Singleton() {}
	private static class StaticInner {
		private static final Singleton instance = new Singleton();
	}
	public static Singleton getInstance() {
		return StaticInner.instance;
	}
	
}

// 4.枚举
//public enum Singleton {
//	INSTANCE;
//}
