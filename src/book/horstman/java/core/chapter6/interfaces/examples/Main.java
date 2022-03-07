package book.horstman.java.core.chapter6.interfaces.examples;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
    }
}

interface Person{
    default String getName(){
        return "name";
    }
}

interface Named{
    default String getName(){
        return getClass().getName() + " " + hashCode();
    }


}

class Student implements Person, Named{
    public String getName(){
        return Named.super.getName();
    }
}