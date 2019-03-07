package design.PrototypePattern.p1;

public class ConctetePrototype2 implements Prototype {
	private String name;
	public Prototype clone() {
		ConctetePrototype2 prototype = new ConctetePrototype2();
		prototype.setName(this.name);
	        return prototype;
	}
	public String toString() {
		return "Now in Frototype1,name="+this.name;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}
}
