package com.easy.algorithm.shujujiegouyusuanfafenxi.third_chapter;

/**
 * @author daiqi
 * @create 2018-10-30 19:01
 */
public class FeiboLaqi {
    public static void main(String[] args) {
        System.out.println(Fibonacci2(50));
    }

    public static long Fibonacci2(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return Fibonacci2(n -1 ) + Fibonacci2(n - 2);
        }
    }

    public static long Fibonacci1(int n ) {
        if (n < 2) {
            return 1;
        }
        long num1 = 1;
        long num2 = 1;
        for (int i = 2; i < n - 1; ++i) {
            num2 = num1 + num2;
            num1 = num2 - num1;
        }
        return num1 + num2;
    }
}
