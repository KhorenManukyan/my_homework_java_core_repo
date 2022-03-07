package videos.interediate.pulin.arac.chapter_2._1design.an.interfaces1;

public interface Walk {
    boolean isQuadruped();
    abstract double getMaxSpeed();
}

interface Run extends Walk{
    public abstract boolean canHuntWhileRunning();
    abstract double getMaxSpeed();
}

class Lion implements Run{

    @Override
    public boolean isQuadruped() {
        return true;
    }

    @Override
    public boolean canHuntWhileRunning() {
        return true;
    }

    @Override
    public double getMaxSpeed() {
        return 100;
    }
}
