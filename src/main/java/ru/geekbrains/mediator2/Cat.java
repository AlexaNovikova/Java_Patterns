package ru.geekbrains.mediator2;

public class Cat {

    private int hungry;
    private String name;
    private CatMediator catMediator;

    public Cat(int hungry, String name) {
        this.hungry = hungry;
        this.name = name;
    }

    public int getHungry() {
        return hungry;
    }

    public boolean isHungry(){
        return hungry>0;
    }

    public void eat(){
      catMediator.feed();
    }

    public void setCatMediator(CatMediator catMediator) {
        this.catMediator = catMediator;
    }

    public void decreaseHunger(int feedToEat) {
        hungry-=feedToEat;
    }
}
