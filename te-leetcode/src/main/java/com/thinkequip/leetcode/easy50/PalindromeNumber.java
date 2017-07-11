package com.thinkequip.leetcode.easy50;

public class PalindromeNumber {

	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int temp = x;
		int result = 0;
		while (temp > 0) {
			if (result > Integer.MAX_VALUE / 10) {
				result = 0;
				break;
			}
			result = result * 10 + temp % 10;
			temp = temp / 10;
		}
		return x == result ? true : false;
	}

}
