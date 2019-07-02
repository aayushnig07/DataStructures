package stacks;

class StackUsingArrays{
    int max=1000;
    int top;
    int []stack=new int[max-1];

    StackUsingArrays(){
        this.top=-1;
    }

    public boolean isEmpty(){
        return (this.top<0);
    }
    public boolean isFull(){
        return (this.top>=max);
    }

    public void push(int item){
        if(isFull()){
            System.out.println("Stack overflow");
            return;
        }
        else{
            stack[++top] = item;
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return;
        }
        else{
            int item = stack[top];
            top--;
            System.out.println("Item popped = "+ item);
        }
    }

    public static void main(String[]args) {
        StackUsingArrays obj = new StackUsingArrays();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        
    }
}