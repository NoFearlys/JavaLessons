package lesson1.S.bad;

import java.util.List;

public class DogB {
    private int age;
    private String name;
    private boolean sex;

    public DogB(int age, String name, boolean sex){
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    //В данном плохом примере мы храним вывод данных внутри объекта. это не соответствует принципу SRP
    public void bark(){System.out.println("Woof!");}
    //Тут у нас то же самое, но с сохраниением
    public void save(){}
    //Ну и логику сюда запихнём. Почему бы и нет) Давайте тут же считать собак, например.
    public int count (List<DogB> dogs){return 0;}
}
