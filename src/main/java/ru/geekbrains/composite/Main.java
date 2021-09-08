package ru.geekbrains.composite;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Letter d = new Letter("Arial", "Black", 'd');
        Letter o = new Letter("Times New Roman", "White", 'o');
        Letter g = new Letter("Tahoma", "Green", 'g');
        ArrayList<Letter> letters = new ArrayList<Letter>();
        letters.add(d);
        letters.add(o);
        letters.add(g);
        Word word = new Word(letters);
        PunctuationMark punctuationMark = new PunctuationMark('!', "Arial", "Yellow");
        Expression expression = new Expression();
        expression.add(word);
        expression.add(punctuationMark);
        expression.print();

        System.out.println(d.getColor());
        System.out.println(o.getColor());
        System.out.println(expression.getColor());

        expression.setColor("Red");
        System.out.println(expression.getColor());
        System.out.println(d.getColor());
        System.out.println(o.getColor());

        System.out.println(expression.getFont());
        System.out.println(o.getFont());
        System.out.println(d.getFont());
        expression.setFont("Arial");
        System.out.println(expression.getFont());
        System.out.println(o.getFont());
        System.out.println(d.getFont());

        o.setFont("Tahoma");
        System.out.println(o.getFont());
        System.out.println(expression.getFont());


        System.out.println(word.getFont());
        word.setFont("Arial");
        System.out.println(word.getFont());
        System.out.println(expression.getFont());

        System.out.println(punctuationMark.getColor());
        System.out.println(punctuationMark.getFont());

        Expression expression1 = new Expression();
        System.out.println(expression1.getFont());


    }
}
