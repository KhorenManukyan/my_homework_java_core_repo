package videos.interediate.pulin.arac.chapter_3._7comparator.comporavle;

public class Animal implements java.lang.Comparable<Animal> {
    private int id;

    public int compareTo(Animal an){
        return id - an.id;
    }

    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        a1.id = 115;
        a2.id = 27;
        System.out.println(a1.compareTo(a2));
        System.out.println(a1.compareTo(a1));
        System.out.println(a2.compareTo(a1));
        System.out.println(a2.compareTo(a2));
    }
}
