package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.MyService;

@Controller
public class TestController {
	@Autowired
	private MyService myService;
	public void printController() {
		myService.printService();
		System.out.println("Test Controller");
	}
}
