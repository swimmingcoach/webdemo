package cn.zealot.webdemo.controller;

import cn.zealot.webdemo.pojo.NameBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {

    @Value(value = "${com.hello}")
    private String HELLO;

    @GetMapping(value = "/test")
    @ResponseBody
    public String test() {
        return HELLO;
    }

    @PostMapping(value = "/test", params = "action=post")
    @ResponseBody
    public NameBean post(@RequestParam String name) {
        NameBean nameBean = new NameBean();
        nameBean.setName(name);
        nameBean.setAge(12);
        return nameBean;
    }
}
