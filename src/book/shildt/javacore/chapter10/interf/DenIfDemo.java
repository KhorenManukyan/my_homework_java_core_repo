package book.shildt.javacore.chapter10.interf;

public class DenIfDemo {
    public static void main(String[] args) {
        Integer inums[] = {3, 7, 8, 9 ,1};
        Character chs[] = {'d' , 'r' , 'p' , 'y', 'n' , 'k' , 'g' , 'f'};

        MyClass<Integer> iob = new MyClass<>(inums);
        MyClass<Character> cob = new MyClass<>(chs);

        System.out.println("Mинимaльнoe значение в массиве inums: " + iob.min());
        System.out.println("Maкcимaльнoe значение в массиве inums: " + iob.max());
        System.out.println("Mинимaльнoe значение в массиве chs: " + cob.min());
        System.out.println("Maкcимaльнoe значение в массиве chs: " + cob.max());
    }
}
