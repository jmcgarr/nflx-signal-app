package com.netflix

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.*

@Configuration
@EnableAutoConfiguration
@RestController
class HelloWorldApplication {

	@RequestMapping("/")
	def helloWorld() {
		[message: "Hello World"]
	}

	static void main(String[] args) throws Exception {
		SpringApplication.run(HelloWorldApplication.class, args)
	}
}