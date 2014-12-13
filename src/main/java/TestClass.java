package main.java;



import java.util.ArrayList;

import com.google.common.collect.ArrayListMultimap;

public class TestClass {
	
	private ArrayListMultimap<String, String> map = ArrayListMultimap.create();
	

	public boolean modMap() {
		ArrayList<String> list = new ArrayList<>();
		list.add("hello");
		list.add("world");
		map.putAll("test", list);
		return map.containsValue("world");
	}

}
