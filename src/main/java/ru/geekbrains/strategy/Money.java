package ru.geekbrains.strategy;

public class Money {
    private float money;

    public Money(float money) {
        this.money = money;
    }

    public float getAmount() {
        return money;
    }

    public void add(Money money){
        this.money += money.getAmount();
    }

    public void remove(Money money) {
        this.money -= money.getAmount();
    }

    @Override
    public String toString() {
        return String.valueOf(this.money);
    }
}
