package design.AbstractFactoryPattern;

public class AbstractFactoryPatternDemo {
    public static void main(String[]args){
        AbstractFactory sFactory=AbstractFactoryProducer.getFactory("SHAPE");
        Shape shape1=sFactory.getShape("CIRCLE1");
        shape1.hello();
        Shape shape2=sFactory.getShape("RECTANGLE1");
        shape2.hello();
        Shape shape3=sFactory.getShape("SQUARE1");
        shape3.hello();
        AbstractFactory cFactory1=AbstractFactoryProducer.getFactory("COLOR");
        Color color1=cFactory1.getColor("RED");
        color1.fill();
        Color color2=cFactory1.getColor("GREEN");
        color2.fill();
        Color color3=cFactory1.getColor("BLUE");
        color3.fill();
    }
}
