package videos.interediate.pulin.arac.porcnakan.test1.porcer;

/*
class Building {
}

class House extends Building {
}



    public void convert() {
        Building b = new Building();
        House h = new House();
        Building bh = new House();
        House p = (House) b;
        House q = (House) h;
        House r = (House) bh;
    }*/


class Building {
}

class House extends Building {
}

public class Main {
    public static void main(String[] args) {
        Building b = new Building();
        Building f = new Building();
        House h = new House();
        House g = new House();
        Building bh = new House();
        Building a = new House();
//        House p = new Building();
        House q = (House) h;
        House r = (House) bh;
        System.out.println(bh.hashCode());
        System.out.println(a.hashCode());
        System.out.println("==================");
//        System.out.println(f.hashCode());
//        System.out.println(b.hashCode());
        System.out.println(b == f);
        System.out.println(b.equals(f));
        System.out.println("==================");
        System.out.println(q == r);
        System.out.println(q.equals(r));
    }
}