package book.ocp.chapter3.examples;

public class CloneExample implements Cloneable{
    int a;
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneExample cloneExample = new CloneExample();

        cloneExample.a = 8;

        CloneExample cloneExample1 = (CloneExample) cloneExample.clone();
        cloneExample1.a = 10;
        System.out.println(cloneExample.a);
        System.out.println(cloneExample1.a);
    }
}
