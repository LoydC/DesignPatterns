package tech.loyd.dp.abstractfactory;

public class LowSeat implements Seat {

	@Override
	public void massage() {
		System.out.println("低端座椅：无按摩功能。。。");
	}

	@Override
	public void heat() {
		System.out.println("低端座椅：无座椅加热。。。");
	}

}
