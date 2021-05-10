package pl.krystian;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String getForm() {
		return "index";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "form-result";
	}
	
	@RequestMapping("/processFormV2")
	public String processFormV2(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName, Model model) {
		
		
		firstName = "Mr " + firstName;
		
		model.addAttribute("firstName", firstName);
		model.addAttribute("lastName", lastName);
		
		return "form-result-v2";
	}
}

