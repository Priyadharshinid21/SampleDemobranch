package com.example.demosampledto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class DemosampledtoApplication {
@PostMapping("/purchase")
	public String getdetails(@RequestBody OrderRequest request)
	{
		return "Hi"+ " "+request.getName()+" "+"your id and address is"+" "+request.getId()+ " "+request.getAddress();
	}
	public static void main(String[] args) {
		SpringApplication.run(DemosampledtoApplication.class, args);
	}

}
