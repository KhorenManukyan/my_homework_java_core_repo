package book.ocp.chapter3.bounds;

import java.util.ArrayList;
import java.util.List;

public class page123<T> {
    public static void main(String[] args) {
        List<?> list1 = new ArrayList<A>();
        List<? extends A> list2 = new ArrayList<A>();
//        List<? extends B> list4 = new ArrayList<A>();
//        List<? extends C> list5 = new ArrayList<A>();
        List<? super A> list3 = new ArrayList<A>();
        List<? super B> list6 = new ArrayList<A>();
        List<? super C> list7 = new ArrayList<A>();
    }
}

class A{}
class B extends A{}
class C extends B{}