package design.FactoryPattern.f1;

public class AmdMainboard implements Mainboard {
    private int cpuHoles=0;//cpu插槽数
    public AmdMainboard(int cpuHoles){
        this.cpuHoles=cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("AMD主板的CPU插槽孔数是：" + cpuHoles);
    }
}
