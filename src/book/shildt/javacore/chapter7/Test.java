package book.shildt.javacore.chapter7;

public class Test {
    int a;
    int b;

    Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    boolean isEqualTo(Test o) {
        if (o.a == a && o.b == b) {
            return true;
        } else {
            return false;
        }
    }
}

class PassOb {
    public static void main(String[] args) {
        Test t = new Test(100, 22);
        Test t1 = new Test(100, 22);
        Test t2 = new Test(-1, -1);

        System.out.println("oЫ о Ь2: " + t.isEqualTo(t1));
        System.out.println("oЬl о ЬЗ: " + t.isEqualTo(t2));
    }
}
