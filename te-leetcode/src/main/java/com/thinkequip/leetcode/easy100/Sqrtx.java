package com.thinkequip.leetcode.easy100;

public class Sqrtx {

	public static void main(String[] args) {
		System.out.println(mySqrt(2147395600));
	}

	public static int mySqrt(int x) {
		for (int i = 0; i <= x; i++) {
			if ((i * i <= x) && ((i + 1) * (i + 1) > x)) {
				return i;
			}
		}
		return 0;
	}

}
