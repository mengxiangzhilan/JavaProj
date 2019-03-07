package design.SingLetonPattern;

public class SinglentonIdler {
    private static SinglentonIdler instance;
    private SinglentonIdler(){}
   /* public static SinglentonIdler getInstance() {
        if(instance==null){
            instance=new SinglentonIdler();
        }
        return instance;
    }*/
    public static synchronized SinglentonIdler getInstance() {
        if(instance==null){
            instance=new SinglentonIdler();
        }
        return instance;
    }
}
