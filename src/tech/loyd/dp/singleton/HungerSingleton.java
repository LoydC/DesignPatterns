package tech.loyd.dp.singleton;

public class HungerSingleton {
	private static final HungerSingleton instance = new HungerSingleton();
	
	private HungerSingleton(){
	}
	
	public static HungerSingleton getInstance(){
		return instance;
	}
}
