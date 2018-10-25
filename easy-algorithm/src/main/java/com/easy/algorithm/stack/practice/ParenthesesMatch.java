package com.easy.algorithm.stack.practice;


import com.easy.algorithm.stack.base.ArrayStack;

import java.util.*;

/**
 * 括号匹配联系
 * 使用栈实现
 */
public class ParenthesesMatch {
    private static Character[] leftParentheses = {'(', '{', '[', '<'};
    private static Character[] rightParentheses = {')', '}', ']', '>'};
    private static Map<Character, Character> rightLeftMap = new HashMap<Character, Character>();
    static {
        for (int i = 0 ; i < leftParentheses.length; ++i) {
            rightLeftMap.put(rightParentheses[i], leftParentheses[i]);
        }
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new LinkedList<Integer>();
        for (int i = 0 ; i< 4000000; ++i) {
            arrayList.add(i);
        }

        Long preTime = System.currentTimeMillis();
        for (int i = 0 ; i < arrayList.size(); ++i) {
            if (i % 1000 == 0 ) {
                System.out.println("");
            }
        }
        Long costTime = System.currentTimeMillis() - preTime;
        System.out.println("所用的时间为：" + costTime);
    }

    public static void testMatch() {
        String str = "(rewar{ertg[<rrewr>ew]ew})";
        System.out.println(match(str));
    }

    public static boolean match(String str) {
        ArrayStack stack = new ArrayStack();
        if (str == null || "".equals(str.trim())) {
            return true;
        }
        for (int i = 0; i < str.length(); ++i) {
            Character c = str.charAt(i);
            if (isLeftParentheses(c)) {
                stack.push(c);
            } else if(isRightParentheses(c)){
                Character fromStack = (Character) stack.pop();
                Character rightFromMap = rightLeftMap.get(c);
                if (fromStack == null || !fromStack.equals(rightFromMap)) {
                    return false;
                }
            }
        }
        if (stack.getIndex() == 0) {
            return true;
        }
        return false;
    }

    // 是否是左括弧
    private static boolean isLeftParentheses(Character c) {
        for (int i = 0; i < leftParentheses.length; ++i) {
            if (leftParentheses[i] == c) {
                return true;
            }
        }
        return false;
    }

    // 是否是右括弧
    private static boolean isRightParentheses(Character c) {
        for (int i = 0; i < rightParentheses.length; ++i) {
            if (rightParentheses[i] == c) {
                return true;
            }
        }
        return false;
    }
}
