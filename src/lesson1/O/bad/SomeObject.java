package lesson1.O.bad;

public class SomeObject {
    String text;

    public SomeObject(String text){
        this.text = text;
    }
    // В данном примере мы реализуем логирование. Это может выполняться в самом классе объекта,
    // или в отдельном классе, но самое главное - что для добавления функцианала потребуется исменять этот класс
    public void loging(){
        //сохраняем лог в txt содержимое переменной text
    }
}
