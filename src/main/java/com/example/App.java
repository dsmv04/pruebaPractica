package com.example;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class App {
    
    public int sum(int a, int b) {
        return a + b;
    }

    public boolean isPositive(int number) {
        return number > 0;
    }

    public static void main(String[] args) {
        App implementor = new App();
        String address = "http://localhost:2020/AppService";
        Endpoint.publish(address, implementor);
        System.out.println("Service is running at: " + address + "?wsdl");
    }
}
