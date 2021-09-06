package ru.geekbrains.builder;

public class NYPizza extends Pizza {

    public static class Builder extends PizzaBuilder<Builder> {


        @Override
        public NYPizza build() {
            return new NYPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private NYPizza(Builder builder) {
        super(builder);
    }

    @Override
    public String toString() {
        return "NYPizza " + toppings.toString() + " " + size.toString();
    }
}
