package aman.mvc.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

@RequestMapping(value = {"/","/index", "/home"})
public ModelAndView index() {
ModelAndView mv = new ModelAndView("page");
mv.addObject("greetings","welcome to new page");
return mv;


}

}
