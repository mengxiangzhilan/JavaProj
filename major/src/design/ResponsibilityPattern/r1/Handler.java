package design.ResponsibilityPattern.r1;
/* 对象由每个对象对其下家的引用而连接起来形成一条链。
        * 请求在这个链上传递，直到链上的某一个对象决定处理此请求。
        * 发出这个请求的客户端并不知道链上的哪一个对象最终处理这个请求，
        * 这使得系统可以在不影响客户端的情况下动态地重新组织和分配责任
        *
        * */
/*抽象处理者角色：定义出一个处理请求的接口。如果需要，接口可以定义 出一个方法以设定和返回对下家的引用。
这个角色通常由一个Java抽象类或者Java接口实现。*/
/*具体处理者(ConcreteHandler)角色：具体处理者接到请求后，可以选择将请求处理掉，或者将请求传给下家。由于具体处理者持有对下家的引用，
因此，如果需要，具体处理者可以访问下家。*/
public abstract class Handler {
    // 持有后继的责任对象
    protected Handler successor=null;

/**
 * 示意处理请求的方法，虽然这个示意方法是没有传入参数的
 * 但实际是可以传入参数的，根据具体需要来选择是否传递参数
 */
//public abstract void handleRequest();
    /**
     * 取值方法
     */
    public Handler getSuccessor() {
        return successor;
    }
    /**
     * 赋值方法，设置后继的责任对象
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    /**
     * 处理聚餐费用的申请
     * @param user    申请人
     * @param fee    申请的钱数
     * @return        成功或失败的具体通知
     */
    public abstract String handleFeeRequest(String user,double fee );
    public String handleRequest(String user, double fee) {
        // TODO Auto-generated method stub
        return null;
    }
}
