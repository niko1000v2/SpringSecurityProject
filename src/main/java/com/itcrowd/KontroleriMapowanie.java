package com.itcrowd;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class KontroleriMapowanie {
	
	@RequestMapping("/")
	@ResponseBody
	
	public String home (Model model) {
		return "Gratuluję, podałeś poprawne dane logowania!";
	}

}
