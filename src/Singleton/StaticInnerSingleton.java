package Singleton;

public class StaticInnerSingleton {

	private static class InnerClassInstance {
        private static final StaticInnerSingleton instance = new StaticInnerSingleton();
    }
	
	private StaticInnerSingleton() {
    }
	
	public static StaticInnerSingleton getInstance() {
        return InnerClassInstance.instance;
    }
}
