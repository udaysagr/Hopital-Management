package com.htc.hospitalreview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EntityScan("com.htc.hospitalreview.model")
@EnableEurekaClient
public class HospitalReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalReviewApplication.class, args);
	}

}
