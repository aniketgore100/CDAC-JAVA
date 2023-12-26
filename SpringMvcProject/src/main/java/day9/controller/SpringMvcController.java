package day9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Marks this class as a Controller
public class SpringMvcController {
	
	//Defining a request handling method
	@RequestMapping("/showIndex")
	public String getIndexPage() {
		return "index";//Returns view name
	}

}
