package mvccrud.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import mvccrud.model.User;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm()
	{
		return "contact";
	}
	
	/*
	@RequestMapping(path = "/processform" , method = RequestMethod.POST)
	public String handleForm(
			//Method 1 to get data in controller using RequestParam
			@RequestParam("email" ) String varemail ,
			@RequestParam("username") String varname ,
			@RequestParam("userpass") String varpass , Model model) 
	{

//		System.out.println("user email is "+varemail);
//		System.out.println("user name is " + varname);
//		System.out.println("user passeword is "+varpass);
		
		//method 2 model
		
//		User user = new User();
//		user.setEmail(varemail);
//		user.setUsername(varname);
//		user.setUserpass(varpass);
//		
//		System.out.println(user);
//		model.addAttribute("user", user);
		
		//process like add data into database.
		
		model.addAttribute("name" , varname);
		model.addAttribute("email" , varemail);
		model.addAttribute("password" , varpass);
		return "success";
	}*/
	
	//method 3 model attribute best way
	@RequestMapping(path = "/processform" , method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user , Model model) 
	{
		System.out.println(user);
		
		return "success";
	}
}
