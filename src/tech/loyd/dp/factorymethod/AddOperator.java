package tech.loyd.dp.factorymethod;

public class AddOperator implements Operator<Integer> {

	public Integer getResult(Integer... t) {
		int result = 0;
		for(int x : t){
			result += x;
		}
		return result;
	}

}
