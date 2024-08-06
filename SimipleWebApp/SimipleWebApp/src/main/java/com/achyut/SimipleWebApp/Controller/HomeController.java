package com.achyut.SimipleWebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // This will create a controller
// on the website we will be having multiple requests :
// We are requesting web page after some time we might request about us, contact, etc
// it is all request , request with different url
// for every request we can create a different method which will respond
// for requesting we have to make a annotation called @RequestMapping
public class HomeController {

   @RequestMapping("/") // This request is for the greet
    // Instead of RestController we can also use @ResponseBody
    public String greet(){
        return "Welcome to Simple Web application";
    }

    @RequestMapping("/about") // This request is for the about that is in line 23
    public String about(){
       return "This is about page";
    }

}
