package design.bridgingpattern.b1;

public class RefinedAbstraction extends Abstaction{

	public void operation() {
		//业务代码
		impl.operationImplI();//调用实现类的方法
		//业务代码
	}
}