/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Basic.Aluno;
import Dao.AlunoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Authenticator;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author logon
 */
public class sAluno extends HttpServlet {

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
            //recuperar informação que iremos submeter
            String acao = request.getParameter("btnAcao");
            
            String rgm = request.getParameter("rgm");
            String nome = request.getParameter("nome");
            
            float nota1 = 0f;
            if(!request.getParameter("nota1").equals(""))
                nota1 = Float.parseFloat(request.getParameter("nota1"));
            
            float nota2 = 0f;
            if(!request.getParameter("nota2").equals(""))
                nota2 = Float.parseFloat(request.getParameter("nota2"));
            
            
            Aluno aluno = new Aluno();
            aluno.setRgm(rgm);;
            aluno.setNome(nome);
            aluno.setNota1(nota1);
            aluno.setNota2(nota2);
            
            AlunoDAO alunoBanco = new AlunoDAO();
            String retorno = "";
            Aluno ret = new Aluno();
            if(acao.equals("Gravar"))
            {
                retorno = alunoBanco.inserirAluno(aluno);
            }else if(acao.equals("Alterar")){
                retorno = alunoBanco.alterarAluno(aluno);
            }else if(acao.equals("Excluir")){
                retorno = alunoBanco.excluirAluno(aluno);
            }else{
                ret = alunoBanco.selecionarAluno(rgm);
            }
            
            response.sendRedirect("index.jsp?resp=" + retorno + "&pesq=" + ret);
            
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
