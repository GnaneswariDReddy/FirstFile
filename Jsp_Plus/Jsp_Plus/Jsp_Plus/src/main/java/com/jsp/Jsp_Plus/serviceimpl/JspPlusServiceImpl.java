package com.jsp.Jsp_Plus.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.Jsp_Plus.model.JspPlus;
import com.jsp.Jsp_Plus.repository.JspPlusRepo;
import com.jsp.Jsp_Plus.service.JspPlusService;
@Service
public class JspPlusServiceImpl implements JspPlusService
{
	@Autowired
	private JspPlusRepo repo;

	@Override
	public JspPlus save(JspPlus jspplus) {
		// TODO Auto-generated method stub
		if(jspplus.getPassword().equals(jspplus.getConfirm_password()))
		{
			return repo.save(jspplus);
		}
		else
		{
			return null;
		}
	}

	@Override
	public JspPlus update(JspPlus jspplus, int id) {
		// TODO Auto-generated method stub
		
		if(repo.existsById(id))
		{
			if(jspplus.getPassword().equals(jspplus.getConfirm_password()))
			{
				return repo.save(jspplus);
			}
		}
		return null;
	}

}
