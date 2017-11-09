package com.chcit.observer;

import java.util.ArrayList;
import java.util.List;

/**观察者模式
 * 观察者订阅的主题
 * @author Administrator
 *
 */
public class Subject {
	List<Observe> observers = null;


	public void addObserver(Observe observe){
		if(observers == null){
			observers = new ArrayList<Observe>();
		}
		observers.add(observe);
	}
	//通知观察者
	public void notice(){
		for (int i = 0; i < observers.size(); i++) {
			observers.get(i).doSomething();
		}
	}

	public void update(){
		System.out.println("我是主题的变更方法");
		notice();


	}


}
