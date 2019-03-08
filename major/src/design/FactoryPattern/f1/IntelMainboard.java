package design.FactoryPattern.f1;

public class IntelMainboard implements Mainboard {
    private int cpuHoles=0;//cpu插槽数
    public IntelMainboard(int cpuHoles){
        this.cpuHoles=cpuHoles;
    }
    @Override
    public void installCPU() {
        System.out.println("intel主板的cpu插孔数"+cpuHoles);
    }
}
