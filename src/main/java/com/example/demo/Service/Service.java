package com.example.demo.Service;

import com.example.demo.Service.aop.Latency;
import com.example.demo.Service.aop.LogReturn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by maysam.mokarian on 12/1/2017.
 */
@org.springframework.stereotype.Service
public class Service {

    @Latency
    public void doSomething() {
        //some business logic here
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @Latency
    public void doAnotherThing() {
        //some business logic here
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @LogReturn
    @Latency
    public String doAndLog() {
        //some business logic here
        //and finally we like to log what is returned value
       return "returned value is logged";

    }
}
