package videos.ITVDN.JavaProfessional.lesson9.im;

public class MethodWithArray {
    public static int[] arrayMeth(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= num;
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] mainArray = {1,2,3,4,5};
        arrayMeth(mainArray, 5);
    }
}
