import java.util.Stack;

public class N40_MyQueue {
    Stack<Integer> stackPush;
    Stack<Integer> stackPop;

    public N40_MyQueue() {
        stackPush = new Stack<Integer>();
        stackPop = new Stack<Integer>();
    }

    /*
     * @param element: An integer
     * @return: nothing
     */
    public void push(int element) {
        stackPush.push(element);
    }

    /*
     * @return: An integer
     */
    public int pop() {
        if (stackPop.isEmpty()) {
            pour();
        }
        return stackPop.pop();
    }

    /*
     * @return: An integer
     */
    public int top() {
        if (stackPop.isEmpty()) {
            pour();
        }
        return stackPop.peek();
    }

    private void pour() {
        while (!stackPush.isEmpty()) {
            stackPop.push(stackPush.pop());
        }
    }
}
