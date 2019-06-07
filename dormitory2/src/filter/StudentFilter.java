package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import studentmodle.Student;

public class StudentFilter implements Filter{
	
		
		public void destroy() {
			// TODO Auto-generated method stub
			
		}

		public void doFilter(ServletRequest req, ServletResponse resp,
				FilterChain chain) throws IOException, ServletException {
		  HttpServletRequest request=(HttpServletRequest) req;
		  String uri=request.getRequestURI();
		  HttpSession session=request.getSession();
		 Student student=( Student) session.getAttribute("student");
		  if(student!=null) chain.doFilter(req, resp);
		  else{
			  if(uri.contains("index.jsp")||uri.contains("register.jsp")||uri.contains("error.jsp")||uri.contains("admini")||uri.contains("error2.jsp"))
			  { chain.doFilter(req, resp);}
			  else{
				  ((HttpServletResponse)resp).sendRedirect("error.jsp");
			  }
		  }
			
		}

		public void init(FilterConfig filterconfig) throws ServletException {
			
			
		}
}
