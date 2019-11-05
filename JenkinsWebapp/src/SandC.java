import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import java.io.*;
import java.util.*;

@WebServlet("/SandC")
public class SandC extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public SandC() {
        super();
      
    }
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	
	
	   
	        PrintWriter pw;
	        response.setContentType("text/html");
	        pw=response.getWriter();

	        String num= request.getParameter("number");
	        int n= Integer.parseInt(num);
	        int square=n*n;
	        int cube=n*n*n;
	       
	        pw.println("Square:"+square+"<br>");
	        pw.println("cube:"+cube);





	       
	        pw.close();

	    } 
	
		
	}

