package ru.geekbrains.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy{

    private final CreditCard creditCard;

    public CreditCardPaymentStrategy(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void pay(Money amount) {
        System.out.printf("processing %s via CreditCard %s\n", amount.toString(), creditCard.getNumber());
    }
}
