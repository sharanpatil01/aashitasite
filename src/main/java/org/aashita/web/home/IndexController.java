package org.aashita.web.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class IndexController {

	
	@RequestMapping("/home")
	public String index() {
		return "index.html";
	}
}
