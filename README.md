## Spring Boot modules

Spring Boot modules demonstrates the flexibility architecture of building web applications based on Spring Framework.
Main module built on Spring Boot and configured via annotations whereas sub modules built in old fashion mode where beans configured in application.xml files. Main application consumes services provided in sub modules through `@Autowared` annotation. 
This approach allows to plug-in old spring modules in spring boot application.

FrontController code below show how to use services from two different old-fashion modules in Spring Boot RestController


```
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
```

### Requirements:
- Java 1.8
- Maven 3

### Build:
 `mvn clean package`
 
### Run:
`mvn spring-boot:run`

Open browser and see results for two endpoints:

One: 		[http://localhost:8080/api/v1/servicea](http://localhost:8080/api/v1/servicea)

Second:		[http://localhost:8080/api/v1/serviceb](http://localhost:8080/api/v1/serviceb)

