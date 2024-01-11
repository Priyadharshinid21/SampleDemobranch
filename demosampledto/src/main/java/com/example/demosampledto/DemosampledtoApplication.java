package com.example.demosampledto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class DemosampledtoApplication {
@PostMapping("/purchase/{id}/{name}/address")
	public String getdetails(@PathVariable int id,@PathVariable String name,@PathVariable String address)
	{
		return "Hi"+ " "+name+" "+"your id and address is"+" "+id+ " "+address;
	}
	public static void main(String[] args) {
		SpringApplication.run(DemosampledtoApplication.class, args);
	}

}
