package com.jay.react;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class JenkinsController {

	@RequestMapping("/hello")
	@ResponseBody
	String testJenkins() {
		
		return "Jenkins tested";
		
	}
	
}
