package Service;

import javax.xml.ws.Endpoint;

public class WebServicePublish {
public static void main(String[]ages){
    //定义webservice的发布地址，这个地址是提供给外界的访问地址
String address="http://127.0.0.1:8886/Webservice/Service";
//使用Endpoint类提供的publish方法发布webservice，要保证端口不被占用
    Endpoint.publish(address,new WebServiceImpl());
    System.out.println("发布成功");

    }
}
