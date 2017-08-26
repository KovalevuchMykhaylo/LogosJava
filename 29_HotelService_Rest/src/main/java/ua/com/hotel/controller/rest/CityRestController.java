package ua.com.hotel.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.com.hotel.entity.City;
import ua.com.hotel.service.CityService;

@RestController
@RequestMapping("/admin/city")
public class CityRestController {

	@Autowired
	private CityService cityService;
	
	@GetMapping
	public List<City> findAll(){
		return cityService.findAll();
	}
	
	@GetMapping("/{id}")
	public City findOne(@PathVariable Long id){
		return cityService.findOne(id);
	}
	
	@PutMapping
	public City saveRest(@RequestBody City city){
		return cityService.save(city);
	}
	
	@DeleteMapping("/{id}")
	public HttpStatus delete(@PathVariable Long id){
		cityService.delete(id);
		return HttpStatus.OK;
	}
}