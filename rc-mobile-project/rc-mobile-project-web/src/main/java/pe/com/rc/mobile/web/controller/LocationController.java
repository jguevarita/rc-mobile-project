package pe.com.rc.mobile.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pe.com.rc.mobile.model.Location;
import pe.com.rc.mobile.service.location.LocationService;

@RestController
@RequestMapping("/location")
public class LocationController {

	@Autowired
	LocationService locationService;

	@RequestMapping(value = "/listAll", method = RequestMethod.POST, produces = { "application/json" })
	public @ResponseBody List<Location> listLocations() {
		List<Location> listaLocacitons = locationService.listLocations();
		return listaLocacitons;
	}
}
