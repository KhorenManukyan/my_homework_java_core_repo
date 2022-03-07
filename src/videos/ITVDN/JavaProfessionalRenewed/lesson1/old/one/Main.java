package videos.ITVDN.JavaProfessionalRenewed.lesson1.old.one;

public class Main {
    public static void main(String[] args) {
        int[] x = {1, 4, 3, 5, 6, 7};

        for(int i = 0; i< x.length; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
        for (int j : x) {
            j*=2;
            System.out.print(j+" ");
        }
        System.out.println();
        for(int i = 0; i< x.length; i++){
            System.out.print(x[i]+" ");
        }

    }
}
