package videos.ITVDN.JavaProfessional.lesson9.im;

public class Main {
    public static void main(String[] args) {
        byte[] bytes = new byte[12855];
        bytes[451] = (byte) 140;
        System.out.println(bytes[451]);
        System.out.println(bytes.length);
    }
}
