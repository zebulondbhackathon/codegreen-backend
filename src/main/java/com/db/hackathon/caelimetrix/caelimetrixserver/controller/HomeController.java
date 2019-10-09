package com.db.hackathon.caelimetrix.caelimetrixserver.controller;

import com.db.hackathon.caelimetrix.caelimetrixserver.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HomeController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot's DB Hackathon - 2019!";
    }

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="Hack user") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
