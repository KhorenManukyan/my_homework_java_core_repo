package book.ocp.chapter2.pattern.immutable.design.patterns.singltone.lazy.instantiation;

public class VisitorTicketTracker {
    private static volatile VisitorTicketTracker instance;
    private VisitorTicketTracker(){}

    public static VisitorTicketTracker getInstance(){
        if (instance == null){
            instance = new VisitorTicketTracker();
        }
        return instance;
    }

    public static synchronized VisitorTicketTracker getInstance1(){
        if (instance == null){
            instance = new VisitorTicketTracker();
        }
        return instance;
    }

    public static VisitorTicketTracker getInstance2(){
        if (instance == null ){
            synchronized (VisitorTicketTracker.class){
                if (instance == null){
                    instance = new VisitorTicketTracker();
                }
            }
        }
        return instance;
    }


}
