package design.BuilderPattern.B1;

public class ConcreteBuilder implements Builder {
private Product product =new Product();
	@Override
	public void buildPart1() {
		// TODO Auto-generated method stub
		product.setPart1("编号：9527");
	}

	@Override
	public void buildPart2() {
		// TODO Auto-generated method stub
		product.setPart2("名称：xxx");
	}

	@Override
	public Product retrieveResult() {
		// TODO Auto-generated method stub
		return product;
	}

	
}
