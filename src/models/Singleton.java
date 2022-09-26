package models;
//návrhový vzor kde vznikne pouze jeden
public class Singleton {
    private static String connection;

    public String getConnection(){
        if(connection == null){
            connection = "open";
        }
        return connection;
    }
}
