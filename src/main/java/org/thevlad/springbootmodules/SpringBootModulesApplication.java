package org.thevlad.springbootmodules;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:applicationContext.xml"})
public class SpringBootModulesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootModulesApplication.class, args);
	}

}
