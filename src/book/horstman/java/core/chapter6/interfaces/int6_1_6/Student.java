package book.horstman.java.core.chapter6.interfaces.int6_1_6;

public class Student implements Person,Named{
    @Override
    public String getName() {
        return Named.super.getName();
    }
}
