package tech.loyd.dp.factorymethod;

public interface Operator<T> {
	T getResult(T...t);
}
