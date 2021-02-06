

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="prueba.jsp" method="POST" >
            <div class="form-group">
                <label for="txt_nombre" >Primer Numero</label> 
                <input type="text" name="txt_num1" />
                <label for="txt_nombre" >Segundo Numero</label> 
                <input type="text" name="txt_num2" />
            
            </div>
            <div>
                <button type="submit" class="btn btn primary">ENVIAR</button>
            </div>
        </form>
                <%!
            String s_num1, s_num2;
            %>
                    
            <%s_num1 = request.getParameter("txt_num1"); %>
             <%s_num2 = request.getParameter("txt_num2"); %>
    </body>
</html>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	uddi.Figuras_Service service = new uddi.Figuras_Service();
	uddi.Figuras port = service.getFigurasPort();
	 // TODO initialize WS operation arguments here
	double lado1 = Double.parseDouble(s_num1);
	double lado2 = Double.parseDouble(s_num2);
	// TODO process result here
	double result = port.cuadrado(lado1, lado2);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

   
        <%-- start web service invocation --%><hr/>
    <%
    try {
	uddi.Figuras_Service service = new uddi.Figuras_Service();
	uddi.Figuras port = service.getFigurasPort();
	 // TODO initialize WS operation arguments here
	double lado1 = 0.0d;
	double lado2 = 0.0d;
	// TODO process result here
	double result = port.triangulo(lado1, lado2);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
