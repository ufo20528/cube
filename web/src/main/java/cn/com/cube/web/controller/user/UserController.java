package cn.com.cube.web.controller.user;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.cube.service.user.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	private static Logger log = Logger.getLogger(UserController.class);

	@RequestMapping("/test")
	public String hello() {
		log.debug("test");
		userService.getUserById(1);
		return "success";
	}
	
	@RequestMapping("/test2")
	public String test()
	{
		return "test";
	}
	
	@RequestMapping("/test3")
	public String test2()
	{
		return "test2";
	}

}
