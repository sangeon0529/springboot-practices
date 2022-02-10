package myweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MyWebApplication {

	@Controller
	public class HelloController {
		@GetMapping("/hello")
		public String hello1() {
			return "hello";
		}
	}

	@RestController
	public class HelloController2 {
		
		@GetMapping("/hello2")
		public String hello2() {
			return "<h1>Hello World</h1>";
		}
		
	}
	public static void main(String[] args) {
		SpringApplication.run(MyWebApplication.class, args);
	}
}
