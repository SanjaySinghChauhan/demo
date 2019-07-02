package com.Signup;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignUpController {
	@RequestMapping("/hello")  
    public String hello(){  
        return"Hello!";  
    }  
}
