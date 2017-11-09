package com.chcit.chain;

public class TransactionFilter implements Filter {

	@Override
	public void doSomthing(FilterChain filterChain) {
		//做事务处理操作
		System.out.println("============TransactionFilter===");
		//调用责任链条下一个节点
		filterChain.doFilter();
	}
	
}
