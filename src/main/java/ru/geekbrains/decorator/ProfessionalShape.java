package ru.geekbrains.decorator;

public class ProfessionalShape extends Shape {

    private String effect;
    private String frame;

    public ProfessionalShape(Shape shape) {
        super(shape);
        effect="no affects";
        frame="no frame";
    }

    public String getEffect() {
        return effect;
    }

    protected void setEffect(String effect) {
        this.effect = effect;
    }

    public String getFrame() {
        return frame;
    }

    protected void setFrame(String frame) {
        this.frame = frame;
    }

}
