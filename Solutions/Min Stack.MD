## First Solution

```java
class MinStack {
    LinkedList<Integer> l = new LinkedList<>();
    int min = Integer.MAX_VALUE;
    
    
    /** initialize your data structure here. */
    public MinStack() {

    }
    
    public void push(int x) {
        if (x <= min) min = x;
        else if (l.indexOf(min) == -1) min = x;
        l.add(min);
        l.add(x);
    }
    
    public void pop() {
        l.removeLast();
        l.removeLast();
        if (!l.isEmpty()) {
            int z = l.size();
            min = l.get(z-2);
        }
    }
    
    public int top() {
        return l.peekLast();
    }
    
    public int getMin() {
        int z = l.size();
        return l.get(z-2);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
```

## Second Solution

```java
class MinStack {
    Stack<Integer> one;
    Stack<Integer> two;
    
    /** initialize your data structure here. */
    public MinStack() {
        one = new Stack<>();
        two = new Stack<>();
    }
    
    public void push(int x) {
        one.push(x);
        if (two.isEmpty() || x <= two.peek()) two.push(x);
    }
    
    public void pop() {
        int x = one.pop();
        if (two.peek() == x) two.pop();
    }
    
    public int top() {
        return one.peek();
    }
    
    public int getMin() {
       return two.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
```