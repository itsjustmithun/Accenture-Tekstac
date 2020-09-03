 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
     <html>
     <head>
     <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
     <title>Insert title here</title>
     </head>
     <body>
    <h1> Place your fruit order here </h1>
    
    <form name="fruits" method="post" action="FruitServlet">
    <table border=1>
    <tr>
    	<td><B>FRUIT NAME</B></td>
    	<td><B>QUANTITY (IN KG)</B></td>
    </tr>
    <tr>
   	<td>APPLE</td>
    	<td><input type="text" name="apple" value=0></td>
    </tr>
    
    <tr>
    	<td>ORANGE</td>
    	<td><input type="text" name="orange" value=0></td>
    </tr>
    
   <tr>
    	<td>MANGO</td>
    	<td><input type="text" name="mango" value=0></td>
    </tr>
    
    <tr>
    	<td>GRAPES</td>
    	<td><input type="text" name="grapes" value=0></td>
   </tr>
    
    <tr>
    	<td>PINE APPLE</td>
    	<td><input type="text" name="pineapple" value=0></td>
    </tr>
    
    <tr>
    <td colspan="2"><input type="submit" name="submit" value="Checkout Bill"></td>
    </table>
    
    
    </form>
    
    
    </body>
    </html>