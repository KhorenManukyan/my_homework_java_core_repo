package book.shildt.javacore.chapter5;

public class NoChange {
    public static void main(String[] args) {
//        char a = ' ';
//        System.out.println(a);
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
/*        for (int i = 0; i < nums.length; i++) {
            System.out.print(i + " ");
            i *= 10;
            System.out.print(i + " ");
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(i + " ");

        }
        System.out.println();*/
        for(int i:nums){
            System.out.print(i + " ");
            i *= 10;
            System.out.print(i + " ");
        }
        for(int i:nums) {
            System.out.print(i + " ");
        }
    }
}
