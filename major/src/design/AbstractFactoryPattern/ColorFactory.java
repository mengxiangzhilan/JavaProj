package design.AbstractFactoryPattern;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Bule();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapetype) {
        return null;
    }
}
