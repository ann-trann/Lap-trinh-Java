package test;

import code.Infor;

public class Sub_Infor2 extends Infor{
	public Infor infor;
	public void method() {
//		this.infor.b; // => khong truy cap duoc
//		super.b; // => khong truy cap duoc
		
		super.c = 3; // => truy cap duoc
	}
}
