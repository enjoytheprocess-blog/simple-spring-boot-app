package blog.enjoytheprocess.blog.enjoytheprocess.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/hello")
    public String getMethod() {
        return "ENJOY YOUR PROCESS";
    }
}
