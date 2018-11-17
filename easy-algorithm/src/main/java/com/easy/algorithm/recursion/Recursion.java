package com.easy.algorithm.recursion;

import org.junit.Test;

/**
 * @author daiqi
 * @create 2018-10-31 15:36
 */
public class Recursion {

    @Test
    public void testFactorial() {
        System.out.println(32>>>1);
        System.out.println(factorial(4));
    }

    // 阶乘
    public long factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    @Test
    public void testhanoi() {
        int n = 5;
        //获取总的步数
        System.out.println("需要移动的总步数为:" + getSum(n));
        //获取移动的过程
        hm(n, 'a', 'b', 'c');
    }

    //获取总步数
    public long getSum(int n) {
        if (n == 1)
            return 1;
        return 2 * getSum(n - 1) + 1;
    }

    //获取移动的过程
    public void hm(int m, char a, char b, char c) {
        if (m == 1) {
            move(m, a, c);
            return;
        }

        hm(m - 1, a, c, b);
        move(m, a, c);
        hm(m - 1, b, a, c);
    }

    //输出一次移动的过程
    public void move(int m , char a, char c) {
        System.out.println("移动第" + m + "\t" +  a + "-->" + c + "  ");
    }
}
