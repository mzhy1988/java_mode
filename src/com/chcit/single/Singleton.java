package com.chcit.single;

public class Singleton {

	private static Singleton instance;
	private Singleton(){} //私有构造函数，避免实例化
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		} 
		return instance;
	}

}
