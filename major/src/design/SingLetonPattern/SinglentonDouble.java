package design.SingLetonPattern;

public class SinglentonDouble {
    private volatile static SinglentonDouble singlentonDouble;
    private SinglentonDouble(){}
    public static SinglentonDouble getSinglentonDouble() {
        if (singlentonDouble == null) {
            synchronized (SinglentonDouble.class) {
                if (singlentonDouble == null) {
                    singlentonDouble = new SinglentonDouble();
                }
            }
        }
        return singlentonDouble;
    }
}
