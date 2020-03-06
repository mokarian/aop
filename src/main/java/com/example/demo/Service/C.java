package com.example.demo.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by maysam.mokarian on 12/1/2017.
 */
@org.springframework.stereotype.Service
public class C {

    private final Logger logger = LoggerFactory.getLogger(C.class);


    public void call() {
        final long start = System.currentTimeMillis();
        //some business logic here
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("void com.example.demo.Service.C.call(), EXECUTED_IN(ms), "
                + String.valueOf(System.currentTimeMillis() - start));

    }
}
