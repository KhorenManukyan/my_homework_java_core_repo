package book.ocp.chapter1.enumes;

public enum OnlyOne {
    ONE(1), ONLY_ONE(3);
    private OnlyOne(int b){
        System.out.println("constructing " + b);
    }

    public static void main(String[] args) {
        OnlyOne firstCall = OnlyOne.ONE;
    }
}
