package run;

import java.util.Stack;
public class Application4 {
    public static void main(String[] args) {
        /*Stack
        * Last input First output
        * */

        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
        System.out.println(integerStack);
        System.out.println(integerStack.search(5));

        // peek() : 해당 스택의 가장 마지막에 있는 요소 반환
        // pop() : 해당 스택의 가장 마지막에 있는 요소 반환 후 제거

        System.out.println(integerStack.peek());
        System.out.println(integerStack);
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());

        System.out.println(integerStack);

    }
}
