package book.shildt.javacore.chapter8.pereopredelenie.methodov;

public class Triangle extends Figure{
    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    double area() {
        System.out.print ("V oblasti triugolnika: ");
        return dim1 * dim2/2;
    }
}
