package book.shildt.javacore.chapter8.pereopredelenie.methodov;

public class Figure {
    double dim1;
    double dim2;

    Figure(double dim1,double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    double area(){
        System.out.print("ploshad figuri ne opredelena: ");
        return 0;
    }
}
