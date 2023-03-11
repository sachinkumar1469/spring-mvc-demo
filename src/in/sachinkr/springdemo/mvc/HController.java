package in.sachinkr.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;



@Controller
public class HController {
	
	@RequestMapping("/")
	public String home(HttpServletRequest http) {
//		System.out.println("In Home Controller");
		return "home";
	}
	
	@RequestMapping("/form-page")
	public String formPage() {
		return "form-page";
	}
	
	@RequestMapping("/handle-form")
	public String handleForm(HttpServletRequest http,Model model) {
		String name = http.getParameter("name");
//		System.out.println(name);
		name = name.toUpperCase();
		model.addAttribute("name",name);
		return "form-data";
	}
	
	@RequestMapping("/handle-form2")
	public String handleForm2(@RequestParam("name") String name,Model model) {
		name = name.toUpperCase();
		model.addAttribute("name",name);
		return "form-data";
	}
}
