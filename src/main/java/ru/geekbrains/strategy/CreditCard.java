package ru.geekbrains.strategy;

public class CreditCard {
    private final String holderName;
    private Money money;
    private final int number;

    public CreditCard(String holderName, int number) {
        this.holderName = holderName;
        this.number = number;
    }

    public void add(Money money){
        money.add(money);
    }

    private void remove(Money money){
        money.remove(money);
    }

    public int getNumber() {
        return number;
    }
}
