package design.PrototypePattern.p1;
//创建型
/*原型模式属于对象的创建模式。通过给出一个原型对象来指明所有创建的对象的类型，
然后用复制这个原型对象的办法创建出更多同类型的对象。这就是选型模式的用意。*/

//无需关心本身的类型，只要实现克隆方法就可以通过这个方法来获取新的对象
public interface Prototype {
	//抽象原型，给出所具体原型类所需的接口
	//public Object clone();
	//登记形式的原型
	//多了一个原型管理器(PrototypeManager)角色，该角色的作用是：创建具体原型类的对象，并记录每一个被创建的对象。
	public Prototype clone();
	public String getName();
	public void setName(String name);

}