class MyQueue {
    private Stack<Integer> stackIn;
    private Stack<Integer> stackOut;
    public MyQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }
    
    public void push(int x) {
        stackIn.push(x);
    }
    
    public int pop() {
        shiftStack();
        return stackOut.pop();
    }
    
    public int peek() {
        shiftStack();
        return stackOut.peek();
    }
    
    public boolean empty() {
       return stackIn.isEmpty() && stackOut.isEmpty();
    }
    public void shiftStack(){
        if(stackOut.isEmpty()){
            while(!stackIn.isEmpty()){
                stackOut.push(stackIn.pop());
            }
        }
    }
}