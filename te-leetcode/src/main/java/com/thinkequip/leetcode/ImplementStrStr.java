package com.thinkequip.leetcode;

public class ImplementStrStr {

	public static void main(String[] args) {
		int i = strStr("asdfasdfsdf", "dfas");
		System.out.println(i);
	}

	public static int strStr(String haystack, String needle) {
		int hayLength = haystack.length();
		int needleLength = needle.length();
		if (needleLength == 0) {
			return 0;
		}
		if (hayLength == 0 || needleLength == 0) {
			return -1;
		}
		for (int i = 0; i < hayLength; i++) {
			if (haystack.charAt(i) == needle.charAt(0)) {
				if (needleLength > hayLength - i) {
					return -1;
				}
				boolean isMatch = true;
				try {
					for (int j = 1; j < needleLength; j++) {
						if (needle.charAt(j) != haystack.charAt(i + j)) {
							isMatch = false;
						}
					}
				} catch (Exception e) {
					isMatch = false;
				}
				if (isMatch) {
					return i;
				}
			}
		}
		return -1;
	}
}
