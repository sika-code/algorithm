package com.easy.algorithm.stack.base;

/**
 * 数组堆栈
 */
public class ArrayStack {
    private static int INIT_SIZE= 10;
    private int size = INIT_SIZE;
    private int index = 0;
    private Object [] stack = new Object [size];
    public Object pop() {
        if (this.index == 0) {
            return null;
        }
        this.index --;

        Object object = stack[index];
        stack[index] = null;
        return object;
    }

    public Object push(Object obj) {
        if (this.index + 1>= this.size) {
            doDilatation();
        }
        this.stack[this.index] = obj;
        this.index ++;
        return obj;
    }
    // 获取扩容系数
    private int getDilatationRatio() {
        return this.size / 2 * 3;
    }
    // 扩容
    private void doDilatation() {
        // 重新创建数组，复制
        int dilatation = getDilatationRatio();
        Object [] newArray = new Object[dilatation];
        for (int i = 0 ; i < stack.length ; ++ i) {
            newArray[i] = stack[i];
        }
        this.size = dilatation;
        this.stack = newArray;
    }

    public  int getCount() {
        return index + 1;
    }
    public int getIndex() {
        return index;
    }

    public int getSize() {
        return size;
    }
}
