package design.Adapterpattern.a1;

public class Adapter extends Adaptee implements Target {

	@Override
	public void sampleOperation2() {
		// TODO Auto-generated method stub
		
	}
private Adaptee adaptee;
public Adapter(Adaptee adaptee) {
	this.adaptee=adaptee;
}
public void sampleOperation1(){
    this.adaptee.sampleOperation1();
}
//补写相关代码
//public void sampleOperation2(){
	//写相关的代码
//}
}
