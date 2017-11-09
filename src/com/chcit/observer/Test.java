package com.chcit.observer;

public class Test {

	public static void main(String[] args) {
		//创建订阅主题
		Subject subject = new Subject();
		OneObserve oneObserve = new OneObserve(subject);
		TwoObserve twoObserve = new TwoObserve(subject);
		subject.update();
	}
}
