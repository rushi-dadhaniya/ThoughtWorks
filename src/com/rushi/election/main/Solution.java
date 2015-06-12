package com.rushi.election.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {

	public static void main(String[] args) {
		int[] input1= {12, 11, 5, 2, 7, 5, -11};
		int[] input2= {5, 12, 5, 7, 11, 2, 11};
		System.out.println(partiescompare(input1, input2));
	}
	
	public static String partiescompare(int[] input1,int[] input2)
    {
		Map<Integer, Integer> input1Map = new HashMap<Integer, Integer>();
		for(Integer input : input1) {
			if(input < 0) {
				return "Invalid";
			}
			Integer value = input1Map.get(input);
			value = value != null ? value + 1 : 0; 
			input1Map.put(input, value);
		}
		
		Map<Integer, Integer> input2Map = new HashMap<Integer, Integer>();
		for(Integer input : input2) {
			if(input < 0) {
				return "Invalid";
			}
			Integer value = input2Map.get(input);
			value = value != null ? value + 1 : 0;
			input2Map.put(input, value);
		}
		
		if(input1Map.size() != input2Map.size()) {
			return "Unequal";
		}
		
		Iterator<Entry<Integer, Integer>> input1EntryIterator = input1Map.entrySet().iterator();
		
		while(input1EntryIterator.hasNext()) {
			
			Entry<Integer, Integer> entry = input1EntryIterator.next();
			Integer input1Key = entry.getKey();
			Integer input1Value = entry.getValue();
			Integer input2Value = input2Map.get(input1Key);
			if(input1Value != input2Value) {
				return "Unequal";
			}
			
		}
		
		return "Equal";
    }
	
}
