class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }  
 
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()) minStack.push(val);
    }
    
    public void pop() {
        if(stack.isEmpty()) return ;
        int remove = stack.pop();
        if(minStack.peek() == remove) minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.isEmpty()? -1: minStack.peek();
    }
}
