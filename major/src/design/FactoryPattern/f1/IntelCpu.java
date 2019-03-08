package design.FactoryPattern.f1;

public class IntelCpu implements Cpu {
    private int pins=0;//cpu的引脚数
    public IntelCpu(int pins){
        this.pins=pins;
    }
    @Override
    public void calculate() {
        System.out.println("Intel cpu"+pins);
    }
}
