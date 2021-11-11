/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.*;


/**
 *
 * @author Margarita
 */
@WebServlet(name = "muestraCompraVenta", urlPatterns = {"/muestraCompraVenta"})
public class muestraCompraVenta extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        PrintWriter out = response.getWriter();

        try {
            ArrayList <CompraVentaCrud> compraventa = new ArrayList<CompraVentaCrud>();
            CompraVentaCrud compraventaQ;

            CompraVentaCrud objcompraventacrud = new CompraVentaCrud();
            compraventa = objcompraventacrud.listarCompraVentaN();
            if (compraventa != null){
                request.setAttribute("CompraVenta",compraventa);
                request.getRequestDispatcher("/listacompraventa.jsp").forward(request, response);
            }else
            request.getRequestDispatcher("/noHayRegistros.jsp").forward(request, response);
        } finally {
            out.close();
        }
    }
}
    

