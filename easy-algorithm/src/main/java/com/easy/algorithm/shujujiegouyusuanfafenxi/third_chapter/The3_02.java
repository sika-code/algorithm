package com.easy.algorithm.shujujiegouyusuanfafenxi.third_chapter;

import com.easy.algorithm.linkedlist.node.OneWayNode;
import com.easy.algorithm.linkedlist.node.TwoWayNode;

/**
 * 通过只调整链（而不是数据）来交换两个相邻的元素
 * 使用单链表、双链表
 */
public class The3_02 {

    // 交换单链表
    public static OneWayNode exchange(OneWayNode preNode, OneWayNode currentNode, OneWayNode nextNode) {
        if (preNode == null || currentNode == null || nextNode == null) {
            return preNode;
        }
        if (currentNode.getNext() != nextNode) {
            System.out.println("不是相邻节点");
            return preNode;
        }
        preNode.setNext(nextNode);
        currentNode.setNext(currentNode.getNext());
        nextNode.setNext(currentNode);
        return preNode;
    }

    // 交换双链表
    public static TwoWayNode exchange(TwoWayNode preNode, TwoWayNode currentNode, TwoWayNode nextNode) {
        if (preNode == null || currentNode == null || nextNode == null) {
            return preNode;
        }
        if (currentNode.getNext() != nextNode) {
            System.out.println("不是相邻节点");
            return preNode;
        }
        preNode.setNext(nextNode);

        currentNode.setNext(nextNode.getNext());
        currentNode.setPre(nextNode);

        nextNode.setNext(currentNode);
        nextNode.setPre(preNode);


        return preNode;
    }
}
