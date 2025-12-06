package com.Amar.demoApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HomeController {

   @RequestMapping("/")

    public String greet(){
       System.out.println("greet method called");
        return "Hello, welcome to the Home Page!";
    }
}
