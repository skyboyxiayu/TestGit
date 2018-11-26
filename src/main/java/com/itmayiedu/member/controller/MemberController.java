package com.itmayiedu.member.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author jiangwei
 *
 */

@RestController
@EnableAutoConfiguration
public class MemberController {
	@RequestMapping("/memberIndex")
	public String memberIndex() {
		return "springboot2.0 螞蟻";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(MemberController.class, args);
	}

}
