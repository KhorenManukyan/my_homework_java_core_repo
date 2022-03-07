package book.horstman.java.core.chapter5.ex5_6;

public enum Size {
    SMALL("S"),
    MEDIUM("L"),
    LARGE("L"),
    EXTRA_LARGE("XL");

    private String abbreviation;

    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation(){
        return abbreviation;
    }

    public static void main(String[] args) {
        SMALL.toString();
    }

//    @Override
//    public String toString() {
//        return "Size{" +
//                "abbreviation='" + abbreviation + '\'' +
//                '}';
//    }
}
