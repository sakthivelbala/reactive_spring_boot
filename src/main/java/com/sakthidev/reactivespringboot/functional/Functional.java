package com.sakthidev.reactivespringboot.functional;

import java.util.stream.IntStream;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Functional implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // runFunctionalInterface();
        // functionalSum();
        higherOrderFunctions();
    }

    //sum
    public void functionalSum(){
        Integer sum=IntStream.rangeClosed(0, 100).filter(x->x%2==0).sum();
        System.out.println(sum);
    }

    //Functional Class
    public void runFunctionalInterface(){
        onTheFly(() -> System.out.println("test"));
    }

    public void onTheFly(MyFuncInterface func){
        func.functionalMethod();
    }
    
    public void higherOrderFunctions(){
        System.out.println(createFactory(()->Math.random()*100, x->x.intValue()).create());
    }

    public <T,R> IFactory<R> createFactory(IProduct<T> producer,IConfigure<T,R> configurator){
        return ()->{
            return configurator.configure(producer.product());
        };
    }
}
