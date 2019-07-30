package org.thevlad.springbootmodules.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thevlad.modulea.services.ServiceA;
import org.thevlad.moduleb.services.ServiceB;

@RestController
@RequestMapping("api")

public class FrontController {

	@Autowired
	ServiceA serviceA;

	@Autowired
	ServiceB serviceB;
	
	@GetMapping("/v1/servicea")
	public String helloServiceA() {
		return serviceA.helloService();
	}

	@GetMapping("/v1/serviceb")
	public String helloServiceB() {
		return serviceB.helloService();
	}

}
