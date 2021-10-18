package com.thinkequip.algorithm.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zengyongli 2021-10-18
 */
public class QuickSort {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
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
        int pivot = array.get(start);
        int head = start + 1;
        int rear = end;
        if (start >= end) {
            return;
        }
        while (head < rear) {
            while ((head < rear) && (array.get(head) < pivot)) {
                head++;
            }
            while ((head < rear) && (array.get(rear) > pivot)) {
                rear--;
            }
            if (head >= rear) {
                break;
            }
            int temp = array.get(head);
            array.set(head, array.get(rear));
            array.set(rear, temp);
        }
        if (head == rear && pivot < array.get(head)) {
            head--;
        }
        array.set(start, array.get(head));
        array.set(head, pivot);
        sort(array, start, head - 1);
        sort(array, rear, end);
    }
}
