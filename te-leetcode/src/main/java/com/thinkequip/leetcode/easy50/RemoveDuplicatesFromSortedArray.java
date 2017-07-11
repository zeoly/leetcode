package com.thinkequip.leetcode.easy50;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 2, 3, 4, 5, 5, 6 };
		int result = removeDuplicates(nums);
		System.out.println(result);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ",");
		}
	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int current = nums[0];
		int index = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > current) {
				current = nums[i];
				index++;
				nums[index] = current;
			}
		}
		return index + 1;
	}

}
