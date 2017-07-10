package com.thinkequip.leetcode;

public class ReverseInteger {
	
	public int reverse(int x) {
		int result = 0;
		int temp = x > 0 ? x : -x;
		while (temp > 0) {
			if (result > Integer.MAX_VALUE / 10) {
				return 0;
			}
			result = result * 10 + temp % 10;
			temp = temp / 10;
		}
		return x > 0 ? result : -result;
	}
}
