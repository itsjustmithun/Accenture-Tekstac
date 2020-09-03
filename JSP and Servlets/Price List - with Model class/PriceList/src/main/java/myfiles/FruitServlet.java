package myfiles;

import java.io.IOException;
import java.io.PrintWriter;

 import javax.servlet.ServletException;
 import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

    /**
     * Servlet implementation class FruitServlet
     */
    public class FruitServlet extends HttpServlet {
    	private static final long serialVersionUID = 1L;
          
       /**
        * @see HttpServlet#HttpServlet()
        */
       public FruitServlet() {
           super();
           // TODO Auto-generated constructor stub
        }
    
    	/**
    	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    	 */
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		// TODO Auto-generated method stub
    		response.getWriter().append("Served at: ").append(request.getContextPath());
    	}
    
    	/**
    	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    	 */
   	public  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		// TODO Auto-generated method stub
    		int apple=Integer.parseInt(request.getParameter("apple"));
    		int orange=Integer.parseInt(request.getParameter("orange"));
    		int mango=Integer.parseInt(request.getParameter("mango"));
    		int grapes=Integer.parseInt(request.getParameter("grapes"));
    		int pineapple=Integer.parseInt(request.getParameter("pineapple"));
    		
    		Inventory i=new Inventory();
    	
    		int totprice=0;
    		
    		if(apple!=0) totprice=totprice+(i.getPrice("apple")*apple);
    		if(orange!=0) totprice=totprice+(i.getPrice("orange")*orange);
    		if(mango!=0) totprice=totprice+(i.getPrice("mango")*mango);
    		if(grapes!=0) totprice=totprice+(i.getPrice("grapes")*grapes);
   		if(pineapple!=0) totprice=totprice+(i.getPrice("pineapple")*pineapple);
    		
    		PrintWriter writer = response.getWriter();
    		
   		writer.println("The total bill amount is Rs." + totprice);
    		writer.close();
    		
    		
    		
    	}
    
    }
   