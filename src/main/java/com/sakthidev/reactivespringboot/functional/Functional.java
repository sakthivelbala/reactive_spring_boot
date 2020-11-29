package com.sakthidev.reactivespringboot.functional;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Functional implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.print("Functional");
    }
    
}
