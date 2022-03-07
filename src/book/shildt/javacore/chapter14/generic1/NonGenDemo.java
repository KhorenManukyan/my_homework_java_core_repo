package book.shildt.javacore.chapter14.generic1;

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iob = new NonGen(88);
        iob.showType();
        int v = (int) iob.getOb();
        System.out.println("Знaчeниe: " + v);
        System.out.println();

        NonGen strOb = new NonGen("test");
        strOb.showType();
        String str = (String) strOb.getOb();
        System.out.println("Знaчeниe: " + str);
    }
}
