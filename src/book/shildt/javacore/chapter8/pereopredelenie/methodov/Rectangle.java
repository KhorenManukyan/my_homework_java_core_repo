package book.shildt.javacore.chapter8.pereopredelenie.methodov;

public class Rectangle extends Figure{
    Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    double area() {
        System.out.print("V oblasti chetiryoxugolnika: ");
        return dim1 * dim2;
    }
}
