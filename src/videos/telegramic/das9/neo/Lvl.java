package videos.telegramic.das9.neo;

public enum Lvl {
    STUDENT("sovorox", 0){
        @Override
        public long getAshxatavardz(){
            return 0;
        }
    },
    JUNIOR("sksnak", 1) {
        @Override
        public long getAshxatavardz() {
            return 0;
        }
    },
    MIDDLE("poraru", 10) {
        @Override
        public long getAshxatavardz() {
            return 0;
        }
    },
    SENIOR("Usta", 100) {
        @Override
        public long getAshxatavardz() {
            return 0;
        }
    };

    String status;
    long gorcakic;

    Lvl(String status, long ashxatavardz) {
        this.status = status;
        this.gorcakic = ashxatavardz;
    }

    public abstract long getAshxatavardz();

}
