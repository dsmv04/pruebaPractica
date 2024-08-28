package com.example;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public class MyWebService {

    @WebMethod
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
