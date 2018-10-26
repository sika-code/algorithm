package com.easy.algorithm.shujujiegouyusuanfafenxi.third_chapter;

/**
 * 3.04给定两个已排序的表L1和L2，只使用基本的表操作编写计算L1与L2的交集
 */
public class The3_04 {
    public static int [] beMixed(int [] L1, int [] L2) {
        if (L1 == null || L1.length == 0) {
            return null;
        }
        if (L2 == null || L2.length == 0) {
            return null;
        }
        int mixedLength = Math.max(L1.length, L2.length);

        int [] mixedArray = new int [mixedLength];
        int mixedArrayIndex = 0;
        int l2_index = 0;
        for (int i = 0 ; i < L1.length; ++i) {
            for (int j = l2_index ; j < L2.length; ++j) {
                if (L1[i] == L2[j]) {
                    l2_index = j;
                    mixedArray[mixedArrayIndex++] = L2[j];
                    break;
                }
            }
        }
        return mixedArray;
    }
}
