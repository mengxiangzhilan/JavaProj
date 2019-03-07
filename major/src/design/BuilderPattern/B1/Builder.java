package design.BuilderPattern.B1;

//抽象建造者类
public interface Builder {

	public void buildPart1();
	public void buildPart2();
	public Product retrieveResult();
	
}
