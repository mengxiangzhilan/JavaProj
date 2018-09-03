import service.WebServiceImpl;
import service.WebServiceImplService;

public class WSClient {
    public static void main(String[] args) {
        //创建一个用于产生WebServiceImpl实例的工厂，WebServiceImplService类是wsimport工具生成的
        WebServiceImplService factory = new WebServiceImplService();
        //通过工厂生成一个WebServiceImpl实例，WebServiceImpl是wsimport工具生成的
        WebServiceImpl webService=factory.getWebServiceImplPort();
        String resResult=webService.sayHello("ss");
        System.out.println("返回结果"+resResult);
        System.out.println("   ````````     ");
        resResult=webService.save("ss","hao");
        System.out.println("save返回结果"+resResult);
    }
}
