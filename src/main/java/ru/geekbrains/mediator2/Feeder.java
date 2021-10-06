package ru.geekbrains.mediator2;

public class Feeder {
    private CatMediator catMediator;
    private int feedAmount;

    public Feeder(int feedAmount) {
        this.feedAmount = feedAmount;
    }

    public void setCatMediator(CatMediator catMediator) {
        this.catMediator = catMediator;
    }

    public int getFeedAmount() {
        return feedAmount;
    }

    public void decreaseFeed(int feedAmount) {
        this.feedAmount -= feedAmount;
    }
}
