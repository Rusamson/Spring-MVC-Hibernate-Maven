package com.samson;

import java.awt.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.samson.model.GpsCoordinate; 
import com.samson.service.GpsCoordinateService;
 
@Controller
@RequestMapping("/g")
public class GpsController {
	private GpsCoordinateService coordinateService;
	//private GpsCoordinate g ;
	
	@Autowired(required=true)
	@Qualifier(value="gpsCoordinateService")
	public void setCoordinateService(GpsCoordinateService cs){
		this.coordinateService = cs;
	}
	
	 @RequestMapping(value = "/coordinates", method = RequestMethod.GET)
	public @ResponseBody String listCoordinates() {
		 ArrayList l =  (ArrayList) this.coordinateService.getAll();
		 ArrayList l2 = new ArrayList();
		   for(int x = 0; x < l.size(); x++){
		 ArrayList subL2 = new ArrayList();
		 String s = " "+l.get(x);
		 String[] ss = s.split(":"); 	 
		 String[] arr1 = ss[1].split(" ", 2);
		 String[] arr2 = ss[2].split(" ", 2);		 
			  //System.out.println("the Lat is "+arr1[0]+" and the Long is "+arr2[0]); 
		      subL2.add("Name");
		      subL2.add(arr1[0]);
		      subL2.add(arr2[0]);	
		      subL2.add(x);
			   l2.add(subL2);
		 } 
		 String json = new Gson().toJson(l2);
		return json;
	} 
		//For add and update coordinates both
		@RequestMapping(value= "/coordinate/add", method = RequestMethod.GET)
		public @ResponseBody String addCoordinate(@ModelAttribute("coordinate") GpsCoordinate c){
			if(c.getId() == 0){
				//new coordinate, add it
				this.coordinateService.add(c);
			}else{
				//existing coordinate, call update
				this.coordinateService.update(c);
			}
			
			return "ok";
			
		}
	 
	@RequestMapping("/ajax")
    public ModelAndView helloAjaxTest() {
        return new ModelAndView("ajax", "message", "Crunchify Spring MVC with Ajax and JQuery Demo..");
    }
 
    @RequestMapping(value = "/ajaxtest", method = RequestMethod.GET)
    public @ResponseBody
    String getTime() {
 
        Random rand = new Random();
        float r = rand.nextFloat() * 100;
        String result = "<br>Next Random # is <b>" + r + "</b>. Generated on <b>" + new Date().toString() + "</b>";
        System.out.println("Debug Message from CrunchifySpringAjaxJQuery Controller.." + new Date().toString());
        return result;
    }

	/* @RequestMapping(value = "/coordinates", method = RequestMethod.GET)
	public String listCoordinates(Model model) {
		model.addAttribute("coordinate", new GpsCoordinate());
		model.addAttribute("listCoordinates", this.coordinateService.getAll());
		return "coordinate";
	} */
	/*
	//For add and update person both
	@RequestMapping(value= "/coordinate/add", method = RequestMethod.POST)
	public String addCoordinate(@ModelAttribute("coordinate") GpsCoordinate c){
		if(c.getId() == 0){
			//new coordinate, add it
			this.coordinateService.add(c);
		}else{
			//existing coordinate, call update
			this.coordinateService.update(c);
		}
		
		return "redirect:/coordinates";
		
	}
	*/
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
    }
}
