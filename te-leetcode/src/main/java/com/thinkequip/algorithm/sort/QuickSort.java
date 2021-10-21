package com.thinkequip.algorithm.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zengyongli 2021-10-18
 */
public class QuickSort {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<Integer>( ){};
        for (int i = 0; i < 8; i++) {
            int n = (int) (Math.random() * 100);
            array.add(n);
        }
        print(array);
        sort(array, 0, array.size() - 1);
        print(array);
    }

    private static void print(List<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println("\n");
    }

    private static void sort(List<Integer> array, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = array.get(start);
        int head = start;
        int rear = end;
        System.out.println("pivot " + pivot);
        print(array);
        while (head != rear) {
            while ((head < rear) && (array.get(rear) >= pivot)) {
                rear--;
            }
            while ((head < rear) && (array.get(head) < pivot)) {
                head++;
            }
            if (head < rear) {
                int temp = array.get(head);
                array.set(head, array.get(rear));
                array.set(rear, temp);
                System.out.println("switch " + head + "," + rear);
                print(array);
            }
        }
        if (pivot > array.get(head)){
            array.set(start, array.get(head));
            array.set(head, pivot);
            System.out.println("position " + pivot + " to " + head);
            print(array);
        }
        sort(array, start, head - 1);
        sort(array, head + 1, end);
    }
}
