package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "welcome to ashok It");
		mav.setViewName("message");
		return mav;
	}
	
	@GetMapping("/Greet")
	public ModelAndView getGreetMsg() {
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "Lo kude tunne unnu ba");
		mav.setViewName("message");
		return mav;
		
		
	}
}
