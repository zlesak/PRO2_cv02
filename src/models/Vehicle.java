package models;
//abstraktni trida - nelze vitvorit instanci teto tridy jako takove ale pouze pres deditele tj. Car tridu
public abstract class Vehicle {
    protected String brand;

    protected Vehicle(String brand){
        this.brand = brand;
    }
}
