package videos.ITVDN.javaEssential.lesson10.ex2;

public class MyGenerics <T1,T2>{
    T1 variable1;
    T2 variable2;

    public MyGenerics(T1 variable1, T2 variable2) {
        this.variable1 = variable1;
        this.variable2 = variable2;
    }
}

class Main{
    public static void main(String[] args) {
        MyGenerics<Integer,Integer> myGenerics1 = new MyGenerics<>(1,2);
        System.out.println(myGenerics1.variable1 + " " + myGenerics1.variable2);

        MyGenerics<String,Integer> myGenerics2 = new MyGenerics<>("Ash",2);
        System.out.println(myGenerics2.variable1 + " " + myGenerics2.variable2);

        MyGenerics<String,String> myGenerics3 = new MyGenerics<>("Khoren", "Vlad");
        System.out.println(myGenerics3.variable1 + " " + myGenerics3.variable2);
    }
}
















