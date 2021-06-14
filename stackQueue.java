/* implement a last in first out (LIFO) stack using only two queues. The 
implemented stack should support all the functions of a 
normal queue (push, top, pop, and empty).

Implement the MyStack class:

void push(int x) Pushes element x to the top of the stack.
int pop() Removes the element on the top of the stack and returns it.
int top() Returns the element on the top of the stack.
boolean empty() Returns true if the stack is empty, false otherwise.

Notes:
You must use only standard operations of a queue, which means only push to back, 
peek/pop from front, size, and is empty operations are valid.
Depending on your language, the queue may not be supported natively. 
You may simulate a queue using a list or deque (double-ended queue), 
as long as you use only a queue's standard operations.

*/
import java.util.*;
class Test {

    /** Initialize your data structure here. */
    Queue<Integer>q1;
    Queue<Integer>q2;
    int top;
    public Test() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        q2.add(x);
        top=x;
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        Queue<Integer>temp=q1;
        q1=q2;
        q2=temp;
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int returnval=q1.remove();
        if(!q1.isEmpty()){
            top=q1.peek();
        }
        return returnval;
    }
    
    /** Get the front element. */
    public int peek() {
        return q1.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Test t=new Test();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            t.push(sc.nextInt());
            
        System.out.println(t.pop());
        System.out.println(t.peek());
        System.out.println(t.empty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
