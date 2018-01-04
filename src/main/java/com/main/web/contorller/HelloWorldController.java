package com.main.web.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/hello.do")
public class HelloWorldController {
	
	@ModelAttribute("person")
	public Object getAttributes(){
		return null;
	}
	
    @RequestMapping("/test/he.*")
    public String helloWorld(@ModelAttribute("pet") String pet,BindingResult result) {
        if(result.hasErrors()){
        	return "fileupload";
        }
        return "hello";
    }
    
    @RequestMapping(params = "method=tofileupload")
    @ResponseBody
    public String toFileUpload(){
    	return "fileupload";
    }
    
}