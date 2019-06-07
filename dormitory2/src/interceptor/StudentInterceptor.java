package interceptor;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import studentmodle.Student;

import action.AdminAction;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class StudentInterceptor  extends AbstractInterceptor {
	public String intercept(ActionInvocation invocation) throws Exception {
		HttpSession session=ServletActionContext.getRequest().getSession();
		Student student=(Student) session.getAttribute("student");
		if(student!=null){
			return invocation.invoke();
		}else{
			 String url=ServletActionContext.getRequest().getRequestURI();
			if(url.contains("login.action")||url.contains("register.action")||url.contains("jsonValidate")||url.contains("rz"))
			return	invocation.invoke();
			else{
				return "login";
			    }
		    }
		
	   }
}
