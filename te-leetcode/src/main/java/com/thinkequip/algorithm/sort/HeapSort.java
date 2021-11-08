package com.thinkequip.algorithm.sort;

import java.util.List;

/**
 * @author zengyongli 2021-11-08
 */
public class HeapSort {

    public static void main(String[] args) {
        List<Integer> array = SortUtils.array(15);
        SortUtils.printTree(array);
        for (int i = array.size() - 1; i >= 0; i--) {
            downMove(array, i, array.size() - 1);
        }
        System.out.println("pre-performing complete!!!!!!!!!!!!!!!!!!!!!!");
        for (int i = array.size() - 1; i > 0; i--) {
            int temp = array.get(0);
            array.set(0, array.get(i));
            array.set(i, temp);
            System.out.println("switch head and rear");
            SortUtils.printTree(array);
            downMove(array, 0, i - 1);
        }
        System.out.println(SortUtils.checkResult(array));
    }

    private static void downMove(List<Integer> array, int index, int endIndex) {
        int target = 2 * index + 1;
        if (target > endIndex) {
            return;
        }
        if ((target + 1 <= endIndex) && (array.get(target) < array.get(target + 1))) {
            target++;
        }
        if (array.get(index) < array.get(target)) {
            int temp = array.get(index);
            array.set(index, array.get(target));
            array.set(target, temp);
            System.out.println("move " + array.get(index) + " to " + array.get(target));
            SortUtils.printTree(array);
        }
        downMove(array, target, endIndex);
    }
}
