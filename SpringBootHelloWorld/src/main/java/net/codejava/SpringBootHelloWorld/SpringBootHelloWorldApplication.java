package net.codejava.SpringBootHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}

	@RequestMapping("/")
    public String home(){
        return "<h1>Hello world Spring Boot</h1>";
    }

    @RequestMapping("/new")
    public String newMessage(){
        return "<h2>This is a new message</h2>";
    }

    @CrossOrigin(origins = "http://localhost:3000/api/hello", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST})
    @GetMapping("/api/hello")
    public String newMessageCors(){
        return "<h2>Hello world Cors!</h2>";
    }

}
