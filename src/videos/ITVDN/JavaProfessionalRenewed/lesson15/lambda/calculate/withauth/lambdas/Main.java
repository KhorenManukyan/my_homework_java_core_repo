package videos.ITVDN.JavaProfessionalRenewed.lesson15.lambda.calculate.withauth.lambdas;

public class Main {
    public static void main(String[] args) {
        Operation add = (x, y) -> x + y;
        Operation sub = (x, y) -> x - y;
        Operation dev = (x, y) -> x / y;
        Operation multiple = (x, y) -> x * y;

        int calcAdd = add.calculate(20,10);
        int calcSub = sub.calculate(20,10);
        int calcDev = dev.calculate(20,10);
        int calcMul = multiple.calculate(20,10);
        System.out.println(calcAdd);
        System.out.println(calcSub);
        System.out.println(calcDev);
        System.out.println(calcMul);
    }
}

@FunctionalInterface
interface Operation{
    int calculate(int x, int y);
}
