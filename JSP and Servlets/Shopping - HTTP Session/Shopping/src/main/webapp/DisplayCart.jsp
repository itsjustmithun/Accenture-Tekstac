 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
     <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
     <html>
     <head>
     <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
     <title>Insert title here</title>
     </head>
     <body>
    <%
    
     /* WRITE YOUR SNIPPET CODE HERE */
     int apple=0,mango=0,orange=0,grapes=0,pineapple=0;
     if(session.isNew()){
         
     }
     else{
         apple=Integer.parseInt(session.getAttribute("apple"));
         mango=Integer.parseInt(session.getAttribute("mango"));
         grapes=Integer.parseInt(session.getAttribute("grapes"));
         orange=Integer.parseInt(session.getAttribute("orange"));
         pineapple=Integer.parseInt(session.getAttribute("pineapple"));
         if(apple!=0){
             out.println("Total Apples in cart ="+apple+"<br>");
             
         }
         if(orange!=0)
            out.println("Total Oranges in cart ="+orange+"<br>");
        if(mango!=0)
            out.println("Total Mangoes in cart ="+mango+"<br>");
        if(grapes!=0)
            out.println("Total Grapes in cart ="+grapes+"<br>");
        if(pineapple!=0)
            out.println("Total Pineapples in cart ="+pineapple+"<br>");
    }
    
    %>
    
    <a href="Catalog.jsp">Back to catalog</a>
    </body>
    </html>