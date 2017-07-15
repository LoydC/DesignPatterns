package tech.loyd.dp.abstractfactory;

public class LuxuryEngine implements Engine {

	@Override
	public void start() {
		System.out.println("高端引擎：2.6s破百。。。");
	}

	@Override
	public void run() {
		System.out.println("高端引擎：转速快。。。");
	}

}
