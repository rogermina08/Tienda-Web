/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import Modelo.*;

/**
 *
 * @author Margarita
 */
@WebServlet(name = "pedido", urlPatterns = {"/pedido"})
public class pedido extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Pedido_crud pedcrud = new Pedido_crud();
		
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            float cantidad = Float.parseFloat(request.getParameter("cantidad"));
            double valorunitario = Double.parseDouble(request.getParameter("valorunitario"));
            int productosel = Integer.parseInt(request.getParameter("productosel"));
            int proveedorsel = Integer.parseInt(request.getParameter("proveedorsel"));

            System.out.println("cantidad" + cantidad);
            System.out.println("vrunitario" + valorunitario);
            System.out.println("productosel" + productosel);
            System.out.println("proveedorsel" + proveedorsel);

            pedcrud.insertarPedido(100, productosel, proveedorsel, cantidad, valorunitario);
            
            ArrayList <Pedido> pedidosrep = new ArrayList<Pedido>();
            Pedido pedido;

            Pedido objpedido = new Pedido();
            pedidosrep = objpedido.leerPedidoN();
            if (pedidosrep != null){
                request.setAttribute("Pedidosrep",pedidosrep);
                request.getRequestDispatcher("/listapedido.jsp").forward(request, response);
            }else
                request.getRequestDispatcher("/noHayRegistros.jsp").forward(request, response);

            //request.getRequestDispatcher("/pedido.jsp").forward(request, response);            

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
