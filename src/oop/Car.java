package oop;

public abstract class Car {
    private double longCar;

    private double withCar;

    private double cylinderCapacity;

    private int numberSeat;

    private String color;

    private double price;

    public Car() {
    }

    public Car(double longCar, double withCar, double cylinderCapacity, int numberSeat, String color, double price) {
        this.longCar = longCar;
        this.withCar = withCar;
        this.cylinderCapacity = cylinderCapacity;
        this.numberSeat = numberSeat;
        this.color = color;
        this.price = price;
    }

    public double getLongCar() {
        return longCar;
    }

    public void setLongCar(double longCar) {
        this.longCar = longCar;
    }

    public double getWithCar() {
        return withCar;
    }

    public void setWithCar(double withCar) {
        this.withCar = withCar;
    }

    public double getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(double cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public int getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(int numberSeat) {
        this.numberSeat = numberSeat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "longCar=" + longCar +
                ", withCar=" + withCar +
                ", cylinderCapacity=" + cylinderCapacity +
                ", numberSeat=" + numberSeat +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
