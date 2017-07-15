package tech.loyd.dp.abstractfactory;

public class LowEngine implements Engine {

	@Override
	public void start() {
		System.out.println("低端引擎：启动慢。。。");
	}

	@Override
	public void run() {
		System.out.println("低端引擎：转速慢。。。");
	}

}
