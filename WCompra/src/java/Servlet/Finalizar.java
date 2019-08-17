/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author logonaf
 */
public class Finalizar extends HttpServlet {

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
        float valortotal = 0;
        int total_ac = 0;
        String nome,cpf,end,tel,ex,elx,master,ac = "",i1 = "0",i2 = "0" ,i3 = "0", valor_mod = "", valor_porta = "R$ 0.00";

        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            nome = request.getParameter("nome");
            cpf = request.getParameter("cpf");
            end = request.getParameter("endereco");
            tel = request.getParameter("telefone");
            i1 = request.getParameter("ar");
            i2 = request.getParameter("direcao");
            i3 = request.getParameter("ve_te");
            ex = "ex";
            elx = "elx";
            master = "master";
           if(request.getParameter("modelo").equals(ex)){
               valortotal += 10000.00;
               valor_mod = "R$ 10000.00";
           }else if(request.getParameter("modelo").equals(elx)){
               valortotal += 20000.00;
               valor_mod = "R$ 20000.00";
           }else if(request.getParameter("modelo").equals(master)){
               valortotal += 30000.00;
               valor_mod = "R$ 30000.00";
           }
                
           if(request.getParameter("portas").equals("4")){
                 valortotal += 4000.00;
                 valor_porta = "R$ 4000.00";
           }
           if(i1!=null && i1!="0"){
               valortotal += 3000.00;
               total_ac++;
               ac = "<tr><td style=\"padding-left: 40px\">- Ar Condicionado:</td><td>R$ 3000.00</td></tr>";
           }
           if(i2!=null && i2!="0"){
               valortotal += 2000.00;
               total_ac++;
               ac += "<tr><td style=\"padding-left: 40px\">- Direção:</td><td>R$ 2000.00</td></tr>";
           }
             if(i3!=null && i3!="0"){
               valortotal += 1000.00;
               total_ac++;
               ac += "<tr><td style=\"padding-left: 40px\">- VE / TE:</td><td>R$ 1000.00</td></tr>";
           }
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>");
            out.println("Exercício Carro");
            out.println("</title>");
            out.println("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">");
            out.println("<script src=\"js/bootstrap.min.js\"></script>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"container\">"
                    + "<div class=\"form-group\">"
                    + "<div class=\"col-sm-12\">"
                    + "<table class=\"table-bordered\" width=\"80%\">");
            out.println("<tr><th style=\"background:#000; color: #fff;\">Dados do Comprador</th></tr>"
                    + "<tr><td><b>Nome:</b> "+nome+"</td></tr>"
                    + "<tr><td><b>CPF:</b> "+cpf+"</td></tr>"
                    + "<tr><td><b>Endereço:</b> "+end+"</td></tr>"
                    + "<tr><td><b>Telefone:</b> "+tel+"</td></tr>"
                    + "</table>");
            
            out.println("<table class=\"table-bordered\" style=\"margin-top: 20px\" width=\"80%\">"
                    + "<tr><th style=\"background:#000; color: #fff;\">Dados do Carro</th><th style=\"background:#000; color: #fff;\">Valor</th></tr>"
                    + "<tr><td><b>Modelo:</b> "+request.getParameter("modelo")+"</td><td>"+valor_mod+"</td></tr>"
                    + "<tr><td><b>Portas:</b> "+request.getParameter("portas")+"</td><td>"+valor_porta+"</td></tr>"
                    + "<tr><td colspan=\"2\"><b>Acessórios:</b> "+total_ac+"</td></tr>");
                    if(total_ac > 0){
                        out.println(ac);
                    }       
            out.println("<tr><th style=\"background:#000; color: #fff;\">Total</th><th style=\"background:#000; color: #fff;\">R$ "+valortotal+"</th></tr>"
                    + "</table>");
            
            out.println("<button class='btn btn-danger m-b-1' style=\"margin-top: 30px\" name='btnvoltar' onClick='javascript:history.back(1)'>Voltar</button>");
            
            out.println("</body>");
            out.println("</html>");
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
       // processRequest(request, response);
       response.sendRedirect("Compra.html");
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
