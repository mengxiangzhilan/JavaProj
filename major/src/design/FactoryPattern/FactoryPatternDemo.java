package design.FactoryPattern;

public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape1=shapeFactory.getShape("CIRCLE");
        shape1.hello();
        Shape shape2=shapeFactory.getShape("RECTANGLE");
        shape2.hello();
        Shape shape3=shapeFactory.getShape("SQUARE");
        shape3.hello();

    }
}
