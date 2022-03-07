package videos.interediate.pulin.arac.chapter_4.using.variables.in.lambdas;

@FunctionalInterface interface BiFunction<T, U, R>{
    T apply(R r, U u);
}

public class FunctionAndBiFunction {
    public static void main(String[] args) {
/*        Function<String,Integer> f1 = String::length;
        Function<String , Integer> f2 = x -> x.length();

        System.out.println(f1.apply("cluck"));
        System.out.println(f2.apply("cluckgh"));*/

        BiFunction<String,String,String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (s,a) -> s.concat(a);

        System.out.println(b1.apply("baby ", "chick")); // baby chick
        System.out.println(b2.apply("baby ", "chick")); // baby chick
    }
}
