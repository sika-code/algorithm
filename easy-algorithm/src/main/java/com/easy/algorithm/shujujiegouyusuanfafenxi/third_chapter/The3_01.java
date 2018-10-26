package com.easy.algorithm.shujujiegouyusuanfafenxi.third_chapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据结构与算法分析3.1题
 * 给定一个表L和另一个表P，它们包含以升序排列的整数。操作pinrtLots(L，P）将打印L中那些由P所指定的位置上的元素。
 * 例如P=1,3,4,6，那么，L中位于第1、第3、第4、第6个位置上的元素被打印。
 * 写出过程printLots(L,P)。只可使用public型的Collections API容器操作。该过程运行时间是多少？
 */
public class The3_01 {
    public static void main(String[] args) {
        List<Integer> L = new ArrayList<Integer>();
        L.add(0);
        L.add(1);
        L.add(2);
        L.add(3);
        L.add(4);
        L.add(5);
        L.add(6);
        L.add(7);
        List<Integer> P = new ArrayList<Integer>();
        P.add(1);
        P.add(3);
        P.add(4);
        P.add(6);

        printLots(L, P);

    }

    // 若L底层为链表则时间复杂度为O(P.size() * L.size())
    // 若L底层为数组则时间复杂度为O(P.size())
    public static void printLots(List<Integer> L, List<Integer> P) {
        if (L == null || L.size() == 0) {
            return;
        }
        if (P == null || P.size() == 0) {
            return;
        }
        int l_size = L.size();
        for (Integer p : P) {
            if (p < l_size) {
                System.out.println(L.get(p));
            }
        }
    }
}
