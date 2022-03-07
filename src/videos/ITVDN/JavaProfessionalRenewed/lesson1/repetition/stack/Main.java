package videos.ITVDN.JavaProfessionalRenewed.lesson1.repetition.stack;

public class Main {
    public static void main(String[] args) {
        SimpleStack simpleStack = new SimpleStack(10);

        simpleStack.push(10);
        simpleStack.push(20);
        simpleStack.push(30);

        isEmpty(simpleStack);
    }

    private static void isEmpty(SimpleStack simpleStack) {
        while (!simpleStack.isEmpty()){
            long popElement = simpleStack.pop();
            System.out.println(popElement + " ");
        }
    }
}
