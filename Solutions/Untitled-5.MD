## First Solution

```java
class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;
    int top;
    int pop;
    
    /** Initialize your data structure here. */
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        top = x;
        q2.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while (q2.size() != 1) q1.add(q2.remove());
        pop = q2.remove();
        while (q1.size() != 0) q2.add(q1.remove());
        return pop;
    }
    
    /** Get the top element. */
    public int top() {
        while (q2.size() != 1) q1.add(q2.remove());
        top = q2.remove();
        q1.add(top);
        while (q1.size() != 0) q2.add(q1.remove());
        return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
```