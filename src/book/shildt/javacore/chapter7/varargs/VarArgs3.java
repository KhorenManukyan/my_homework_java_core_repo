package book.shildt.javacore.chapter7.varargs;

public class VarArgs3 {
    static void vaTest(int ...v){
        System.out.print("vaTest(int ...): argumentneri qanak@:" + v.length + " Parunakutyun: " );
        for (int x: v){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(boolean ... v){
        System.out.print("vaTest(boolean ...): argumentneri qanak@:" + v.length + " Parunakutyun: ");

        for (boolean x : v){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(String msg, int ...v){
        System.out.print("vaTest(String, int ...): argumentneri qanak@:" +msg + v.length + " Parunakutyun: " );
        for (int x: v){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest("Stugum: " + 10, 20);
        vaTest(true, false, false,true,true);
    }
}
