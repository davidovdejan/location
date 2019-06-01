package com.dejan.location.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dejan.location.model.Location;
import com.dejan.location.service.LocationService;

@Controller
public class LocationController {

	@Autowired
	LocationService service;

	@RequestMapping("/showCreate") // uri name doesn't have to be same as method name
	public String showCreate() {
		// it shows starting page
		return "createLocation";
	}

	@RequestMapping("saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {

		List<Location> locations = service.getAllLocations();
		if (locations.isEmpty()) {
			service.saveLocation(location);
			Location locationSaved = service.saveLocation(location);
			String msg = "Location saved with id:" + locationSaved.getId();
			modelMap.addAttribute("msg", msg);

		} else {
//			Iterator<Location> it = locations.iterator();
//			while (it.hasNext()) {
//				if (it.next().getId() != location.getId()) {
//					System.out.println("Deja");
//					Location locationSaved = service.saveLocation(location);
//					String msg = "Location saved with id:" + locationSaved.getId();
//					modelMap.addAttribute("msg", msg);
//				}
//			}

			// iteracija kroz kolekciju pomocu stream
			locations.stream().filter(p -> p.getId() != location.getId()).map(pm -> service.saveLocation(location))
					.forEach(m -> {
						Location locationSaved = service.saveLocation(location);
						String msg = "Location saved with id:" + locationSaved.getId();
						modelMap.addAttribute("msg", msg);
					});
			;
//			Location locationSaved = service.saveLocation(location);
//			String msg = "Location saved with id:" + locationSaved.getId();
//			modelMap.addAttribute("msg", msg);
		}
		return "createLocation";
	}

	@RequestMapping("/displayLocations")
	public String displayLocatinos(ModelMap modelMap) {
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}

	@RequestMapping("deleteLocation")
	public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap) {
		Location location = service.getLocationById(id);
		service.deleteLocation(location);
//		service.getAllLocations();
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}

	// display update form updateLocation.jsp
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id, ModelMap modelMap) {
		Location location = service.getLocationById(id);
		modelMap.addAttribute("location", location);
		return "updateLocation";
	}

	@RequestMapping("updateLoc")
	public String updateLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {

		service.updateLocation(location);

		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations", locations);

		return "displayLocations";
	}

}
