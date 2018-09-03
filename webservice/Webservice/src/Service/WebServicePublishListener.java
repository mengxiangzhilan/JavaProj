package Service;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.xml.ws.Endpoint;
//用于发布Webservice的监听器
//@WebListener注解将实现了ServletContextListener接口的WebServicePublishListener类标注为一个Listener
@WebListener
public class WebServicePublishListener implements ServletContextListener{

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
        String address="http://127.0.0.1:8888/Webservice/Service";
        Endpoint.publish(address, new WebServiceImpl());
        System.out.println("使用webservicepublishlistener发布webservice成功！");
    }

}
