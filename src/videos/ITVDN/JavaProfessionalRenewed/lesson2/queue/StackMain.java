package videos.ITVDN.JavaProfessionalRenewed.lesson2.queue;

public class StackMain {
    public static void main(String[] args) {
        SimpleStack simpleStack = new SimpleStack(10);
        simpleStack.push(10);
        simpleStack.push(20);
        simpleStack.push(30);
        System.out.println(simpleStack.pop());
        System.out.println(simpleStack.peek());
        System.out.println(simpleStack.isEmpty());

        isEmpty(simpleStack);
    }

    private static void isEmpty(SimpleStack simpleStack) {
        while (!simpleStack.isEmpty()){
            long popElement = simpleStack.peek();
            System.out.println(popElement + " ");
        }
    }
}
