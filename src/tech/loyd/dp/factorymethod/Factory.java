package tech.loyd.dp.factorymethod;

public interface Factory<T> {
	Operator<T> createOperator();
}
