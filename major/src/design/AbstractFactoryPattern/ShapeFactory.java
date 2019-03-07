package design.AbstractFactoryPattern;



public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapetype) {
        if(shapetype == null){
            return null;
        }
        if (shapetype.equalsIgnoreCase("CIRCLE1")){
            return new Circle();
        }else if (shapetype.equalsIgnoreCase("RECTANGLE1")){
            return new Rectangle();
        }else if (shapetype.equalsIgnoreCase("SQUARE1")){
            return new Square();
        }
        return null;
    }
}
