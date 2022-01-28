package com.project.mutroduce;

import com.project.mutroduce.controller.HomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = HomeController.class)
@ComponentScan(basePackages = {"com.project.mutroduce"})
public class MutroduceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MutroduceApplication.class, args);
	}

}
