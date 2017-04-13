package com.samson;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

 
 
 
@Controller 
public class MainController { 
	  @RequestMapping({"/index", "/"})
	public String getMainPage(Model model) { 
		model.addAttribute("page", "pages/dashboard.jsp");
		model.addAttribute("m1", "message 1 ");
		model.addAttribute("m2", "message 2 ");
		return "default";
	}  
	   @RequestMapping("/{page}")
	public String removeCooloadingPages(@PathVariable("page") String page , Model model){
			model.addAttribute("page", "pages/"+page+".jsp");
	        return "default";
	    } 
/*	@RequestMapping("/get/{page}")
    public String removeCoordinate(@PathVariable("page") String page , Model model){
		model.addAttribute("page", "pages/"+page+".jsp");
        return "default";
    }
*/	

}
