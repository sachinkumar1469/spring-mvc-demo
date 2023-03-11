package in.sachinkr.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping(value="/hello")
public class RequestHello {
	
	@RequestMapping("")
	public String sayHello(HttpServletRequest http,Model model) {
		return "hello";
	}
	
	@RequestMapping("/hello1")
	public String child() {
		return "hello1";
	}

}
