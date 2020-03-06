package com.example.demo;

import com.example.demo.Service.A;
import com.example.demo.Service.B;
import com.example.demo.Service.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by maysam.mokarian on 06/03/2020
 */
@RestController
public class Controller {

    @Autowired
    A a;
    @Autowired
    B b;
    @Autowired
    C c;
    @GetMapping(value = { "/call" }, produces = { "application/json; charset=UTF-8" })
    public ResponseEntity<?> jobsHealth() {
        ResponseEntity<String> restCallJob =  new ResponseEntity("Logged", HttpStatus.OK);
        a.call();
        b.call();
        c.call();
        return restCallJob;
    }
}
