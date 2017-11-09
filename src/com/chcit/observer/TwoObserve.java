package com.chcit.observer;

public class TwoObserve implements Observe{
	
	public TwoObserve(Subject subject){
		subject.addObserver(this);
	}
	@Override
	public void doSomething() {
		System.out.println("====我是观察者二的调用方法======");		
	}

}
