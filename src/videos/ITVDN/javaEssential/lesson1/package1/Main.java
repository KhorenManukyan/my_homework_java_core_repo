package videos.ITVDN.javaEssential.lesson1.package1;

import videos.ITVDN.javaEssential.lesson1.package2.ExampleInPackage2;
import videos.ITVDN.javaEssential.lesson1.package2.Parent;

public class Main extends Parent {
    public static void main(String[] args) {
        ExampleInPackage1 e1 = new ExampleInPackage1();
//        System.out.println(e1.name1);
        System.out.println(e1.name2);
        System.out.println(e1.name3);
        System.out.println(e1.name4);
        ExampleInPackage2 e2 = new ExampleInPackage2();
//        System.out.println(e2.name1);
//        System.out.println(e2.name2);
//        System.out.println(e2.name3);
        System.out.println(e2.name4);
        Parent parent = new Parent();
//        System.out.println(parent.name1);
//        System.out.println(parent.name2);
//        System.out.println(parent.name3);
        System.out.println(parent.name4);
        Main m = new Main();
//        System.out.println(m.name1);
//        System.out.println(m.name2);
        System.out.println(m.name3);
        System.out.println(m.name4);
    }
}
