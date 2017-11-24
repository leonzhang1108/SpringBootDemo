package com.test;

import com.test.domain.ConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class})
public class Application {

	@RequestMapping("/")
	public String index(){
		return "Leon's First SpringBoot App";
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}