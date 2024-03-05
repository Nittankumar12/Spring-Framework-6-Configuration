package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("laptop")
@Primary
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop Object created");
    }

    @Override
    public void compile() {
        System.out.println(" Laptop Compiling");
    }
}
