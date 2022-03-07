package book.shildt.javacore.chapter9.interfaces.stack1;

public class FixedStack implements IntStack{
    private int stack[];
    private int tos;

    public FixedStack(int size) {
        stack = new int[size];
        this.tos = -1;
    }

    @Override
    public void push(int item) {
        if (tos == stack.length-1){
            System.out.println("Stack zapolnen");
        } else {
            stack[++tos] = item;
        }
    }

    @Override
    public int pop() {
        if (tos < 0){
            System.out.println("Stack ne zagrujen");
            return 0;
        }else {
            return stack[tos--];
        }
    }
}
