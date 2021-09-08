package ru.geekbrains.composite;

import java.util.ArrayList;

public class Expression extends BaseExpressionPart{

    ArrayList<ExpressionPart> components;
    private String font;
    private String color;

    public Expression() {
        super(' ', "isNotSetted", "isNotSetted");
        components = new ArrayList<ExpressionPart>();
        this.color = "isNotSetted";
        this.font = "isNotSetted";
    }

    public void add(Word word){
        components.add(word);
    }

    public void add(PunctuationMark punctuationMark){
        components.add(punctuationMark);
    }

    @Override
    public String getFont() {
        if(!components.isEmpty()){
            String font = components.get(0).getFont();
            for (ExpressionPart component : components) {
                if (!component.getFont().equals(font)) {
                    return "Different fonts";
                }
            }
        }
        return font;
    }

    @Override
    public String getColor() {
        if(!components.isEmpty()){
            String color = components.get(0).getColor();
            for (ExpressionPart component : components) {
                if (!component.getColor().equals(color)) {
                  return "Different colors";
                }
            }
        }
        return color;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
        this.color=color;
        for (ExpressionPart component: components){
            component.setColor(color);
        }
    }

    @Override
    public void setFont(String font) {
        super.setFont(font);
        this.font = font;
        for (ExpressionPart component: components){
            component.setFont(font);
        }
    }

    public void print() {
        for(ExpressionPart component: components){
            component.print();
        }
        System.out.println();
    }
}
