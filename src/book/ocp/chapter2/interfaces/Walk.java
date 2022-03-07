package book.ocp.chapter2.interfaces;

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
