package tech.loyd.dp.abstractfactory;

public class LowTyre implements Tyre {

	@Override
	public void revolve() {
		System.out.println("低端轮胎：不耐磨轮胎正在旋转。。。");
	}

}
