package org.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class mapexample {
	public static void main(String[] args) {
		try {
		int x =0;
		int y =1;
		System.out.println("Interger assigned");
		int z = y/x;
		System.out.println("Logic done");
		}catch(Exception e) {
			System.out.println(e.toString());
			int z=5;
			System.out.println(z);
		}finally {
			System.out.println("in fiannly");
		}
		
	}

}
