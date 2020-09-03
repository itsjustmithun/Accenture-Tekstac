package myfiles;
     
     import java.io.IOException;
     import java.util.HashMap;
     import java.util.Map;
     import java.util.Vector;
     
    import javax.servlet.RequestDispatcher;
    import javax.servlet.ServletException;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    import javax.servlet.http.HttpSession;
    
    /**
     * Servlet implementation class CartServlet
     */
    public class CartServlet extends HttpServlet {
    	private static final long serialVersionUID = 1L;
           
        /**
         * @see HttpServlet#HttpServlet()
         */
        public CartServlet() {
            super();
            // TODO Auto-generated constructor stub
        }
    
    	/**
    	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    	 */
    	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		// TODO Auto-generated method stub
    		response.getWriter().append("Served at: ").append(request.getContextPath());
    	}
    
    	/**
    	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    	 */
    	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    			
    		
    		/* WRITE YOUR CODE HERE */
    		HttpSession ses = request.getSession();
    		ses.setAttribute("apple",request.getParameter("apple"));
    		ses.setAttribute("mango",request.getParameter("mango"));
    		ses.setAttribute("grapes",request.getParameter("grapes"));
    		ses.setAttribute("orange",request.getParameter("orange"));
    		ses.setAttribute("pineapple",request.getParameter("pineapple"));
    		RequestDispatcher rd = request.getRequestDispatcher("Catalog.jsp");
    		rd.forward(request,response);
    		
    	}
    
    }