package book.shildt.javacore.chapter7.VozvratObyektov;

public class Test {
    int a;

    Test(int a){
        this.a = a;
    }

    Test incrByTen(){
        Test t = new Test(a + 10);
        return t;
    }
}

class RetOb{
    public static void main(String[] args) {
        Test t = new Test(3);
        Test t1;

        t1 = t.incrByTen();
        System.out.println(t.a);
        System.out.println(t1.a);
        t1 = t1.incrByTen();
        System.out.println(t1.a);

    }
}
