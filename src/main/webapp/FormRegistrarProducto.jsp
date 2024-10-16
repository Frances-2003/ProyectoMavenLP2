<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Producto</title>
</head>
<body bgcolor="#c5dec9">
<h1 align="center" >Registrar Producto</h1>
<table border="2" align="center">
<form action="ControladorProducto" method="post">
<tr>
<td>Nombre de Producto
</td>
<td>
<input type="text" name="nombreproducto">
</td>
</tr>
<tr>
<td>Precio de Producto
</td>
<td>
<input type="text" name="precioproducto">
</td>
</tr>
<tr>
<td>Cantidad de Producto
</td>
<td>
<input type="text" name="cantproducto">
</td>
</tr>
<tr>
<td>Total de Producto
</td>
<td>
<input type="text" name="totalproducto">
</td>
</tr>
<tr>
<td>Cod. Barras de Producto
</td>
<td>
<input type="text" name="codbarrasproducto">
</td>
</tr>
<tr>
<td>Numero Lote de Producto
</td>
<td>
<input type="text" name="nroloteproducto">
</td>
</tr>
<tr>
<td>Fecha de Vencimiento de Producto
</td>
<td>
<input type="text" name="fechavenproducto">
</td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" name="Registrar producto">
</td>
</tr>
</form>
</table>	

</body>
</html>