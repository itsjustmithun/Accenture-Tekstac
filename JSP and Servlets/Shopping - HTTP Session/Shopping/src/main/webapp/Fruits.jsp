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
    
    <!-- WRITE YOUR CODE HERE -->
    <form name="fruits" method="post" action="CartServlet">
    <table border="1">
    <tr>
    <th>FRUIT NAME</th>
    <th>QUANTITY (IN KG)</th>
    </tr>
    <tr>
    <td>APPLE</td>
    <td><input type="text" name ="apple"/></td>
    </tr>
    <tr>
    <td>ORANGE</td>
    <td><input type="text" name="orange"/></td>
    </tr>
    <tr>
    <td>MANGO</td>
    <td><input type="text" name="mango"/></td>
    </tr>
    <tr>
    <td>GRAPES</td>
    <td><input type="text" name="grapes"/></td>
    </tr>
    <tr>
    <td>PINE APPLE</td>
    <td><input type="text" name="pineapple"/></td>
    </tr>
    <tr>
    <td colspan="2"><input type="submit" name="submit" value="Add to cart"/></td>
    </tr>
    </table>
    </form>
    
    </body>
   </html>