/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
@WebServlet(urlPatterns = {"/servlet"})
public class servlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            String resu;
            String respondido;
            /* TODO output your page here. You may use following sample code. */
            if(request.getParameter("1") != null){
                respondido = request.getParameter("1");
                out.print("Entró aquí");
                if("1a".equals(respondido)){
                    resu = "mal, no es inciso a";
                    response.sendRedirect("indexJSP.jsp?resultado1="+resu);
                    out.print("Entró aquí a");
                }
                else{
                    if("1b".equals(respondido)){
                        resu = "mal, no es inciso b";
                        response.sendRedirect("indexJSP.jsp?resultado1="+resu);
                        out.print("Entró aquí b");
                    }
                    else{
                        if("1c".equals(respondido)){
                            resu = "bien";
                            response.sendRedirect("indexJSP.jsp?resultado1="+resu);
                            out.print("Entró aquí c");
                        }
                        else{
                            if("1d".equals(respondido)){
                                resu = "mal, no es inciso d";
                                response.sendRedirect("indexJSP.jsp?resultado1="+resu);
                                out.print("Entró aquí d");
                            }
                        }
                    }
                }
            }
            else{
                resu = "No respondiste nada.";
                response.sendRedirect("indexJSP.jsp?resultado1="+resu);
            }
            
            respondido = request.getParameter("2");
            switch(respondido){
                case "2a":
                     resu = "bien";
                    response.sendRedirect("indexJSP.jsp?resultado2="+resu);
                    break;
                case "2b":
                     resu = "mal";
                    response.sendRedirect("indexJSP.jsp?resultado2="+resu);
                    break;
                    case "2c":
                     resu = "mal";
                    response.sendRedirect("indexJSP.jsp?resultado2="+resu);
                    break;
                    case "2d":
                     resu = "mal";
                    response.sendRedirect("indexJSP.jsp?resultado2="+resu);
                    break;
                    default: 
                        resu ="Te valió vrg" ;
                        response.sendRedirect("indexJSP.jsp?resultado2="+resu);
            }
            
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
