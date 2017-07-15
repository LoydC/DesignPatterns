package tech.loyd.dp.staticfactory;

public class OperatorFactory {
	
	/****** 策略一：根据传入的operator名进行实例化对象 ******/

	public static Operator<Integer> createOperator(String operName) {
        Operator<Integer> operator;
        switch (operName) {
            case "+":
                operator = new AddOperator();
                break;
            case "*":
                operator = new MultiOperator();
                break;
            default:
                throw new RuntimeException("Wrong Operator Name: " + operName);
        }
        return operator;
    }
	
	/****** 策略二：直接调用构造相应实例的方法 ******/
	public static Operator<Integer> createAddOper() {
        return new AddOperator();
    }

    public static Operator<Integer> createMultiOper() {
        return new MultiOperator();
    }
}
