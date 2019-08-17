package calculadora;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calc extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        float v1, v2, resultado=0;
        String operacao;
        try {
            out.println("<HTML>");
            out.println("<HEAD>");
            out.println("<TITLE>");
            out.println("Exercício de Calculadora - Resultado");
            out.println("</TITLE>");
            out.println("</HEAD>");
            out.println("<BODY");
            out.println("<BR>");

            v1 = Float.parseFloat(request.getParameter("valor1"));
            v2 = Float.parseFloat(request.getParameter("valor2"));
            operacao = request.getParameter("operacao");

            if (operacao.equals("somar")) {
                resultado = v1 + v2;
            } else if (operacao.equals("subtrair")) {
                resultado = v1 - v2;
            } else if (operacao.equals("dividir")) {
                resultado = v1 / v2;
            } else if (operacao.equals("multiplicar")) {
                resultado = v1 * v2;
            }
            
            out.println("<h1>O resultado da " + operacao + " é " + resultado + "</h1>");

            out.println("<input type='button' name='btnvoltar' value='Voltar' onClick='javascript:history.back(1)'>");
            out.println("</BODY>");
            out.println("</HTML>");
        } catch (ArithmeticException e) {
            out.println("<html><head><title>Resultado da Calculadora");
            out.println("</title></head>");
            out.println("<body>");
            out.println("<p>Divisão não pode ser por zero");
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
