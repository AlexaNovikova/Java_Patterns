package ru.geekbrains.strategy;

public class Order {

    private Money price;

    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(price);
    }

    public void setPrice(Money price) {
        this.price = price;
    }
}
