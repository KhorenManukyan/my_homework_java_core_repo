package book.ocp.chapter1.enumes;

public enum Season1 {
    WINTER{
        @Override
        public void printHours() {System.out.println("short hours");}
    }, SPRING {
        @Override
        public void printHours() {System.out.println("long hours");}
    }, SUMMER, FALL{
        @Override
        public void printHours() {System.out.println("short hours");}
    };

    public void printHours(){
        System.out.println("default");
    };
}
