package videos.telegramic.das18.hin.lyambda;

public interface IOrinak {
    public double hashvel(double x, double y);
}

class Main{
    public static void main(String[] args) {
        IOrinak orinak = (x, y) -> x/y;
        IOrinak orinak1 = (x, y) -> Math.max(x,y);
        IOrinak orinak2 = Math::max;
//        System.out.println(orinak.hashvel(10,3));
//        System.out.println(orinak2.hashvel(11,88));
//        IOrinak orinak3 = System.out::println;

//        Tpich tpich = System.out::println;
//        tpich.tpel(orinak.hashvel(10,8));
//        tpich.tpel(orinak2.hashvel(10,8));
        int age = 4;
/*        String text = switch (age){
            case 5,4,2 -> {
                yield "mek";
            }
            case 6-> "six";
            case 8 -> "eight";
            default -> "chka";
        };
        System.out.println(text);*/

//        IOrinak orinak5 = (int x, int y, String z) -> z = x/y;


        Tpich tpich3 = System.out::println;
        tpich3.tpel("1");
        Tpich tpich5 = (Object n)-> System.out.println(n);

    }
}

interface Tpich{
   void tpel(Object o);
}
