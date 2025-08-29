package uz.pdp.dockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/home")
public class HomeController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Springboot with Docker Application!";
    }

    @GetMapping("/hi")
    public String hi() {
        return "Hi Docker-Compose!";
    }
}
