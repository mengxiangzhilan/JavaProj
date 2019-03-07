package design.SingLetonPattern;

public class SinglentonPatternDemo {

    public static void main(String[] args){
        SingletonPattern singletonPattern=SingletonPattern.getInstance();
        singletonPattern.show();
    }

}
