package book.shildt.javacore.chapter7.varargs;

public class VarArgs {
    static void vaTest(String msg, int ... v){
        System.out.print(msg + v.length + " Parunakutyun: ");

        for(int x: v){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("Mek parametr, erkarutyun@: ", 10);
        vaTest("Ereq parametr, erkarutyun@: ", 1,2,3);
        vaTest("Aranc parametr, erkarutyun@: ");
    }
}
