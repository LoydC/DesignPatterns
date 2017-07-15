package tech.loyd.dp.factorymethod;

public class MultiFactory implements Factory<Integer> {

	@Override
	public Operator<Integer> createOperator() {
		return new MultiOperator();
	}

}
