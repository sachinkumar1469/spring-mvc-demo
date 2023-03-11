package in.sachinkr.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signup")
public class SignUpController {

	
	@RequestMapping("")
	public String fromHome(Model model) {
		
		SignupModel signup = new SignupModel();
		model.addAttribute("signup", signup);
		return "signup";
	}
	
	@RequestMapping("/postsignup")
	public String signUp(@ModelAttribute("signup") SignupModel signup) {
		System.out.println(signup.getCountry());
		return "signup";
	}
	
}
