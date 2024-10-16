<%@page import="model.TblProducto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu Principal</title>
</head>
<body bgcolor="#c5dec9">

<h1  align="center">
Sistema web de Inventario 2024
</h1>


<h2 align="center">
<a href="ControladorProducto">
Registrar Producto
</a>
</h2>


<h2 align="center"> Listado de Productos</h2>
<table border="2" align="center">
<th>
Codigo
</th>
<th>
Nombre
</th>
<th>
Precio
</th>
<th>
Cantidad
</th>
<th>
Total
</th>
<th>
Codigo de Barras
</th>
<th>
Nro de Lote
</th>
<th>
Fecha de Vencimiento
</th>
<th>Acciones</th>

<%
List<TblProducto> listadoproducto=(List<TblProducto>)request.getAttribute("listado");
//aplicamos unas condiciones
if(listadoproducto!=null){
	//aplicamos bucle
	for(TblProducto lis:listadoproducto){
		
	
%>
<tr>
<td>
<%=lis.getIdproducto()%>
</td>
<td>
<%=lis.getNompro() %>
</td>
<td>
<%=lis.getCantidad() %>
</td>
<td>
<%=lis.getTotal() %>
</td>
<td>
<%=lis.getCodbarras() %>
</td>
<td>
<%=lis.getNrolote() %>
</td>
<td>
<%=lis.getFechaven() %>
</td>
<td>
<a href="ControladorProducto?accion=Eliminar&cod=<%=lis.getIdproducto()%>">Eliminar</a>
<a href="ControladorProducto?accion=Actualizar&cod=<%=lis.getIdproducto()%>">Actualizar</a>
</td>
</tr>
<%}%>
<%}%>
</table>

</body>
</html>