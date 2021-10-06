package ru.geekbrains.strategy;

public class PayPalPaymentStrategy implements PaymentStrategy{
    private final String email;
    private final String token;

    public PayPalPaymentStrategy(String email, String token) {
        this.email = email;
        this.token = token;
    }

    @Override
    public void pay(Money amount) {
        System.out.printf("processing %s via PayPal %s\n", amount.toString(), email);
    }
}
