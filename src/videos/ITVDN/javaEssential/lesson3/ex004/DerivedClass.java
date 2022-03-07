package videos.ITVDN.javaEssential.lesson3.ex004;

public class DerivedClass extends BaseClass {
    public int derivedField;
    public DerivedClass(){

    }

    public DerivedClass(int i, int i1) {
        super(i);
        derivedField = i1;
    }
}
