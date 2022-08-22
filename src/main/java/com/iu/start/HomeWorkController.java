package com.iu.start;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/notice/*")
public class HomeWorkController {
	
	@RequestMapping(value = "list.iu", method = RequestMethod.GET)
	public String list(HomeWorkDTO homeWorkDTO) {
		System.out.println("get list");
		
		return "notice/list";
	}
	
}
