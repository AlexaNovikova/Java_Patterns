package ru.geekbrains.strategy;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.setPrice(new Money(1234));
//        CreditCard creditCard = new CreditCard("Pavel", 123123123);
//        PaymentStrategy paymentStrategy = new CreditCardPaymentStrategy(creditCard);
//        order.pay(paymentStrategy);
        PaymentStrategy paymentStrategy = new PayPalPaymentStrategy("mail@mail.ru", "123123123");
        order.pay(paymentStrategy);
    }
}
