package Singleton;

public class HungerSingleton {
	private static final HungerSingleton instance = new HungerSingleton();
	
	private HungerSingleton(){
	}
	
	public static HungerSingleton getInstance(){
		return instance;
	}
}
