package cn.zealot.webdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Value("${com.hello}")
    private String HELLO;

    @GetMapping(value = "/test")
    public String test() {
        return HELLO;
    }

    @PostMapping(value = "/test", params = "action=post")
    public String post(@RequestParam String name) {
        return HELLO + " " + name;
    }
}
