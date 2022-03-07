package videos.telegramic.das7.hin.interfaces.and.enums;

public enum Aybbuben {
    A("ayb", " "), B("Ben", " "), G("gim", " ");
    private String arjeq;
    private String evsMiban;

    Aybbuben(String arjeq) {
        this.arjeq = arjeq;
    }

    Aybbuben(String arjeq, String evsMiban) {
        this.arjeq = arjeq;
        this.evsMiban = evsMiban;
    }

    public String getArjeq() {
        return arjeq;
    }
}
