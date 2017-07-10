package com.thinkequip.leetcode;

public class RomanToInteger {

	public int romanToInt(String s) {
		char[] array = s.toCharArray();
		int[] intArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if ('I' == array[i]) {
				intArray[i] = 1;
			} else if ('X' == array[i]) {
				intArray[i] = 10;
			} else if ('C' == array[i]) {
				intArray[i] = 100;
			} else if ('M' == array[i]) {
				intArray[i] = 1000;
			} else if ('V' == array[i]) {
				intArray[i] = 5;
			} else if ('L' == array[i]) {
				intArray[i] = 50;
			} else if ('D' == array[i]) {
				intArray[i] = 500;
			} else {
				return 0;
			}
		}
		int total = 0;
		int temp = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (i < intArray.length - 1) {
				if (intArray[i] == intArray[i + 1]) {
					temp += intArray[i];
				} else if (intArray[i] < intArray[i + 1]) {
					temp += intArray[i];
					total -= temp;
					temp = 0;
				} else if (intArray[i] > intArray[i + 1]) {
					total += (intArray[i] + temp);
					temp = 0;
				}
			} else {
				total += (intArray[i] + temp);
			}
		}
		return total;
	}

}
