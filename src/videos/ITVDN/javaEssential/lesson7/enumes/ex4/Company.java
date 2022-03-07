package videos.ITVDN.javaEssential.lesson7.enumes.ex4;

public enum Company {
    ITVDM(1000){
        @Override
        public int getValue() {
            return 10 + this.value;
        }

        @Override
        public String getCurrency() {
            return "dollars";
        }
    },
    GOOGLE(100) {
        @Override
        public String getCurrency() {
            return "cents";
        }
    },
    SKYNET(10) {
        @Override
        public String toString() {
            return "Company: " + super.toString();
        }

        @Override
        public String getCurrency() {
            return "euros";
        }
    };
    int value;

    Company(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public String toString(){
        return "Company : " + super.toString() + ", salary " + getValue();
    }

    public abstract String getCurrency();
}
