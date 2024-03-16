package test;

import model.CounterModel;
import view.CounterView;

public class Test {

	public static void main(String[] args) {
		CounterModel ct = new CounterModel();
		ct.increasement();
		ct.increasement();
		ct.increasement();
		System.out.println(ct.getValue());
		ct.decrement();
		System.out.println(ct.getValue());
		
		CounterView ctv = new CounterView();

	}

}
