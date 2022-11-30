package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController
{
	@GetMapping("/welcome")
	public String welcomeMsg()
	{
		return "Hi KL Welcome Back to RCB";
		
	}
	
	@GetMapping("/greet")
	public String greetMsg()
	{
		return "Good Morning KL";
		
	}
	
	@GetMapping("/safe")
	public String safeMsg()
	{
		return "Be safe KL";
		
	}
	
	@GetMapping("/played")
	public String playedMsg()
	{
		return "Well Played Kl rahul";
		
	}

}
