package com.easy.algorithm.shujujiegouyusuanfafenxi.third_chapter;

/**
 * 3.04给定两个已排序的表L1和L2，只使用基本的表操作编写计算L1与L2的交集
 */
public class The3_04 {

    public static void main(String[] args) {
        int [] L1 =  {1,2,4,5,6,7,8};
        int [] L2 =  {2,4,8,9,10,32};
        int [] mixed = beMixed(L1, L2);
        System.out.println("L1和L2的交集");
        for (int i =0 ; i < mixed.length; ++i) {
            System.out.print(mixed[i] + ",");
        }

    }
    public static int [] beMixed(int [] L1, int [] L2) {
        if (L1 == null || L1.length == 0) {
            return null;
        }
        if (L2 == null || L2.length == 0) {
            return null;
        }
        int mixedLength = Math.max(L1.length, L2.length);

        int [] tempArray = new int [mixedLength];
        int mixedArrayIndex = 0;
        int l2_index = 0;
        for (int i = 0 ; i < L1.length; ++i) {
            for (int j = l2_index ; j < L2.length; ++j) {
                if (L1[i] == L2[j]) {
                    l2_index = j;
                    tempArray[mixedArrayIndex++] = L2[j];
                    break;
                }
            }
        }
        if (mixedArrayIndex == 0) {
            return null;
        }

        int [] mixedArray = new int [mixedArrayIndex];
        for (int i = 0 ; i < mixedArrayIndex; ++i) {
            mixedArray[i] = tempArray[i];
        }
        return mixedArray;
    }
}
