package tech.loyd.dp.abstractfactory;

public class LuxurySeat implements Seat {

	@Override
	public void massage() {
		System.out.println("高端座椅：按摩。。。");
	}

	@Override
	public void heat() {
		System.out.println("高端座椅：座椅加热。。。");
	}

}
