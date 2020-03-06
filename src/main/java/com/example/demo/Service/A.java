package com.example.demo.Service;

import com.example.demo.aop.Latency;

/**
 * Created by maysam.mokarian on 12/1/2017.
 */
@org.springframework.stereotype.Service
public class A {

    @Latency
    public void call() {

        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
