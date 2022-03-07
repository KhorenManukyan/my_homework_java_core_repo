package videos.ITVDN.javaEssential.lesson10.ex4;

public class Container<T> implements IContainer<T> {
    private T figure;

    public Container(T figure) {
        this.figure = figure;
    }

    @Override
    public T getFigure() {
        return figure;
    }

    @Override
    public void setFigure(T figure) {
        this.figure = figure;
    }
}
