package com.thinkequip.leetcode;

public class CountAndSay {

	public String countAndSay(int n) {
		String result = "1";
		if (n <= 1) {
			return result;
		} else {
			int turn = 1;
			while (turn < n) {
				char[] array = result.toCharArray();
				result = "";
				char temp = array[0];
				int count = 1;
				for (int i = 1; i < array.length; i++) {
					if (temp == array[i]) {
						count++;
					} else {
						result += (count + String.valueOf(temp));
						temp = array[i];
						count = 1;
					}
				}
				result += (count + String.valueOf(temp));
				turn++;
			}
			return result;
		}
	}

}
