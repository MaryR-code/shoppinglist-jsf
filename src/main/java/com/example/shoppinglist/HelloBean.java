package com.example.shoppinglist;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloBean {
    private String name;
    private String greeting;

    public void sayHello() {
        if (name == null || name.isBlank()) {
            greeting = "Hello, world!";
        } else {
            greeting = "Hello, " + name + "!";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
