package tech.loyd.dp.singleton;

public enum EnumSingleton {
	INSTANCE;
	
	//下面可以添加其他方法或成员变量
	public void print() {
		System.out.println("Enum Singleton");;
	}
}

