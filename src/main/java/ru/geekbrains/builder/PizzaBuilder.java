package ru.geekbrains.builder;

import java.util.EnumSet;

public abstract class PizzaBuilder <T extends PizzaBuilder<T>>{
    EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
    Size size;

    public T addTopping(Topping topping) {
        toppings.add(topping);
        return self();
    }

    public T size(Size size){
        this.size = size;
        return self();
    }

    abstract Pizza build();

    protected abstract T self();
}
