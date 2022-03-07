package book.shildt.javacore.chapter14.g3;

public class Coords<T extends TwoD> {
    T[] coords;

    Coords(T[] coords) {
        this.coords = coords;
    }

    static void showXY(Coords<?> c) {
        System.out.println("Koopдинaты Х У:");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        }
        System.out.println();
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("Koopдинaты Х У Z:");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
        }
        System.out.println();
    }

    static void showAll(Coords<? extends FourD> c) {
        System.out.println("Koopдинaты Х У Z T:");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoD[] twoD = {
                new TwoD(0, 0),
                new TwoD(7, 9),
                new TwoD(18, 4),
                new TwoD(-1, -23),
        };

        Coords<TwoD> twoDCoords = new Coords<>(twoD);
        System.out.println("Coдepжимoe объекта twoDCoords.");
        showXY(twoDCoords);
//        showXYZ(twoDCoords);
//        showAll(twoDCoords);

        FourD[] fourDS = {
                new FourD(1,2,3,4),
                new FourD(6,8,7, 9),
                new FourD(22,9, 18, 4),
                new FourD(3, 3,-1, -23),
        };
        Coords<FourD> fourDCoords = new Coords<>(fourDS);
        System.out.println("Coдepжимoe объекта fourDCoords.");
        showXY(fourDCoords);
        showXYZ(fourDCoords);
        showAll(fourDCoords);
    }
}
