package lesson1.S.good;

public class DogG {
    private int age;
    private String name;
    private boolean sex;
    private String barkSound;

    public DogG(int age, String name, boolean sex){
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

    public String getBarkSound() {
        return barkSound;
    }

    public void setBarkSound(String barkSound) {
        this.barkSound = barkSound;
    }

}
