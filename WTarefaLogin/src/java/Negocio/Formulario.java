/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Basic.Alunos;
import Basic.Disciplinas;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alexander
 */
public class Formulario extends HttpServlet {

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

            
            String opcao, nome, apelido, professor;
            int idade, indice;
           
            Inserir inserir = new Inserir();

            opcao = request.getParameter("opcao");
            if(opcao.equals("aluno")){
                Alunos aluno = new Alunos();
                
                nome = request.getParameter("nome_aluno");
                apelido = request.getParameter("apelido");
                idade = Integer.parseInt(request.getParameter("idade"));    
                aluno = inserir.InserirAlunos(nome, apelido, idade);
                Global.alunos.add(aluno);
            }
            else if(opcao.equals("disciplina")){
                Disciplinas disciplinas = new Disciplinas();
                
                nome = request.getParameter("nome_disciplina");
                professor = request.getParameter("professor");
                disciplinas = inserir.InserirDisciplinas(nome, professor);
                Global.disciplinas.add(disciplinas);
            }
            else if(opcao.equals("excluir_aluno")){
                indice = Integer.parseInt(request.getParameter("indice"));
                Global.alunos.remove(indice);
            }
            else if(opcao.equals("excluir_disc")){
                indice = Integer.parseInt(request.getParameter("indice"));
                Global.disciplinas.remove(indice);
            }
            
            /*
            if(opcao.equals("excluir")){
                
            }
            */
            response.sendRedirect("sistema.jsp");
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
