package com.example.demo.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by maysam.mokarian on 12/1/2017.
 */
@org.springframework.stereotype.Service
public class A {

    private final Logger logger = LoggerFactory.getLogger(A.class);


    public void call() {
        final long start = System.currentTimeMillis();

        //beginning of the business logic
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //end of business logic

        logger.info("void com.example.demo.Service.A.call(), EXECUTED_IN(ms), "
                + String.valueOf(System.currentTimeMillis() - start));

    }

}
