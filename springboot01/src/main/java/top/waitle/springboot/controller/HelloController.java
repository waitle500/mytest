package top.waitle.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	//注入环境
	@Value("${name}")
	private String name;
	
	@Value("${url}")
	private String url;
	
	@GetMapping("/hello")
	public String hello(){
		System.out.println(name);
		System.out.println("=========");
		System.out.println(url);
		System.out.println("========");
		return "Hello World!";
	}
}
