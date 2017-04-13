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
import com.samson.model.Truck; 
import com.samson.service.TruckService;
 
@Controller 
public class TruckController {
	private TruckService truckService;
	//private Truck truck ;
	
	@Autowired(required=true)
	@Qualifier(value="truckService")
	public void setUserService(TruckService ts){
		this.truckService = ts;
	}
	 @RequestMapping(value = "/trucks", method = RequestMethod.GET)
	public @ResponseBody String listTrucks() {
		 ArrayList trucks =  (ArrayList) this.truckService.getAll();
		 String json = new Gson().toJson(trucks);
		 return json; 
	} 	
 
	@RequestMapping(value= "/truck/add", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("truck") Truck t){
		System.out.println("a truck is going to be added");
		if(t.getId() == 0){
			//new coordinate, add it
			this.truckService.add(t);
		}else{
			//existing coordinate, call update
			this.truckService.update(t);
		}
		
		return "redirect:/register_truck";
		
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
