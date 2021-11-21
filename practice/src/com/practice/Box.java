package com.practice;

public class Box {
    private double length, width, depth;

    Box(Box ob) {
        length = ob.length;
        width = ob.width;
        depth = ob.depth;
    }

    Box(double length, double width, double depth) {
        this.length = length;
        this.width = width;
        this.depth = depth;
    }

    Box(double len) {
        length = width = depth = len;
    }

    Box() {
        length = width = depth = -1;
    }

    double volume() {
        return length*width*depth;
    }
}

class BoxWeight extends Box {
    private double weight;

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double length, double width, double depth, double weight) {
        super(length, width, depth);
        this.weight = weight;
    }

    BoxWeight(double len, double weight) {
        super(len);
        this.weight = weight;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    double weightOfBox() {
        return weight;
    }

}

class Shipment extends BoxWeight {
    private double cost;

    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    Shipment(double length, double width, double depth, double weight, double cost) {
        super(length, width, depth, weight);
        this.cost = cost;
    }

    Shipment(double len, double weight, double cost) {
        super(len, weight);
        this.cost = cost;
    }

    Shipment() {
        super();
        cost = -1;
    }

    double costOfShipment() {
        return cost;
    }
}

class MultiLevelHierarchy {
    public static void main(String[] args) {
        Shipment s1 = new Shipment(10, 15, 20, 30, 555);
        Shipment s2 = new Shipment(20, 100, 9870);
        Shipment s3 = new Shipment();
        Shipment sClone = new Shipment(s2);
        System.out.println("Volume of Box is: " + s1.volume());
        System.out.println("Weight of Box is: " + s1.weightOfBox());
        System.out.println("Cost of shipping is: " + s1.costOfShipment() + "\n");
        System.out.println("Volume of Box is: " + s2.volume());
        System.out.println("Weight of Box is: " + s2.weightOfBox());
        System.out.println("Cost of shipping is: " + s2.costOfShipment() + "\n");
        System.out.println("Volume of Box is: " + s3.volume());
        System.out.println("Weight of Box is: " + s3.weightOfBox());
        System.out.println("Cost of shipping is: " + s3.costOfShipment() + "\n");
        System.out.println("Volume of Box is: " + sClone.volume());
        System.out.println("Weight of Box is: " + sClone.weightOfBox());
        System.out.println("Cost of shipping is: " + sClone.costOfShipment() + "\n");
    }
}