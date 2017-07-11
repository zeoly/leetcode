package com.thinkequip.leetcode.easy50;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		ListNode l6 = new ListNode(6);
		ListNode l5 = new ListNode(5);
		ListNode l4 = new ListNode(4);
		ListNode l3 = new ListNode(3);
		ListNode l2 = new ListNode(2);
		ListNode l1 = new ListNode(1);
		l1.next = l2;
		l2.next = l4;
		
		l3.next = l5;
		l5.next = l6;
		ListNode node = mergeTwoLists(l1, l3);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		if (l1.val < l2.val) {
			ListNode node = new ListNode(l1.val);
			node.next = mergeTwoLists(l1.next, l2);
			return node;
		} else {
			ListNode node = new ListNode(l2.val);
			node.next = mergeTwoLists(l1, l2.next);
			return node;
		}
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
