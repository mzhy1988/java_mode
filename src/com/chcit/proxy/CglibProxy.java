package com.chcit.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * cglib实现代理依据 动态创建子类原理
 * @author Administrator
 *
 */
public class CglibProxy implements MethodInterceptor {
	private Enhancer enhancer = new Enhancer();

	public Object getProxy(Class clazz){
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2,
			MethodProxy arg3) throws Throwable {
		System.out.println("代理执行部分");
		Object result = arg3.invokeSuper(arg0, arg2);
		return result;
	}
}
