package ru.geekbrains.builder;

import java.util.ArrayList;

public class Pizzeria {


    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
        NYPizza nyPizza = new NYPizza
                .Builder()
                .size(Size.SMALL)
                .addTopping(Topping.SAUSAGE)
                .addTopping(Topping.ONION)
                .build();

        Calzone calzone = new Calzone
                .Builder()
                .size(Size.LARGE)
                .addTopping(Topping.HAM)
                .sauceInside()
                .build();

        pizzas.add(nyPizza);
        pizzas.add(calzone);
        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }
    }
}
