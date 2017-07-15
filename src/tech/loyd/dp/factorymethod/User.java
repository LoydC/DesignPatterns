package tech.loyd.dp.factorymethod;

import org.junit.Test;

public class User {
	@Test
    public void testAdd() {
	   AddFactory factory = new AddFactory();
	   Operator<Integer> operator = factory.createOperator();
	   System.out.println(operator.getResult(1,2,3,4,5,6));
    }

    @Test
    public void testMultiplication() {
    	MultiFactory factory = new MultiFactory();
        Operator<Integer> operator = factory.createOperator();
        System.out.println(operator.getResult(1,2,3,4,5,6));
    }

    @Test
    public void testMinsplication() {
    	MinsFactory factory = new MinsFactory();
        Operator<Integer> operator = factory.createOperator();
        System.out.println(operator.getResult(1,2,3,4,5,6));
    }

}
