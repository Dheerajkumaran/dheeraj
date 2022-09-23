package org.set;

import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Hashset{
	public static void main(String[] args) 
	{
	Set si=new TreeSet();
	si.add(10);
	si.add(90);
	si.add(30);
	si.add(40);
	
	List li=new ArrayList(si);
	
	
	System.out.print(li);
	
}

}
