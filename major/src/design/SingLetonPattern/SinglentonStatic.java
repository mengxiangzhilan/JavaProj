package design.SingLetonPattern;

public class SinglentonStatic {
    private static class SinglentonHolder{
        private static final SinglentonStatic INSTANCE = new SinglentonStatic();
    }
    private SinglentonStatic(){}
    public static final SinglentonStatic getInstance(){
        return SinglentonHolder.INSTANCE;
    }
}
