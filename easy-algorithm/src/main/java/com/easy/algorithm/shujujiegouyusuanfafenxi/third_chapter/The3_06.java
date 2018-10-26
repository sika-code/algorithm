package com.easy.algorithm.shujujiegouyusuanfafenxi.third_chapter;

import com.easy.algorithm.linkedlist.list.OneWayCycleList;
import com.easy.algorithm.linkedlist.list.TwoWayCycleList;
import com.easy.algorithm.linkedlist.node.OneWayNode;
import com.easy.algorithm.linkedlist.node.TwoWayNode;

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
 *
 * 单项循环链表
 */
public class The3_06 {

    public static void main(String[] args) {
        System.out.println("剩余的人：" + josephus(0, 5));
    }

    public static int josephus(int M, int N) {
        if (N == 0 || N == 1) {
            return N;
        }
        TwoWayCycleList<Integer> twoWayCycleList = new TwoWayCycleList<Integer>();
        // 数值从1开始
        for (int i = 1 ; i <= N; ++i) {
            twoWayCycleList.add(i);
        }
        int currentCount = 1;
        TwoWayNode<Integer> needRemoveNode = (TwoWayNode<Integer>) twoWayCycleList.getHead();
        int restNum = N;
        while (restNum > 1) {
            while (currentCount <= M) {
                currentCount ++;
                needRemoveNode = needRemoveNode.getNext();
            }
            needRemoveNode.getPre().setNext(needRemoveNode.getNext());
            needRemoveNode.getNext().setPre(needRemoveNode.getPre());
            restNum -- ;
        }
        return needRemoveNode.getData();
    }
}
