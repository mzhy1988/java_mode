package com.chcit.chain;

public class LogFilter implements Filter {

	@Override
	public void doSomthing(FilterChain filterChain) {
		//做 logFilter 职责范围内的事，
		System.out.println("==========log==========");
		//将请求传递给链条的下一个节点
		filterChain.doFilter();
	}

}
