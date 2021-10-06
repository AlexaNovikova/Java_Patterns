package ru.geekbrains.mediator2;


public class CatMediator implements Mediator {
    private Cat cat;
    private Feeder feeder;

    public CatMediator(Cat cat, Feeder feeder) {
        this.cat = cat;
        this.feeder = feeder;
    }

    @Override
    public void feed() {
        if (cat.isHungry()) {
            int feedToEat = (cat.getHungry() - feeder.getFeedAmount() >= 0 ? feeder.getFeedAmount() : cat.getHungry());
            cat.decreaseHunger(feedToEat);
            feeder.decreaseFeed(feedToEat);
        }
    }

}
