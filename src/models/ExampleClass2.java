package models;

public class ExampleClass2 extends ExampleClass{
    public void publicMethod2(){
        //privateMethod(); - nelze bo je vazana pouze na tu danou tridu coz je ExampleCLass
        protectedMethod();
        System.out.println(x);
        System.out.println(f1);
        //System.out.println(y); - take nelze ze stejneho duvodu



    }

}
