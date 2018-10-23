package com.easy.algorithm.linkedlist.node;

/**
 * @author daiqi
 * @create 2018-10-23 10:20
 */
public class BaseNode<T> {
    private T data;

    public BaseNode() {
    }

    public BaseNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BaseNode<T> getNext() {
        return null;
    }

}
