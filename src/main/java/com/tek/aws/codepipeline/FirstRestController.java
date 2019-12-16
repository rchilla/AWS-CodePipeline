package com.tek.aws.codepipeline;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/awsCodepipeline") 
@RestController
public class FirstRestController {
	public String awsCodeipeline() {
		
		return "Introduction of AWS Codepioeline";
		//SSystem.out.println("This is to test");

		
	}
}
