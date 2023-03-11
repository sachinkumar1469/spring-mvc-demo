package in.sachinkr.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DynamicRoutes {
	
	@RequestMapping("/dynamic")
	public String child() {
		return "dynamic";
	}
	
	@RequestMapping("/dynamic/{child1}")
	public String child1(@PathVariable String child1,Model model) {
		// handle child1 route
		model.addAttribute("name", child1);
		return "dynamic";
	}
}
