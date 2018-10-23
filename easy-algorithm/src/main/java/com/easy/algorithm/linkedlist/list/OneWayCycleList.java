package com.easy.algorithm.linkedlist.list;

import com.easy.algorithm.linkedlist.node.OneWayNode;

/**
 * @author daiqi
 * @create 2018-10-23 10:58
 */
public class OneWayCycleList<T> extends BaseList<T> {
    private OneWayNode<T> tail;
    @Override
    public void add(T data) {
        OneWayNode newOneWayNode = new OneWayNode(data);
        if (getHead() == null) {
            setHead(newOneWayNode);
        }
        newOneWayNode.setNext((OneWayNode) getHead());
        if (tail == null) {
            tail = newOneWayNode;
        } else {
            tail.setNext(newOneWayNode);
            tail = newOneWayNode;
        }
    }


    public static void main(String[] args) {
        OneWayCycleList<Integer> oneWayCycleList = new OneWayCycleList<Integer>();
        oneWayCycleList.add(1);
        oneWayCycleList.add(2);
        oneWayCycleList.add(3);
        oneWayCycleList.add(4);

        oneWayCycleList.print();
    }
}
