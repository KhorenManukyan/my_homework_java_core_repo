package book.ocp.test;
/*
class Building {}
class House extends Building{
    public void convert() {
        Building b = new Building();
        House h = new House();
        Building bh = new House();
        Building p = (House) b;
//        House q = (Building) h;
        Building r = (Building) bh;
        House s = (House) bh;
    }
}*/

/*
class Building {}
class House extends Building {
    public void convert() {
        Building b = new Building();
        House h = new House();
        Building bh = new House();
        House p = (House) b;
        House q = (House) h;
        House r = (House) bh;
    }
}*/

/*
class Building {}
class House extends Building{
    public static void main(String[] args) {

    }
    public void convert() {
        Building b = new Building();
        House h = new House();
        Building bh = new House();
        Building f = (House) b;
        House p = (House) b;
//        House q = h;
        House r = (House) bh;
    }
}
*/

class Building {}
class House extends Building {
    public static void main(String[] args) {
        convert();
    }
    public static void convert() {
        Building b = new Building();
        House h = new House();
        Building bh = new House();
        House p = (House) b;
        House q = (House) h;
        House r = (House) bh;
    }
}
