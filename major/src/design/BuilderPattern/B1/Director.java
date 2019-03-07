package design.BuilderPattern.B1;

public class Director {
private Builder builder;
public Director(Builder builder) {
	this.builder=builder;
	
}
public void construct() {//产品构造方法，负责调用各个零件建造方法
	builder.buildPart1();
	builder.buildPart2();
}
}
