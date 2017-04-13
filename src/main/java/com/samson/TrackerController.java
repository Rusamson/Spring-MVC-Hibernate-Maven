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
import com.samson.model.Tracker; 
import com.samson.service.TrackerService;
 
@Controller 
public class TrackerController {
	private TrackerService trackerService;
	//private GpsCoordinate tracker ;
	
	@Autowired(required=true)
	@Qualifier(value="trackerService")
	public void setTrackerService(TrackerService ts){
		this.trackerService = ts;
	}
	 @RequestMapping(value = "/trackers", method = RequestMethod.GET)
	public @ResponseBody String listTrackers() {
		 ArrayList trackers =  (ArrayList) this.trackerService.getAll();
		 String json = new Gson().toJson(trackers);
		 return json; 
	} 	
 
	@RequestMapping(value= "/tracker/add", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("tracker") Tracker t){
		System.out.println("a tracker is going to be added");
		if(t.getId() == 0){
			//new coordinate, add it
			this.trackerService.add(t);
		}else{
			//existing coordinate, call update
			this.trackerService.update(t);
		}
		
		return "redirect:/register_tracker";
		
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
