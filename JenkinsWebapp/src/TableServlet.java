

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import java.io.*;
import java.util.*;

@WebServlet("/TableServlet")
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public TableServlet() {
        super();
      
    }
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	
	
	   
	        PrintWriter pw;
	        response.setContentType("text/html");
	        pw=response.getWriter();

	        String num= request.getParameter("number");
	        int n= Integer.parseInt(num);
	        for(int i=1;i<=10;i++)
	        {
	            pw.println("<br>"+n+"*"+i+"="+n*i);
	            
	        }
	       





	       
	        pw.close();

	    } 
	
		
	}


