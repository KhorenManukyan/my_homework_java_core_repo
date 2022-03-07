package book.shildt.javacore.chapter7;

public class UseStatic {
     static int a = 3;
     static int b;

     UseStatic(int a, int b){
         this.a = a;
         this.b = b;
     }
    {
        System.out.println("datark block");
    }

     static void method(int x){
         System.out.println(x);
     }

     static {
         System.out.println("block");
     }



    public static void main(String[] args) {
         UseStatic u = new UseStatic(1,2);
        System.out.println(a);
        System.out.println(b);

        method(4);


    }
}
