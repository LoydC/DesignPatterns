package tech.loyd.dp.factorymethod;

public class AddFactory implements Factory<Integer> {

	@Override
	public Operator<Integer> createOperator() {
		return new AddOperator();
	}

}
