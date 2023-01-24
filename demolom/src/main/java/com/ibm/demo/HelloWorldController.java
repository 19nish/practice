/**
 * 
 */
package com.ibm.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 003OQT744
 *
 */
@RestController
public class HelloWorldController {
	
	//GET HTTP Method 
	// http://localhost:8080/hello-world
	@GetMapping("/hello-world")
	public String helloworld() {
		return "Hello Student:";
	}

}
