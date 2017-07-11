package com.thinkequip.leetcode.easy100;

public class LengthOfLastWord {

	public static void main(String[] args) {
		int i = lengthOfLastWord("   ");
		System.out.println(i);
	}

	public static int lengthOfLastWord(String s) {
		String[] array = s.split("\\s+");
		if (array.length == 0) {
			return 0;
		}
		return array[array.length - 1].length();
	}

}
