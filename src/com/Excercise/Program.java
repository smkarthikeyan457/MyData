package com.Excercise;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program {
	public static void main(String[] args) {

		String s = "good good good of day bad of day for the day good for day bad the day bad of good bad the good ";
		String[] split = s.split(" ");
		
		

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		System.out.println(map);		//{good = 1 }
		
		for (String key : split) {
			if (map.containsKey(key)) {

				Integer value = map.get(key);
				map.put(key, value + 1);

			} else {
				map.put(key, 1);
			}

		}
		System.out.println(map);

	}

}
