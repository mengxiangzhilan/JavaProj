package design.bridgingpattern.b1;
//结构性
//桥接模式，如果软件中某个类存在两个独立的维度，通过该模式可以分离出来，使其独自扩展
/*与多层继承方案不同，它将两个独立变化的维度设计为两个独立的继承等级结构，并且在抽象层建立一个抽象关联，
该关联关系类似一条连接两个独立继承结构的桥，故名桥接模式*/
//重点抽象关联
//抽象类:定义抽象类的接口其中定义了一个Implementor（实现类接口）类型的对象并可以维护该对象，它与Implementor之间具有关联关系，它既可以包含抽象业务方法，也可以包含具体业务方法
//扩充抽象类:通常情况下它不再是抽象类而是具体类，它实现了在Abstraction中声明的抽象业务方法，在RefinedAbstraction中可以调用在Implementor中定义的业务方法
//实现类接口:仅提供基本操作
//具体实现类具体实现Implementor接口，在不同的ConcreteImplementor中提供基本操作的不同实现，在程序运行时，ConcreteImplementor对象将替换其父类对象，提供给抽象类具体的业务操作方法。

public abstract class Abstaction {
	protected Implementor impl;//定义实现类接口对象
	public void serImpl(Implementor impl) {
		this.impl=impl;
	}
	public abstract void operation();//声明抽象业务方法
}