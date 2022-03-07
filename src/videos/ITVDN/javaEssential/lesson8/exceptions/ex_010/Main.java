package videos.ITVDN.javaEssential.lesson8.exceptions.ex_010;

public class Main {
    public static void main(String[] args) {
        try {
            try {
                try {
                    throw new Exception("Exception");
                } catch (Exception e){
                    System.out.println("catch 1: " + e.getMessage());
                    throw new Exception();
                }finally {
                    System.out.println("finally 1: ");
                }
            }catch (Exception e){
                System.out.println("catch 2: " + e.getMessage());
                throw new Exception();
            }finally {
                System.out.println("finally 2: ");
                throw new Exception("New Exception");
            }
        } catch (Exception e){
            System.out.println("catch 3: " + e.getMessage());
        }finally {
            System.out.println("finally 3: ");
        }
    }
}
