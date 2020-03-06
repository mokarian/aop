package com.example.demo.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by maysam.mokarian on 12/1/2017.
 */
@org.springframework.stereotype.Service
public class Service {

    private final Logger logger = LoggerFactory.getLogger(Service.class);


    public void a() {
        final long start = System.currentTimeMillis();

        //some business logic here
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        logger.info("REQUEST_LATENCY_A:"
                + String.valueOf(System.currentTimeMillis() - start));

    }

    public void b() {
        final long start = System.currentTimeMillis();

        //some business logic here
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        logger.info("REQUEST_LATENCY_B:"
                + String.valueOf(System.currentTimeMillis() - start));

    }


    public void c() {
        final long start = System.currentTimeMillis();
        //some business logic here
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("REQUEST_LATENCY_C:"
                + String.valueOf(System.currentTimeMillis() - start));

    }
}
