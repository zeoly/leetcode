package com.thinkequip.leetcode.easy50;

public class ValidParentheses {

	public boolean isValid(String s) {
		char[] array = s.toCharArray();
		char[] stack = new char[array.length];
		int point = 0;
		for (int i = 0; i < array.length; i++) {
			if ('(' == array[i] || '[' == array[i] || '{' == array[i]) {
				stack[point] = array[i];
				point++;
			} else if (point == 0) {
				return false;
			} else if (')' == array[i]) {
				if (stack[point - 1] == '(') {
					point--;
				} else {
					return false;
				}
			} else if (']' == array[i]) {
				if (stack[point - 1] == '[') {
					point--;
				} else {
					return false;
				}
			} else if ('}' == array[i]) {
				if (stack[point - 1] == '{') {
					point--;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
		if (point == 0) {
			return true;
		} else {
			return false;
		}
	}

}
