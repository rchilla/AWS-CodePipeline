package com.tek.aws.codepipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/awsCodepipeline") 
@RestController
public class FirstRestController {
	
	@GetMapping
	public String awsCodeipeline() {
		
		return "Introduction of AWS Codepioeline";
		//System.out.println("This is to test");

		
	}
}
