package tech.loyd.dp.factorymethod;

public class MultiOperator implements Operator<Integer> {

	public Integer getResult(Integer... t) {
		int result = 1;
		for(int x : t){
			result *= x;
		}
		return result;
	}

}
