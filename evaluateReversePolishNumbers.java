class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String num: tokens){
            switch(num){
                case "+":
                stack.push(stack.pop()+stack.pop());
                break;
                case "-":
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b-a);
                break;
                case "*":
                stack.push(stack.pop()*stack.pop());
                break;
                case "/":
                int divisor = stack.pop();
                int dividend = stack.pop();
                stack.push(dividend/divisor);
                break;
                default:
                stack.push(Integer.parseInt(num));
            }
        }
        return stack.pop();
    }
}