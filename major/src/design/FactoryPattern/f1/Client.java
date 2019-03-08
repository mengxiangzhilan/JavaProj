package design.FactoryPattern.f1;


/*
* 可以看出工厂模式只是针对一个产品的等级结构。抽象工厂面对多个产品等级结构
* 品族，是指位于不同产品等级结构中，功能相关联的产品组成的家族
* Intel的主板、芯片组、CPU组成一个家族。而这两个家族都来自于三个产品等级：主板、芯片组、CPU。
*使用抽象工厂模式，可以处理具有相同（或者相似）等级结构中的多个产品族中的产品对象的创建问题
* */
public class Client {
    public static void main(String[]args){
        ComputerEngineer cf = new ComputerEngineer();
        cf.makeComputer(1,1);
        //创建装机工程师对象
        ComputerEngineer cf1 = new ComputerEngineer();
        //客户选择并创建需要使用的产品对象
        AbsteactFactory af = new IntelFactory();
        //告诉装机工程师自己选择的产品，让装机工程师组装电脑
        cf.makeComputer(af);

    }

}
