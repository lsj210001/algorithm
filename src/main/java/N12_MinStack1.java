import java.util.Stack;

public class N12_MinStack1 {
    Stack<Integer> stackData;
    Stack<Integer> stackMin;

    public N12_MinStack1() {
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
        } else if (number <= min()) {
            stackMin.push(number);
        }
        stackData.push(number);
    }

    /*
     * @return: An integer
     */
    public int pop() {
        int value = stackData.pop();
        if (value == min()) {
            stackMin.pop();
        }
        return value;
    }

    /*
     * @return: An integer
     */
    public int min() {
        return stackMin.peek();
    }
}