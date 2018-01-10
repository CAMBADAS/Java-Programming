import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class firstservlet extends HttpServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/plain");
		Printwriter pw=req.getWriter();
		pw.println("my servlet is running");
	}
}