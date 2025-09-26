<<<<<<< HEAD
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HelloController {
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello";
	}
}
=======
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HelloController {
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello";
	}
}
>>>>>>> 8d4f53d (basic function of springboot)
