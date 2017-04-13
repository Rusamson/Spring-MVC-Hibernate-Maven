package com.samson;
 

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.ModelAttribute; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 
 
 
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.samson.model.Task; 
import com.samson.service.TaskService;
 
@Controller 
public class TaskController {
	private TaskService taskService;
	//private Task task ;
	
	@Autowired(required=true)
	@Qualifier(value="taskService")
	public void setUserService(TaskService ts){
		this.taskService = ts;
	}
	 @RequestMapping(value = "/tasks", method = RequestMethod.GET)
	public @ResponseBody String listTasks() {
		 ArrayList tasks =  (ArrayList) this.taskService.getAll();
		 String json = new Gson().toJson(tasks);
		 return json; 
	} 
 
	@RequestMapping(value= "/task/add", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("task") Task t){
		System.out.println("a task is going to be added");
		if(t.getId() == 0){
			//new coordinate, add it
			this.taskService.add(t);
		}else{
			//existing coordinate, call update
			this.taskService.update(t);
		}
		
		return "redirect:/tasks_add";
		
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
