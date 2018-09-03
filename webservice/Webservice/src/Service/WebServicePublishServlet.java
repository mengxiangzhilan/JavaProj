package Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.xml.ws.Endpoint;

//@WebServlet注解将继承HttpServlet类的普通Java类标注为一个Servlet
//将value属性设置为空字符串，这样WebServicePublishServlet就不提供对外访问的路径
//loadOnStartup属性设置WebServicePublishServlet的初始化时机
@WebServlet(value="",loadOnStartup=0)
public class WebServicePublishServlet extends HttpServlet{
    public void init() throws ServletException{
        String address="http://127.0.0.1:8887/Webservice/Service";
        Endpoint.publish(address, new WebServiceImpl());
        System.out.println("使用webservicepublishservlet发布webservice成功");
    }


}
