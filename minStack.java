/*
Design a stack that supports push, pop, top, 
and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
 

Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2
 

Constraints:

-231 <= val <= 231 - 1
Methods pop, top and getMin operations will always be called on non-empty stacks.
At most 3 * 104 calls will be made to push, pop, top, and getMin.


*/
import java.util.*;
class MinStack {

    /** initialize your data structure here. */
    Stack<Integer>st;
    Stack<Integer>min;
    public MinStack() {
        st=new Stack();
        min=new Stack();
    }
    
    public void push(int val) {
        if(min.isEmpty() || val<=min.peek()){
            min.push(val);
        }
        st.push(val);
    }
    
    public void pop() {
        if(st.peek().equals(min.peek())){
            min.pop();
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
    public static void main(String[] atgs)
    {
        Scanner sc=new Scanner(System.in);
        MinStack ms=new MinStack();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            ms.push(sc.nextInt());
        }
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.top());
        System.out.println(ms.getMin());
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
