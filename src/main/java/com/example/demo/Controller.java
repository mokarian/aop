package com.example.demo;

import com.example.demo.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by maysam.mokarian on 12/1/2017.
 */
@RestController
public class Controller {

    @Autowired
    Service service;
    @GetMapping(value = { "/call" }, produces = { "application/json; charset=UTF-8" })
    public ResponseEntity<?> jobsHealth() {
        ResponseEntity<String> restCallJob =  new ResponseEntity("", HttpStatus.OK);
        service.doSomething();
        service.doAnotherThing();
        return restCallJob;
    }
}
