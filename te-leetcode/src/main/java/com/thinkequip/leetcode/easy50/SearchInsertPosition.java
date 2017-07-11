package com.thinkequip.leetcode.easy50;

public class SearchInsertPosition {

	public int searchInsert(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target || nums[i] > target) {
				return i;
			}
		}
		return nums.length;
	}

}
