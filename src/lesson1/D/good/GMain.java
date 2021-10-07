package lesson1.D.good;

public class GMain {
}

interface Dao{
    void execute();
}

class DataAccess1 implements Dao{
    @Override
    public void execute() {
        System.out.println("execute");
    }
}

class Client{
    Dao dataAccess = new DataAccess1();
    void doJob(){
        dataAccess.execute();
    }

    //В данном примере Client "не знает" ничего о DataAccess1 и обращается только к интерфейсу
}