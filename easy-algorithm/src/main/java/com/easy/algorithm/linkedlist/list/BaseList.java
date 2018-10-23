package com.easy.algorithm.linkedlist.list;

import com.easy.algorithm.linkedlist.node.BaseNode;

/**
 * @author daiqi
 * @create 2018-10-23 11:23
 */
public abstract class BaseList<T> {
    private BaseNode<T> head;

   public abstract void add(T data);

   public void print() {
       BaseNode<T> tempNode = getHead();
       while (tempNode != null) {
           System.out.println(tempNode.getData());
           tempNode = tempNode.getNext();
           if (tempNode == getHead()) {
               break;
           }
       }
   }

    public BaseNode<T> getHead() {
        return head;
    }

    public void setHead(BaseNode<T> head) {
        this.head = head;
    }
}
