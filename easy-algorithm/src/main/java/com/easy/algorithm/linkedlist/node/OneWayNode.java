package com.easy.algorithm.linkedlist.node;

/**
 * @author daiqi
 * @create 2018-10-23 10:18
 */
public class OneWayNode<T> extends BaseNode<T>{
    /** 下一个节点 */
    private OneWayNode<T> next;

    public OneWayNode(T data) {
       super(data);
    }

    @Override
    public OneWayNode<T> getNext() {
        return next;
    }

    public void setNext(OneWayNode<T> next) {
        this.next = next;
    }
}
