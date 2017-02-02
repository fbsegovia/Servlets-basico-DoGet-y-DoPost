package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParametrosServlet
 */
public class ParametrosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParametrosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parametro1 = request.getParameter("param1");
		
		PrintWriter pw =response.getWriter();//Obtenemos el objeto que escribe en el body.
		
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<p>Hola ha hecho una petición GET!! el parametro que ha metido usted es "+parametro1+" </p>");
		pw.println("</body>");
		pw.println("</html>");
		
		response.setContentType("text.html");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parametro1 = request.getParameter("param1");
		String parametro2 = request.getParameter("param2");
		int numero = Integer.parseInt(parametro2);
		PrintWriter pw =response.getWriter();
		
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<H2 style='color:green'>Hola ha hecho una petición POST!! el parametro que ha metido usted es "+parametro1+" </H2>");
		pw.println("<p>Hola ha hecho una petición POST!! el numero incrementado es "+ ++numero +" </p>");
		//Se debe incrementar antes del numero ya que sino escribira el numero sin incrementar cuando se use el parametro2
		pw.println("</body>");
		pw.println("</html>");
		
		response.setContentType("text.html");
	}

	
}
