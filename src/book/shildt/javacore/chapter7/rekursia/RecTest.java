package book.shildt.javacore.chapter7.rekursia;

public class RecTest {
    int[] value;

    RecTest(int a){
        value = new int[a];
    }

    void printArray(int i){
        if (i == 0){
            return;
        } else {
            printArray(i -1);
            System.out.println(value[i - 1]);
        }
    }

    public static void main(String[] args) {
        RecTest r = new RecTest(10);
        for (int i = 0; i < 10; i++) {
            r.value[i] = i;
        }
        r.printArray(5);
    }
}
