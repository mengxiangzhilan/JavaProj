package design.commandPattern.c;

//行为型
/*命令模式属于对象的行为模式。命令模式又称为行动(Action)模式或交易(Transaction)模式。
命令模式把一个请求或者操作封装到一个对象中。命令模式允许系统使用不同的请求把客户端参数化，
对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能。*/
/*（1）命令模式使新的命令很容易地被加入到系统里。

（2）允许接收请求的一方决定是否要否决请求。

（3）能较容易地设计一个命令队列。

（4）可以容易地实现对请求的撤销和恢复。

（5）在需要的情况下，可以较容易地将命令记入日志。*/
/*客户端(Client)角色：创建一个具体命令(ConcreteCommand)对象并确定其接收者
命令(Command)角色：声明了一个给所有具体命令类的抽象接口
具体命令(ConcreteCommand)角色：定义一个接收者和行为之间的弱耦合；实现execute()方法，负责调用接收者的相应操作。execute()方法通常叫做执行方法
请求者(Invoker)角色：负责调用命令对象执行请求，相关的方法叫做行动方法
接收者(Receiver)角色：负责具体实施和执行一个请求。任何一个类都可以成为接收者，实施和执行请求的方法叫做行动方法。*/


//接收者
public class Receiver {
    /**
     * 真正执行命令相应的操作
     */
    public void action(){
        System.out.println("执行操作");
    }
}
