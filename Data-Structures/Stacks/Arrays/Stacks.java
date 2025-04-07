public class Stacks{
    int size;
    int[] array;
    int top;

    public Stacks(int size){
        this.top = -1;
        this.size = size;
        this.array = new int[size];
    }

    public void push(int element){
        if(top < size-1){
            array[top++] = element;
            System.out.println("Inserted the"+element+"in the stack");
        }
        else{
            System.out.println("Stack is full!");
        }
    }

    public int pop(){
        if(!this.isEmpty()){
            int removed = top;
            top--;
            System.out.println("Inserted the"+array[removed]+"in the stack");
            return array[removed];
        }
        else{
            System.out.println("Stack is Empty!");
            return -1;
        }
    }
    
    public boolean isEmpty(){
        return top == -1;
    }

    public int peek(){
       if(!this.isEmpty()){
           return arr[top];
       }
       else{
           SYstem.out.println("Stack is Empty!");
           return -1;
       }
    }

}