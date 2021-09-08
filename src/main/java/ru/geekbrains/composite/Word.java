package ru.geekbrains.composite;

import java.util.ArrayList;

public class Word extends BaseExpressionPart{

    private ArrayList<Letter> letters ;
    private String font;
    private String color;

    public Word(ArrayList<Letter>components) {
        super(' ', "isNotSetted", "isNotSetted");
        this.color = "isNotSetted";
        this.font = "isNotSetted";
        letters = new ArrayList<Letter>();
        add(components);
    }

    public void add(ArrayList<Letter> components){
        letters.addAll(components);
    }


    public void print() {
        for (Letter l: letters) {
            l.print();
        }
    }

    @Override
    public String getColor(){
        if(!letters.isEmpty()){
            String color = letters.get(0).getColor();
            for (ExpressionPart letter : letters) {
                if (!letter.getColor().equals(color)) {
                    return "Different colors";
                }
            }
        }
        return color;
    }

    @Override
    public String getFont() {
        if(!letters.isEmpty()){
            String font = letters.get(0).getFont();
            for (ExpressionPart letter : letters) {
                if (!letter.getFont().equals(font)) {
                    return "Different fonts";
                }
            }
        }
        return font;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
        this.color = color;
        for (ExpressionPart letter: letters){
            letter.setColor(color);
        }
    }

    @Override
    public void setFont(String font) {
        super.setFont(font);
        this.font = font;
        for (ExpressionPart letter: letters){
            letter.setFont(font);
        }
    }
}
