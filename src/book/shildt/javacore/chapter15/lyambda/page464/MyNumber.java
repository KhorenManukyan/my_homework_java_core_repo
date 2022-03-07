package book.shildt.javacore.chapter15.lyambda.page464;

@FunctionalInterface
public interface MyNumber {
    String getValue();
}

class LambdaDemo {
    public static void main(String[] args) {
//        MyNumber myNum = () -> 123.45;
//        System.out.println(myNum.getValue());
//
//        myNum = () -> Math.random() * 100;
//        System.out.println(myNum.getValue());

        MyNumber myNum = () -> "123.45";
        System.out.println(myNum.getValue());

    }
}
