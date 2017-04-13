package com.samson;
 

import java.awt.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.ModelAttribute; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 
 
 
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.samson.model.User; 
import com.samson.service.UserService;
 
@Controller 
public class UserController {
	private UserService userService; 
	
	@Autowired(required=true)
	@Qualifier(value="userService")
	public void setUserService(UserService us){
		this.userService = us;
	}
	 @RequestMapping(value = "/users", method = RequestMethod.GET)
	public @ResponseBody String listUsers() {
		 ArrayList users =  (ArrayList) this.userService.getAll();
		 String json = new Gson().toJson(users);
		 return json; 
	} 
 
	@RequestMapping(value= "/user/add", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User u){
		System.out.println("a user is going to be added");
		if(u.getId() == 0){
			//new coordinate, add it
			this.userService.add(u);
		}else{
			//existing coordinate, call update
			this.userService.update(u);
		}
		
		return "redirect:/register_user";
		
	}
	/*
	@RequestMapping("/remove/{id}")
    public String removeCoordinate(@PathVariable("id") int id){
		
        this.coordinateService.remove(id);
        return "redirect:/coordinates";
    }
 
    @RequestMapping("/edit/{id}")
    public String editCoordinate(@PathVariable("id") int id, Model model){
        model.addAttribute("coordinate", this.coordinateService.getById(id));
        model.addAttribute("listCoordinates", this.coordinateService.getAll());
        return "coordinate";
    }*/
}
