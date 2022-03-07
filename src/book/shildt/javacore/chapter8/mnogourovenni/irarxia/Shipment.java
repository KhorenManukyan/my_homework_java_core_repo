package book.shildt.javacore.chapter8.mnogourovenni.irarxia;

public class Shipment extends BoxWeight{
    double cost;

    Shipment (Shipment shipment){
        super(shipment);
        this.cost = shipment.cost;
    }

    Shipment(double width, double height, double depth, double weight,double cost){
        super(width, height, depth, weight);
        this.cost = cost;
    }

    Shipment(){
        super();
        this.cost = -1;
    }

    Shipment(double len, double weight, double c){
        super(len,weight);
        cost = c;
    }
}
