package com.thinkequip.leetcode;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = { "a" };
		String prefix = longestCommonPrefix(strs);
		System.out.println(prefix);
	}

	public static String longestCommonPrefix(String[] strs) {
		int length = 0;
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].length() > length) {
				length = strs[i].length();
			}
		}
		if (strs.length == 1) {
			return strs[0];
		}

		String prefix = "";
		int index = 0;
		try {
			while (index < length) {
				for (int i = 1; i < strs.length; i++) {
					if (strs[i].charAt(index) != strs[i - 1].charAt(index)) {
						return prefix;
					} else if (i == strs.length - 1) {
						prefix = prefix + strs[0].charAt(index);
						index++;
					}
				}
			}
		} catch (Exception e) {
			return prefix;
		}
		return prefix;
	}

}
