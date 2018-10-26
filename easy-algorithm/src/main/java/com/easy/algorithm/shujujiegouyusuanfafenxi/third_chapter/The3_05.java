package com.easy.algorithm.shujujiegouyusuanfafenxi.third_chapter;

/**
 * 给定两个已排序的表L2和L2，只使用基本的表操作编写计算L1与L2的并集
 */
public class The3_05 {
    public static void main(String[] args) {
        int [] L1 =  {1,2,4,5,6,7,8};
        int [] L2 =  {2,4,8,9,10,32};
        int [] union = union(L1, L2);
        System.out.println("L1和L2的并集");
        for (int i =0 ; i < union.length; ++i) {
            System.out.print(union[i] + ",");
        }
    }

    public static int [] union(int [] L1, int [] L2) {
        if (L1 == null || L1.length == 0) {
            return L2;
        }
        if (L2 == null || L2.length == 0) {
            return L1;
        }
        int [] tempArray = new int[L1.length + L2.length];
        int unionIndex = 0;
        for (int i = 0 ; i < L1.length; ++i) {
            boolean exist = false;
            for (int j = 0 ; j < unionIndex ; ++j) {
                if (L1[i] == tempArray[j]) {
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                tempArray[unionIndex++ ] = L1[i];
            }
        }

        for (int i = 0 ; i < L2.length; ++i) {
            boolean exist = false;
            for (int j = 0 ; j < unionIndex ; ++j) {
                if (L2[i] == tempArray[j]) {
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                tempArray[unionIndex++ ] = L2[i];
            }
        }
        int [] unionArray = new int [unionIndex];
        for (int i = 0 ; i < unionIndex ; ++i) {
            unionArray[i] = tempArray[i];
        }
        return unionArray;
    }
}
