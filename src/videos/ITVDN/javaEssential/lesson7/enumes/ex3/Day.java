package videos.ITVDN.javaEssential.lesson7.enumes.ex3;

public enum Day {
    MONDAY(1000), TUESDAY(100), WEDNESDAY(10);
    private int value;
    private Day(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }
}
