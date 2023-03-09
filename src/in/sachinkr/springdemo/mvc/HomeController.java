package in.sachinkr.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showMyPage() {
		return "home";
	}
	
	@RequestMapping("/name-form")
	public String sayMyName() {
		System.out.println("In sayMyName");
		return "home";
	}
}
