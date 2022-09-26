import models.*;
import models.dataSaver.DataSaver;
import models.dataSaver.FileDataSaver;
import models.dataSaver.MemoryDataSaver;

import javax.xml.bind.SchemaOutputResolver;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World!");
        //konstanta
        final int x=10;
        final double pi = 3.14;
        //x = 15; - nelze bo je definovana konstanta

        ExampleClass exCls = new ExampleClass();
        System.out.println(exCls.x);
        exCls.publicMethod();

        System.out.println(MyMathClass.sum(1,3));
        //MyMathClass aa =new MyMathClass();
        System.out.println(ExampleClass.InnerClass.x);



        Box<ExampleClass> box = new Box<>(exCls);
        Box<String> boxString = new Box<>("Ahoj");
        //Box<int> nelze dat jen int ale je treba dat objekt tzn pro int Integer
        Box<Integer> boxInteger = new Box<>(10);

        Pair<Integer, String> myPair = new Pair<>(1,"Praha");
        Pair<Integer, String> myPair2 = new Pair<>(2,"Hradec K.");
        Car car = new Car("Skoda", "Fabia");


        DataSaver<Integer> mySaver;
        boolean condToFile = false;
        if(condToFile){
            mySaver = new FileDataSaver<>();
        }else{
            mySaver = new MemoryDataSaver<>();
        }

        mySaver.save(20);
        System.out.println(mySaver.load());



        printStar(5);

        try{
            System.out.println("Saving");
            throw new Exception("File is locked");
        }catch (NullPointerException e){

        }catch (Exception e){
            System.out.println("Je to locked");
        }

    }
    private static void printStar(int x){
        if(x<1)
            return;
        System.out.println("*");
        x= x-1;
        printStar(x);
    }
}
