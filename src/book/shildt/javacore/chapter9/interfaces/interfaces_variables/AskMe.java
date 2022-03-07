package book.shildt.javacore.chapter9.interfaces.interfaces_variables;

public class AskMe implements SharedConstants{
    static void answer(int result){
        switch (result) {
            case NO:
                System.out.println("net");
                break;
            case YES:
                System.out.println("YES");
                break;
            case MAYBE:
                System.out.println("MAYBE");
                break;
            case LATER:
                System.out.println("LATER");
                break;
            case SOON:
                System.out.println("SOON");
                break;
            case NEVER:
                System.out.println("NEVER");
                break;
        }
    }
}
