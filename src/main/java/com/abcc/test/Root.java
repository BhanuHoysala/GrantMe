package com.abcc.test;

import java.util.Arrays;

public class Root {

	public static void main(String[] args) {
		
		Arrays.stream(args).forEach(a -> {
			System.out.println(args.length + a);
		});
		long currentTimestamp = System.currentTimeMillis();
		int i=1;
		long excutionTime = System.currentTimeMillis() - currentTimestamp;
		System.out.println("time taken for sysout" + excutionTime);
		
	}
	
}
