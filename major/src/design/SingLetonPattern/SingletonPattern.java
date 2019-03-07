package design.SingLetonPattern;

public class SingletonPattern{
/**
 * 保证一个类只能实例化一个实例，并提供一个全局访问点
 * 该类可以直接访问，不需要实例化
 *主要解决一个类频繁地创建和销毁
 *
 */

    private static SingletonPattern instance=new SingletonPattern();
    private SingletonPattern(){

    }
    public static SingletonPattern getInstance(){
        return instance;
    }
    public void show(){
        System.out.println("单利模式");
    }
}

