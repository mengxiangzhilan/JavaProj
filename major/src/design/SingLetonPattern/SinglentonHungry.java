package design.SingLetonPattern;

public class SinglentonHungry {
    private static SinglentonHungry instance=new SinglentonHungry();
    private SinglentonHungry(){

    }
    public static SinglentonHungry getInstance(){
        return instance;
    }
}
