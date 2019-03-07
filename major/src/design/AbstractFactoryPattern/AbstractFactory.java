package design.AbstractFactoryPattern;
//抽象工厂
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shapetype) ;
}
