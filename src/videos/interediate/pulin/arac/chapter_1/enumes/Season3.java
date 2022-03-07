package videos.interediate.pulin.arac.chapter_1.enumes;

public enum Season3 {
    WINTER{
        @Override
        public void printHours(){
        System. out .println("9am-3pm");
    }}, SPRING{
        @Override
        public void printHours() {
            System. out .println("9am-5pm");
        }
    }, SUMMER{
        @Override
        public void printHours() {
            System. out .println("9am-7pm");
        }
    }, FALL{
        @Override
        public void printHours() {
            System. out .println("9am-5pm");
        }
    };

    public abstract void printHours();
}
