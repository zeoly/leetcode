package com.thinkequip.algorithm.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zengyongli 2021-11-08
 */
public class SortUtils {

    public static List<Integer> array(int size) {
        List<Integer> array = new ArrayList<Integer>() {
        };
        for (int i = 0; i < size; i++) {
            int n = (int) (Math.random() * 100);
            array.add(n);
        }
        return array;
    }

    public static void print(List<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println("\n");
    }

    public static void printTree(List<Integer> array) {
        int depth = depth(array.size());
        for (int i = 0; i < depth; i++) {
            int startGap = ((int) Math.pow(2, depth - i - 1)) - 1;
            int innerGap = ((int) Math.pow(2, depth - i)) - 1;
            String line = String.join("", Collections.nCopies(startGap, "  "));
            for (int j = (int) (Math.pow(2, i) - 1); j < Math.pow(2, i + 1) - 1; j++) {
                if (j > array.size() - 1) {
                    break;
                }
                line += (array.get(j) + String.join("", Collections.nCopies(innerGap, "  ")));
            }
            System.out.println(line);
        }
    }

    public static boolean checkResult(List<Integer> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i) > array.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    private static int depth(int size) {
        Double v = Math.log(size) / Math.log(2);
        return v.intValue() + 1;
    }

    public static void main(String[] args) {
        System.out.println(depth(8) + 1);
    }
}
