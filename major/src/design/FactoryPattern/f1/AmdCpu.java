package design.FactoryPattern.f1;

public class AmdCpu implements Cpu
{private int pins=0;//cpu的引脚数
    public AmdCpu(int pins){
        this.pins=pins;
    }
    @Override
    public void calculate() {
        System.out.println("Amd cpu"+pins);
    }
}
