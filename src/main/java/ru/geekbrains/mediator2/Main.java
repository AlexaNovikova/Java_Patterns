package ru.geekbrains.mediator2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(12, "Pushok");
        Feeder feeder = new Feeder(15);
        CatMediator catMediator = new CatMediator(cat, feeder);
        cat.setCatMediator(catMediator);
        feeder.setCatMediator(catMediator);
        cat.eat();
        System.out.println(cat.getHungry());
        System.out.println(feeder.getFeedAmount());
    }
}
