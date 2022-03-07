package videos.Tigrani.daseric.lesson17.generics;

public class ListExamples<T> {
    T[] initialArray;
    int currentIndex;
    int initialLength;

    public ListExamples() {
        initialLength = 10;
        initialArray = (T[]) new Object[10];
        currentIndex = 0;
    }

    public void add(T element) {
        if (currentIndex > initialLength - 1) {
            initialLength *=2;
            // array -i erkarutyan mecacum


        }
        initialArray[currentIndex] = element;

        currentIndex++;
    }

    public T get(int index) {
        return null;
    }

    public void delete(int index) {

    }

    public void insert(T element, int index) {

    }
}
