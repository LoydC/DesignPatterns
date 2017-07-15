package tech.loyd.dp.abstractfactory;

public class LuxuryTyre implements Tyre {

	@Override
	public void revolve() {
		System.out.println("高端轮胎：耐磨轮胎正在旋转。。。");
	}

}
