package com.chcit.chain;

import java.util.ArrayList;

public class Test {


	public static void main(String[] args) {
		Filter logFilter = new LogFilter();
		Filter transactionFilter = new TransactionFilter();

		ArrayList<Filter> filters = new ArrayList<Filter>();
		filters.add(logFilter);
		filters.add(transactionFilter);

		FilterChain chain = new FilterChain();	
		chain.setFilters(filters);
		chain.doFilter();
	}


}
