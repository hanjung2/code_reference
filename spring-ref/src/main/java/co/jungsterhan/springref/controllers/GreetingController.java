package co.jungsterhan.springref.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*
    Spring version >= 4.x, @RestController was introduce.
    Annotation is combination of @Controller and @ResponseBody at response function
*/
@RestController
@RequestMapping("greeting")
public class GreetingController {
    @GetMapping("/greet")
    public String getGreeting() {
        return "Hello";
    }
}
