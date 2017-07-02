package tech.loyd.dp.singleton;

public class LazySingleton {

	private static LazySingleton instance;

	private LazySingleton() {
	}

	public static synchronized LazySingleton getInstance(){
		if(instance == null){
			instance = new LazySingleton();
		}
		return instance;
	}
}