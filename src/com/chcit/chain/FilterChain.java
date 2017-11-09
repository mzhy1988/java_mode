package com.chcit.chain;

import java.util.List;

public class FilterChain {

	List<Filter> filters;
	int index;

	public List<Filter> getFilters() {
		return filters;
	}

	public void setFilters(List<Filter> filters) {
		this.filters = filters;
	}

	public void addFilter(Filter filter){
		filters.add(filter);
	}

	public void doFilter(){
		if(index < filters.size() ){
			//将责任链条(this)对象传入链条节点，链条节点对象的 doSomthing 中再调用通过链条链对象的doFilter()实现链条节点的遍历调用
			filters.get(index++).doSomthing(this);	
		}else{
			//所有的链条节点调用结束，执行一些业务逻辑操作
			System.out.println("被处理");
		}

	}

}
