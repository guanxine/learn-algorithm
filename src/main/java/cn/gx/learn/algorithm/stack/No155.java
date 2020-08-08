package cn.gx.learn.algorithm.stack;

import java.util.Stack;

//push(x) —— 将元素 x 推入栈中。
//        pop()—— 删除栈顶的元素。
//        top()—— 获取栈顶元素。
//        getMin() —— 检索栈中的最小元素。
public class No155 {


    class MinStack {

        /** initialize your data structure here. */
        Stack<Integer> stack;
        int min = Integer.MAX_VALUE;
        public MinStack() {

            stack = new Stack<>();
        }

        public void push(int x) {
            if (x <= min) { // // 特别注意这里
                stack.push(min);
                min = x;
            }
            stack.push(x);
        }

        public void pop() {
            Integer pop = stack.pop();
            if (pop == min) {
                min = stack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin(){
            return min;
        }
    }


    class MinStack1 {

        /** initialize your data structure here. */
        Stack<Integer> stack;
        Stack<Integer> minStack;
        public MinStack1() {

            stack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int x) {

            if (minStack.isEmpty() || x <= getMin()) {
                minStack.push(x);
            }
            stack.push(x);
        }

        public void pop() {
            if (stack.pop().equals(getMin())) {
                minStack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin(){
            return minStack.peek();
        }
    }
    public static void main(String[] args) {

    }
}
