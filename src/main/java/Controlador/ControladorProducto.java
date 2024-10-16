package Controlador;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DaoImp.TblProductoImp;
import model.TblProducto;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    } //fin del constructor..........

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//redireccionar al Jsp
		request.getRequestDispatcher("/FormRegistrarProducto.jsp").forward(request, response);
	} // fin del metodo doget...........

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//recuperamos valores del formulario
		String nomprod=request.getParameter("nombreproducto");
		double prepro=Double.parseDouble(request.getParameter("precioproducto"));
		double cantipro=Double.parseDouble(request.getParameter("cantproducto"));
		double total=prepro*cantipro;
		String codbarras=request.getParameter("codbarrasproducto");
		String nrolote=request.getParameter("nroloteproducto");
		String fecha=request.getParameter("fechavenproducto");
		Date fech=new Date();
		Date fechasql=new Date(fech.getTime());
		//instaciamos las respectivas clases 
		TblProducto tblproducto=new TblProducto();
		TblProductoImp tblproimp=new TblProductoImp();
		//asignar los valores
		tblproducto.setNompro(nomprod);
		tblproducto.setPrecio(prepro);
		tblproducto.setCantidad(cantipro);
		tblproducto.setTotal(total);
		tblproducto.setCodbarras(codbarras);
		tblproducto.setNrolote(nrolote);
		tblproducto.setFechaven(fechasql);
		
		//invocamos el metodo registrar
		tblproimp.RegistrarProducto(tblproducto);
		//recuperamos el listado
		List<TblProducto>listado=tblproimp.ListarProducto();
		//mandamos a la vista
		request.setAttribute("listado", listado);
		//redireccionamos
		
		request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);
		
		
	} //fin del metodo dopost.........

}
