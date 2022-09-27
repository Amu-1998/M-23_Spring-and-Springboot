package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	@RequestMapping("home")
	//To send the request to http protocol
	
	public String print(HttpServletRequest req,HttpServletResponse res)
	{
		HttpSession session=req.getSession();
		String name=req.getParameter("name");
		System.out.println("Hi "+name);
		session.setAttribute("name",name);
		
		System.out.println("Today is the celebration of 10th Anniversary"
				+" of TNS India Foundation");
		return "home.jsp";
	}
}
