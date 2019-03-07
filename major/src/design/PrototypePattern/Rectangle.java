package design.PrototypePattern;
//原型
public class Rectangle extends Shape {
    public Rectangle() {
        type="Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
