package models;
//<T> - datový typ není předem určený tzn že je to generická třída
public class Box<T> {
    private T data;
    public Box(T item){
        data  = item;

    }
    public T getData(){
        return data;
    }
}
