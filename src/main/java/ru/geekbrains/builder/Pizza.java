package ru.geekbrains.builder;
import java.util.Set;

public abstract class Pizza {

    protected final Set<Topping> toppings;
    protected final Size size;

    Pizza(PizzaBuilder<?> pizzaBuilder) {
        toppings = pizzaBuilder.toppings.clone();
        size = pizzaBuilder.size;
    }
}
