package videos.telegramic.das6.neo;

public class MaxMinMethod {
    static Object popoxakan = 5;
    static String type = "int";

    public static void main(String[] args) {
        int[] tver = {1, 2, 3, 82, 97, 10};
        int[] tver2 = {1, 2, 3, 82, 97, 108};
        int[] tver3 = {};

        System.out.println(getMin(tver));
        System.out.println(getMin(tver2));
        System.out.println(getMin(tver3));
        int max1 = getMin(tver);
        int max2 = getMin(tver2);
        int max3 = getMin(tver3);

//        getmax(tver);
//        getmax(tver2);
//        getmax(tver3);

        System.out.println(((int)popoxakan>0)?"meca":"poqra");
        System.out.println("---------------------------------");
        System.out.println(getMin((max1>max2)?tver2:tver));


        switch (type){
            case "String":
                String norPopoxakan = (String) popoxakan;
                break;
            case "int":
                int norPopoxakan2 = (Integer) popoxakan;
                break;
        }
    }

    private static int getMin(int[] masiv) {
        int max = 0;
        try {
             max = masiv[0];
//             max = masiv[0];
            for (int i : masiv) {
                if (max < i) {
                    max = i;
                }
            }
//            System.out.println(max);

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        return max;
    }
}
