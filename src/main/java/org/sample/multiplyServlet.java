package org.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class multiplyServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
    PrintWriter out = response.getWriter();
	if(request.getParameter("number1")!=null && request.getParameter("number2")!=null)	{
	Long num1 =Long.parseLong(request.getParameter("number1"));
    Long num2 =Long.parseLong(request.getParameter("number2"));
		
  
    
    out.println("The result of multiplication is"+ (num1 * num2));
    
    
	}else {
		out.println("Enter the valid input");
	}

}
}
