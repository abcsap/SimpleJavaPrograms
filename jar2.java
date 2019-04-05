import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class jar2 extends HttpServlet 
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("application/pdf");
		ServletContext ctx = getServletContext();
      		InputStream isr = ctx.getResourceAsStream("/TE.pdf");
                int read=0;
     		byte[] bytes = new byte[10000];
		OutputStream os = response.getOutputStream();
		while((read = isr.read(bytes)) !=-1)
		{
			os.write(bytes,0,read);
		}
		os.flush();
		os.close();
	}
}
