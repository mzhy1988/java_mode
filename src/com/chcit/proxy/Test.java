package com.chcit.proxy;

public class Test {

	public static void main(String[] args) {
		CglibProxy proxy = new CglibProxy();
		BeiDaiLiClass obj = (BeiDaiLiClass)proxy.getProxy(BeiDaiLiClass.class);
		obj.doSomething();

	}
}
