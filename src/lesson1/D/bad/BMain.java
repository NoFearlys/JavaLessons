package lesson1.D.bad;

public class BMain {

}

class DataAccess{
    void execute(){
        System.out.println("execute");
    }
}

class Client{
    DataAccess dataAccess = new DataAccess();
    void doJob(){
        dataAccess.execute();
    }

    //В данном примере Client "знает" всё о DataAccess, а это не соответствует принципу DIP
}
