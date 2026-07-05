package com.ibm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.bean.Details;

@RestController
@RequestMapping("/api")
public class DetailsController {

	@GetMapping("/details")
	public Details getDetails() {

		Details details = new Details();
		details.setAddress("bekobar");
		details.setContactNumber("98199182r");
		details.setEmail("test@test.comr");
		details.setId(101);

		return details;
	}

}
