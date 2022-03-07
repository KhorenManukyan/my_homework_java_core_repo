package videos.interediate.pulin.arac.porcnakan.test1.porcer;

class SmartWatch extends Watch {
    private String getType() { return "smart watch"; }
    public String getName(String suffix) {
        return getType() + suffix;
    }
}
public class Watch {
    private String getType() { return "watch"; }
    public String getName(String suffix) {
        return getType() + suffix;
    }
    public static void main(String[] args) {
        Watch watch = new Watch();
        SmartWatch smartWatch = new SmartWatch();
        System.out.print(watch.getName(","));
        System.out.print(smartWatch.getName(""));
    }
}

