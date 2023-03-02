package com.jsp.Jsp_Plus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.Jsp_Plus.model.JspPlus;
import com.jsp.Jsp_Plus.service.JspPlusService;

@RestController
public class JspPlusController 
{
	@Autowired
	private JspPlusService ser;
	
	@PostMapping("/save")
	JspPlus save(@RequestBody JspPlus jspplus)
	{
		return ser.save(jspplus);
	}
	
	@PutMapping("/update/{id}")
	JspPlus update(@RequestBody JspPlus jspplus, @PathVariable int id)
	{
		return ser.update(jspplus, id);
	}
}
