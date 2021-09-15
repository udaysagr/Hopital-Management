package com.htc.hospitalaggregate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType;

@EnableHypermediaSupport(type=EnableHypermediaSupport.HypermediaType.HAL)
@SpringBootApplication
@EnableFeignClients("com.htc.hospitalaggregate.externalservices")
public class HospitalAggregateApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalAggregateApplication.class, args);
	}

}
