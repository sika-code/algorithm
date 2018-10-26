package com.easy.algorithm.linkedlist.list;

import com.easy.algorithm.linkedlist.node.OneWayNode;

/**
 * @author daiqi
 * @create 2018-10-23 10:57
 */
public class OneWayList<T>  extends BaseList<T>{
    private OneWayNode<T> tail;

    @Override
    public void add(T data) {
        OneWayNode newOneWayNode = new OneWayNode(data);
        if (getHead() == null) {
            setHead(newOneWayNode);
        }
        if (tail == null) {
            tail = newOneWayNode;
        } else {
            tail.setNext(newOneWayNode);
            tail = newOneWayNode;
        }
        addSize();
    }

    public OneWayNode<T> getTail() {
        return tail;
    }

    public static void main(String[] args) {
        OneWayList<Integer> oneWayList = new OneWayList<Integer>();
        oneWayList.add(1);
        oneWayList.add(2);
        oneWayList.add(3);
        oneWayList.add(4);

        oneWayList.print();
    }
}
