package ua.com.hotel.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
// @RequestMapping("/admin/city")
// @SessionAttributes("city")
public class CityController {

	@GetMapping("/admin/citys")
	public String people() {
		return "admin-city";
	}

}
