package com.easy.algorithm.linkedlist.list;

import com.easy.algorithm.linkedlist.node.BaseNode;
import com.easy.algorithm.linkedlist.node.TwoWayNode;

/**
 * @author daiqi
 * @create 2018-10-23 10:58
 */
public class TwoWayList<T>  extends BaseList<T>{
    private TwoWayNode<T> head;
    private TwoWayNode<T> tail;
    @Override
    public void add(T data) {
        TwoWayNode twoWayNode = new TwoWayNode(data);
        if (head == null) {
            head = twoWayNode;
        }
        if (tail == null) {
            tail = twoWayNode;
        } else {
            tail.setNext(twoWayNode);
            twoWayNode.setPre(tail);
            tail = twoWayNode;
        }
        addSize();
    }

    @Override
    public BaseNode<T> getHead() {
        return this.head;
    }

    public static void main(String[] args) {
        BaseList<Integer> twoList = new TwoWayList<Integer>();
        twoList.add(1);
        twoList.add(2);
        twoList.add(3);
        twoList.add(4);

        twoList.print();
    }

}
