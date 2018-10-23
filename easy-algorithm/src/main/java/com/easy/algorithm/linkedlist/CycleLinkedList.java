package com.easy.algorithm.linkedlist;

import com.easy.algorithm.linkedlist.list.OneWayList;
import com.easy.algorithm.linkedlist.node.BaseNode;
import com.easy.algorithm.linkedlist.node.OneWayNode;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 单向环形链表
 *
 * @author daiqi
 * @create 2018-10-23 10:16
 */
public class CycleLinkedList {
    public static void main(String[] args) {
        OneWayList<Integer> oneWayList = new OneWayList<Integer>();
        for (int i = 0; i < 199; ++i) {
            oneWayList.add(i);
        }
        initCycle(oneWayList, 198);
        System.out.println(hasCycle1(oneWayList.getHead()));
        System.out.println(hasCycle(oneWayList.getHead()));
    }


    private static <T> void initCycle(OneWayList<T> oneWayList, Integer index) {
        if (index < 0) {
            return;
        }
        Integer count = 0;
        OneWayNode<Integer> oneWayNode = (OneWayNode<Integer>) oneWayList.getHead();
        while (index != null) {

            if (count >= index) {
                oneWayList.getTail().setNext((OneWayNode<T>) oneWayNode);
                break;
            }
            count++;
            oneWayNode = oneWayNode.getNext();
        }

    }

    public static  <T> boolean hasCycle(BaseNode<T> oneWayNode) {
        Long beginTimestamp = System.currentTimeMillis();
        Set<BaseNode> oneWayNodeSet = new HashSet<BaseNode>();
        BaseNode<T> oneWayNodeTemp = oneWayNode;
        while (oneWayNodeTemp != null) {
            if (oneWayNodeSet.contains(oneWayNodeTemp)) {
                System.out.println("所用时间为：" + (System.currentTimeMillis() - beginTimestamp));
                return true;
            }
            oneWayNodeSet.add(oneWayNodeTemp);
            oneWayNodeTemp = oneWayNodeTemp.getNext();
        }
        System.out.println("所用时间为：" + (System.currentTimeMillis() - beginTimestamp));
        return false;
    }

    public static boolean hasCycle1(BaseNode oneWayNode) {
        Long beginTimestamp = System.currentTimeMillis();
        BaseNode slowNode = oneWayNode;
        BaseNode fastNode = oneWayNode;
        while (fastNode != null && fastNode.getNext() != null) {
            slowNode = slowNode.getNext();
            fastNode = fastNode.getNext().getNext();
            if (slowNode == fastNode) {
                System.out.println("所用时间为：" + (System.currentTimeMillis() - beginTimestamp));
                return true;
            }
        }
        System.out.println("所用时间为：" + (System.currentTimeMillis() - beginTimestamp));
        return false;

    }

}
