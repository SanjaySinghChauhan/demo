package com.example.demo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Model.User;
import com.example.demo.Service.SignUpService;


@Controller
@SpringBootApplication
public class DemoApplication {   
	
	@Autowired
	public SignUpService signUpService; 

	@RequestMapping("/")
	@ResponseBody
	String home() {
		
		return "Its started";
	}
	// @Valid Customer customer,BindingResult bindingResult, Model model
//	@RequestMapping(value= "/SignUp", method=RequestMethod.POST)
//	@ResponseBody
//	//String SignUp(@PathVariable("userEmail") String email, @PathVariable("Password") String pass) {
//	String SignUp(@Valid User user,BindingResult bindingResult) {
//		if(user.getUserEmail()!="" && user.getUserPass() !="") {
//			System.out.println(user.getUserEmail() + "  "+ user.getUserPass());
//		}
//		//signUpService.signUpFormSubmition(user);
//		return "Its started";
//	}
	
	@RequestMapping("/abc")
	@ResponseBody
	String home1() {
		
		return "Its abc started";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
