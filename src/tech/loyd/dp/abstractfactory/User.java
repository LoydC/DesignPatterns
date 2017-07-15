package tech.loyd.dp.abstractfactory;

import org.junit.Test;

public class User {
	
	@Test
    public void testLow(){
        CarFactory factory = new LowCarFactory();

        Engine engine = factory.createEngine();
        engine.start();
        engine.run();

        Seat seat = factory.createSeat();
        seat.heat();
        seat.massage();

        Tyre tyre = factory.createTyre();
        tyre.revolve();
    }

    @Test
    public void testLuxury(){
        CarFactory factory = new LuxuryCarFactory();

        Engine engine = factory.createEngine();
        engine.start();
        engine.run();

        Seat seat = factory.createSeat();
        seat.heat();
        seat.massage();

        Tyre tyre = factory.createTyre();
        tyre.revolve();
    }
}
