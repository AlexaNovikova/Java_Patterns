package ru.geekbrains.decorator;

public class ProfessionalShapePainter extends PaintDecorator{


    public ProfessionalShapePainter(Painter painter) {
        super(painter);
    }

   public void paint(ProfessionalShape shape, String frame, String effects){
        ProfessionalShape professionalShape = new ProfessionalShape(shape);
        professionalShape.setEffect(effects);
        professionalShape.setFrame(frame);
        System.out.print("Frame: "+ frame+", Effects: "+ effects+ ", ");
        super.paint(professionalShape);
   }



}
