package com.gree.www.dao;

public class HelloWorld {

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public void printMessage(){
        System.out.println("[Message!] : class message");
    }

}
