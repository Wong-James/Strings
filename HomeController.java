package com.james.strings;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String HelloFriends() {
		return "Hello client! How are you doing?";
	}
	@RequestMapping("/random")
	public String Random() {
		return "Spring boot is great! So easy to just respond with strings";
	}

}
