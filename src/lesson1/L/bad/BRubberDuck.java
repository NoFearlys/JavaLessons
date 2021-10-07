package lesson1.L.bad;

public class BRubberDuck extends BDuck{
    @Override
    public void fly() {
        // тут у нас засада. данная утка не умеет летать. Поэтому этот метод нам нужно как-то заглушить и при этом мы нарушаем принцип LSP
    }

    @Override
    public void quack() {
        super.quack();
    }

    @Override
    public void swim() {
        super.swim();
    }
}
