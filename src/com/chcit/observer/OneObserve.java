package com.chcit.observer;

public class OneObserve implements Observe {

	public OneObserve(Subject subject){
		subject.addObserver(this);
	}
	@Override
	public void doSomething() {
		System.out.println("==========我是观察者一的调用方法=======");
	}


}
