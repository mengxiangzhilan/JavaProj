package design.BuilderPattern.B1;

//建造者模式，创建型
/*抽象建造者：规范产品对象的各个组成方法。此接口独立于应用程序的商业逻辑
 * 具体建造者：创建产品实例
 * 导演：调用具体建造者来创建对象。没有产品类的具体信息，与客户端交互将创建产品请求划分
 * 成对各个零件的请求，在委派给具体建造类
 * 产品：复杂，每个产品类就有一个相应的具体建造类
 *
 * */
//产品类
public class Product {
	//定义了一些关于产品的操作
	private String part1;
	private String part2;
	public String getPart1() {
		return part1;
	}
	public void setPart1(String part1) {
		this.part1 = part1;
	}
	public String getPart2() {
		return part2;
	}
	public void setPart2(String part2) {
		this.part2 = part2;
	}
	
}
