package tech.loyd.dp.abstractfactory;

public interface CarFactory {
	
	Engine createEngine();

	Seat createSeat();

	Tyre createTyre();
}
