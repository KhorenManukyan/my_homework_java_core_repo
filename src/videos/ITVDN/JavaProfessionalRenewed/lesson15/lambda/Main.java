package videos.ITVDN.JavaProfessionalRenewed.lesson15.lambda;

public class Main {
    public static void main(String[] args) {
        long l1 = System.nanoTime();
        User user1 = new User() {
            @Override
            public void print() {
                System.out.println("Hello");
            }
        };
        long l2 = System.nanoTime();

        long l3 = System.nanoTime();
        User user2 = () -> System.out.println("hhh");
        long l4 = System.nanoTime();

        System.out.println(l2 - l1);
        System.out.println(l4 - l3);

    }
}

@FunctionalInterface
interface User{
    void print();
}