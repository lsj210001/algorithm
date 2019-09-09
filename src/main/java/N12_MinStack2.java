import java.util.Stack;

public class N12_MinStack2 {
    Stack<Integer> stackData;
    Stack<Integer> stackMin;

    public N12_MinStack2() {
        stackData = new Stack<Integer>();
        stackMin = new Stack<Integer>();
    }

    /*
     * @param number: An integer
     * @return: nothing
     */
    public void push(int number) {
        if (stackMin.isEmpty()) {
            stackMin.push(number);
        } else {
            stackMin.push(Math.min(number, min()));
        }
        stackData.push(number);
    }

    /*
     * @return: An integer
     */
    public int pop() {
        stackMin.pop();
        return stackData.pop();
    }

    /*
     * @return: An integer
     */
    public int min() {
        return stackMin.peek();
    }
}
