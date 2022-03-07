package videos.interediate.pulin.arac.porcnakan.interfaces;

 interface Fly {
    public int gerWingsSpan() throws Exception;
    public static final int MAX_SPEED= 100;

    public default void land (){
        System.out.println("Animal1 is landing");
    }

    public static double calculateSpeed( float distance, double time){
        return distance/ time;
    }
}

class Eagle implements Fly{

    @Override
    public int gerWingsSpan() {
        return 15;
    }

    @Override
    public void land() {
        System.out.println("Eagle is diving fast");
    }
}
