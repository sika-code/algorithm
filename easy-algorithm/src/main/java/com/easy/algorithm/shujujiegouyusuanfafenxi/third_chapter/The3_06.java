package com.easy.algorithm.shujujiegouyusuanfafenxi.third_chapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Josephus问题
 * N个人编号从1到N，围坐成一个圆圈。
 * 从1开始传递一个热土豆。经过M次传递后拿到热土豆的人被清除离场，围坐的圆圈缩紧。
 * 由坐在被清除的人后面的人拿起热土豆继续进行游戏。最后剩下的人取胜。
 * 因此，如果M=0 和 N= 5，则游戏人依次被清除，5号游戏人获胜。
 * 如果M=1，N=5，那么被清除的人的顺序是2,4,1,5。3号获胜
 *
 * <pre>
 * a.编写一个程序解决M和N在一般值下的Josephus问题，应使程序尽可能的高效，要确保清除各个单元
 * b.你的程序运行时间复杂度是多少
 * </pre>
 * <p>
 * 单项循环链表
 */
public class The3_06 {

    public static void main(String[] args) {
        System.out.println("剩余的人：" + josephus(6, 50));
    }

    public static int josephus(int M, int N) {

        List<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i < N; ++i) {
            linkedList.add(i + 1);
        }
        Long startTime = System.currentTimeMillis();
        int restMen = josephus2(linkedList, M);
        System.out.println("所用的时间为：" + (System.currentTimeMillis() - startTime));
        return restMen;
    }

    private static int josephus1(List<Integer> list, int M) {
        int i = 0;
        while (list.size() > 1) {
            for (int j = 0; j < M; ++j) {
                i++;
            }
            if (i >= list.size()) {
                i = i % list.size();
            }
//            System.out.println("移除的为：" + linkedList.get(i));
            list.remove(i);
        }
        return list.get(0);
    }

    private static int josephus2(List<Integer> list, int M) {
        int count = 0;
        Iterator<Integer> ite = list.iterator();
        while (list.size() > 1) {
            if (!ite.hasNext()) {
                ite = list.iterator();
            }
            int temp = -1;
            while (ite.hasNext() && count++ <= M) {
                temp = ite.next();
            }
            if (count > M) {
                count = 0;
//               System.out.println("移除的数据为：" + temp);
                ite.remove();
            }
        }
        return list.get(0);
    }
}
