package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
@GetMapping("/homepage")
public String home()
{
	return "Docker is running";
}
}
