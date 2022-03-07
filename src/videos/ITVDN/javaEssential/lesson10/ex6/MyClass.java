package videos.ITVDN.javaEssential.lesson10.ex6;

public class MyClass<T> {
    public T add(T a, T b) {
        if (a.getClass().equals(Integer.class)){
            return (T)(Object)((Integer) a + (Integer) b);
        }

        if (a.getClass().equals(Double.class)){
            return (T)(Object)((Double) a + (Double) b);
        }

        return (T)(Object) 0;
    }
}

class Main{
    public static void main(String[] args) {
        MyClass<Integer> myClass = new MyClass<>();
        int sum = myClass.add(2,3);
        System.out.println(sum);
    }
}
