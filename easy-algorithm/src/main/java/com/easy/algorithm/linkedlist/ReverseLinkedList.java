package com.easy.algorithm.linkedlist;

import com.easy.algorithm.linkedlist.list.OneWayList;
import com.easy.algorithm.linkedlist.node.OneWayNode;

/**
 * 反转链表
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        OneWayList<Integer> oneWayList = new OneWayList<Integer>();
        for (int i = 0 ; i < 10 ; ++ i) {
            oneWayList.add(i);
        }
        OneWayNode reverseNode = reverse((OneWayNode<Integer>) oneWayList.getHead());
        oneWayList.setHead(reverseNode);
        oneWayList.print();
    }

    public static OneWayNode<Integer> reverse(OneWayNode<Integer> headNode) {
        if (headNode == null || headNode.getNext() == null) {
            return headNode;
        }
        OneWayNode<Integer> preNode = null;
        OneWayNode<Integer> currentNode = headNode;
        OneWayNode<Integer> nextNode = headNode.getNext();
        while (nextNode != null) {
            currentNode.setNext(preNode);
            preNode = currentNode;
            currentNode = nextNode;
            nextNode = nextNode.getNext();
        }
        currentNode.setNext(preNode);
        headNode = currentNode;
        return headNode;
    }
}
