package com.jsp.Jsp_Plus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.Jsp_Plus.model.JspPlus;
@Repository
public interface JspPlusRepo extends JpaRepository<JspPlus, Integer>
{

}
