package eletrodomestico;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ComprarProduto extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        float resultado=0;
        int q1, q2, q3, q4, q5, q6, q7, q8, q9;
        String i1="0" , i2="0", i3="0", i4="0", i5="0", i6="0", i7="0", i8="0", i9 = "0"; 

        try {
            q1 = Integer.parseInt(request.getParameter("quant1"));
            q2 = Integer.parseInt(request.getParameter("quant2"));
            q3 = Integer.parseInt(request.getParameter("quant3"));
            q4 = Integer.parseInt(request.getParameter("quant4"));
            q5 = Integer.parseInt(request.getParameter("quant5"));
            q6 = Integer.parseInt(request.getParameter("quant6"));
            q7 = Integer.parseInt(request.getParameter("quant7"));
            q8 = Integer.parseInt(request.getParameter("quant8"));
            q9 = Integer.parseInt(request.getParameter("quant9"));
            
            i1 = request.getParameter("item1");
            i2 = request.getParameter("item2");
            i3 = request.getParameter("item3");
            i4 = request.getParameter("item4");
            i5 = request.getParameter("item5");
            i6 = request.getParameter("item6");
            i7 = request.getParameter("item7");
            i8 = request.getParameter("item8");
            i9 = request.getParameter("item9");
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>");
            out.println("Exercício - Compra de Eletrodomésticos");
            out.println("</title>");
            out.println("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">");
            out.println("<script src=\"js/bootstrap.min.js\"></script>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"container\">"
                    + "<div class=\"form-group\">"
                    + "<div class=\"col-sm-12\">"
                    + "<table class=\"table-bordered\" width=\"80%\">");
            out.println("<tr><th style=\"background:#000; color: #fff;\">Produto</th>"
                    + "<th style=\"background:#000; color: #fff;\">Quantidade</th>"
                    + "<th style=\"background:#000; color: #fff;\">Valor Unit.</th>"
                    + "<th style=\"background:#000; color: #fff;\">Valor Total</th></tr>");
            
            if(i1 != "0" && i1 != null){
                out.println("<tr>"
                        + "<td>Fogão Consul 6 Bocas Erva Doce CF376B</td>"
                        + "<td>"+q1+"</td>"
                        + "<td>R$ 549,90</td>"
                        + "<td>R$ "+q1*549.90+"</td>"
                        + "</tr>");
                resultado += q1 * 549.90;
            }
            if(i2 != "0" && i2 != null){
                out.println("<tr><td>Fogão Consul 6 Bocas Clean BF076B</td>"
                        + "<td>"+q2+"</td>"
                        + "<td>R$ 999,90</td>"
                        + "<td>R$ "+q2*999.90+"</td>"
                        + "</tr>");  
                resultado += q2 * 999.90;
            }
            if(i3 != "0" && i3 != null){
                out.println("<tr><td>Fogão Electrolux 5 Bocas Celebrate Digital 76SRB com Timer</td>"
                        + "<td>"+q3+"</td>"
                        + "<td>R$ 1.199,90</td>"
                        + "<td>R$ "+q3*1199.90+"</td>"
                        + "</tr>");  
                resultado += q3 * 1199.90;
            }
            if(i4 != "0" && i4 != null){
                out.println("<tr><td>Refrigerador Brastemp Front Free Duplex Active! BRM50NB c/ Controle Eletrônico - 429L</td>"
                        + "<td>"+q4+"</td>"
                        + "<td>R$ 2.299,90</td>"
                        + "<td>R$ "+q4*2299.90+"</td>"
                        + "</tr>");  
                resultado += q4 * 2299.90;
            }
            if(i5 != "0" && i5 != null){
                out.println("<tr><td>Refrigerador Consul Frost Free Duplex CRM33EB - 263L</td>"
                        + "<td>"+q5+"</td>"
                        + "<td>R$ 1.099,90</td>"
                        + "<td>R$ "+q5*1099.90+"</td>"
                        + "</tr>"); 
                resultado += q5 * 1099.90;
            }
            if(i6 != "0" && i6 != null){
                out.println("<tr><td>Refrigerador Electrolux Duplex DC50X c/ Dispenser de água - 462L - Inox</td>"
                        + "<td>"+q6+"</td>"
                        + "<td>R$ 1.849,90</td>"
                        + "<td>R$ "+q6*1849.90+"</td>"
                        + "</tr>");  
                resultado += q6 * 1849.90;
            }
            if(i7 != "0" && i7 != null){
                out.println("<tr><td>Lavadora de Roupas Brastemp 11 Kg Ative! BWL11A</td>"
                        + "<td>"+q7+"</td>"
                        + "<td>R$ 1.295,90</td>"
                        + "<td>R$ "+q7*1295.90+"</td>"
                        + "</tr>");  
                resultado += q7 * 1295.90;
            }
            if(i8 != "0" && i8 != null){
                out.println("<tr><td>Lavadora de Roupas Electrolux 12 Kg Turbo Economia LTE12</td>"
                        + "<td>"+q8+"</td>"
                        + "<td>R$ 1.099,90</td>"
                        + "<td>R$ "+q8*1099.90+"</td>"
                        + "</tr>");  
                resultado += q8 * 1099.90;
            }
            if(i9 != "0" && i9 != null){
                out.println("<tr><td>Lavadora de Roupas Electrolux 15 Kg Blue Touch LBU15 com Ultra Clean</td>"
                        + "<td>"+q9+"</td>"
                        + "<td>R$ 1.099,90</td>"
                        + "<td>R$ "+q9*1099.90+"</td>"
                        + "</tr>"); 
                resultado += q9 * 1099.90;
            }

            out.println("<tr><th colspan=\"3\" style=\"background:#000; color: #fff;\">Total</th>"
                    + "<th style=\"background:#000; color: #fff;\">R$ "+resultado+"</th></tr>");
            out.println("</table>"
                    + "</div>"
                    + "</div>"
                    + "<div class=\"form-group\">"
                    + "<div class=\"col-sm-12\">");
            out.println("<button class='btn btn-danger m-b-1' name='btnvoltar' onClick='javascript:history.back(1)'>Voltar</button>"
                    + "</div>"
                    + "</div>"
                    + "</div>");
            out.println("</body>");
            out.println("</html>");
        } catch (ArithmeticException e) {
            out.println("<html><head><title>ERRO");
            out.println("</title></head>");
            out.println("<body>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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
