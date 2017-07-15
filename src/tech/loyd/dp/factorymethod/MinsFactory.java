package tech.loyd.dp.factorymethod;

public class MinsFactory implements Factory<Integer> {

	@Override
	public Operator<Integer> createOperator() {
		return new MinsOperator();
	}

}
