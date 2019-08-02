package com.selenium.automation.waits_alerts_windows;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetLearning {
	// no indexing like list use iterator
	// no ordering of elements
	// no duplicate elements allowed
	public static void main(String[] args)	{
		Set<String> set = new HashSet<String>();
		set.add("India");
		set.add("china");
		set.add("china");
		System.out.println(set);
		Iterator<String> it = set.iterator();
		while(it.hasNext())	{
			System.out.println(it.next());
		}
	}
}
