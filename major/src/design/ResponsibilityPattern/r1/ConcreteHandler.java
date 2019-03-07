package design.ResponsibilityPattern.r1;

public class ConcreteHandler extends Handler{

    @Override
    public String handleFeeRequest(String user, double fee) {
        // TODO Auto-generated method stub
        String str="";
        if(fee<500) {
            //为了测试，简单点，只同意张三的请求
            if("张三".equals(user))
            {
                str = "成功：项目经理同意【" + user + "】的聚餐费用，金额为" + fee + "元";
            }else
            {
                //其他人一律不同意
                str = "失败：项目经理不同意【" + user + "】的聚餐费用，金额为" + fee + "元";
            }
        }else
        {
            //超过500，继续传递给级别更高的人处理
            if(getSuccessor() != null)
            {
                return getSuccessor().handleFeeRequest(user, fee);
            }
        }
        return str;
    }


    //public void handleRequest() {
    // TODO Auto-generated method stub
    //判断是否由后继的责任对象，由转发请求，没有处理请求
    //if(getSuccessor()!=null) {
    //System.out.println("放过请求");
    //getSuccessor().handleRequest();
    //}else {
//		}
    //}


}
