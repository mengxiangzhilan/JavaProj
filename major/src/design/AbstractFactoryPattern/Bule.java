package design.AbstractFactoryPattern;

public class Bule implements Color{
    @Override
    public void fill() {
        System.out.println("Inside bule::fill() .method");
    }
}
