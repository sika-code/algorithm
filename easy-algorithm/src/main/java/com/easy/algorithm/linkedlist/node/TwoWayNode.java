package com.easy.algorithm.linkedlist.node;

/**
 * @author daiqi
 * @create 2018-10-23 10:46
 */
public class TwoWayNode<T> extends BaseNode<T> {
    /** 上一个节点 */
    private TwoWayNode<T> pre;
    /** 下一个节点 */
    private TwoWayNode<T> next;

    public TwoWayNode(T data) {
        super(data);
    }

    public TwoWayNode<T> getPre() {
        return pre;
    }

    public void setPre(TwoWayNode<T> pre) {
        this.pre = pre;
    }

    @Override
    public TwoWayNode<T> getNext() {
        return next;
    }

    public void setNext(TwoWayNode<T> next) {
        this.next = next;
    }
}
