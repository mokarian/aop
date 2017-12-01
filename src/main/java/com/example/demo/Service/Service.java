package com.example.demo.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by maysam.mokarian on 12/1/2017.
 */
@org.springframework.stereotype.Service
public class Service {

    private final Logger logger = LoggerFactory.getLogger(Service.class);


    public void doSomething() {
        final long start = System.currentTimeMillis();

        //some business logic here
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        logger.info("REQUEST_LATENCY_doSomething:"
                + String.valueOf(System.currentTimeMillis() - start));

    }

    public void doAnotherThing() {
        final long start = System.currentTimeMillis();

        //some business logic here
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        logger.info("REQUEST_LATENCY_doAnotherThing:"
                + String.valueOf(System.currentTimeMillis() - start));

    }


    public String doAndLog() {
        //some business logic here
        //and finally we like to log what is returned value
        String value = "returned value is logged";
        logger.info(value);
        return value;

    }
}
