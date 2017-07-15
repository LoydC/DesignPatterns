package tech.loyd.dp.staticfactory;

public interface Operator<T> {
	T getResult(T...t);
}
