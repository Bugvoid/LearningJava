 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import Classes.*;
import DAO.CaixaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sun.font.Script;

/**
 *
 * @author Luan.Castro
 */
public class sModuloCaixa extends HttpServlet {

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
            String acao = request.getParameter("btnAcao");
            
                //AlterarSubCategoria
            if(acao.equals("alterarsubcategoria")){
                int indice;
                indice = Integer.parseInt(request.getParameter("indice"));
                
                String descri = request.getParameter("descricao");
                SubCategorizacao catego = new SubCategorizacao();
                catego.setDescricao(descri);
                
                CaixaDAO caixaDAO = new CaixaDAO();
                String retorno = "Nao entrou";
            
                retorno = caixaDAO.alterarSubcatego(catego, indice);
            
            
            response.sendRedirect("Caixa/planodecontas.jsp?sucesso=" + retorno);
            
            }  
            
            //AlterarCategoria
            if(acao.equals("alterarcategoria")){
                int indice;
                indice = Integer.parseInt(request.getParameter("indice"));
                
                String descri = request.getParameter("descricao");
                Categorizacao catego = new Categorizacao();
                catego.setDescricao(descri);
                
                CaixaDAO caixaDAO = new CaixaDAO();
                String retorno = "Nao entrou";
            
                retorno = caixaDAO.alterarCatego(catego, indice);
            
            
            response.sendRedirect("Caixa/planodecontas.jsp?sucesso=" + retorno);
            
            }    
            
             //AlterarContaEmpresarial
            if(acao.equals("alterarconta")){
                int indice;
                indice = Integer.parseInt(request.getParameter("indice"));
                
                String descri = request.getParameter("descricao");
                float valor = 0f;
                valor = Float.parseFloat(request.getParameter("valor"));
            
                ContasEmpresarias ct = new ContasEmpresarias();
                ct.setDescricao(descri);
                ct.setValorinicial(valor);
                
                
                CaixaDAO caixaDAO = new CaixaDAO();
                String retorno = "Nao entrou";
            
                retorno = caixaDAO.alterarContaEMP(ct, indice);
            
            
            response.sendRedirect("Caixa/planodecontas.jsp?sucesso=" + retorno);
            
            }
            
            //ExcluirContaEmpresarial
            if(acao.equals("excluir_conta")){
                int indice;
                indice = Integer.parseInt(request.getParameter("indice"));
                
                CaixaDAO caixaDAO = new CaixaDAO();
                String retorno = "Nao entrou";
            
                retorno = caixaDAO.excluirContaEMP(indice);
            
            
            response.sendRedirect("Caixa/planodecontas.jsp?sucesso=" + retorno);
            
            }
            //ExcluirCategoria
            if(acao.equals("excluir_categoria")){
                int indice;
                indice = Integer.parseInt(request.getParameter("indice"));
                
                CaixaDAO caixaDAO = new CaixaDAO();
                String retorno = "Nao entrou";
            
                retorno = caixaDAO.excluirCategoria(indice);
            
            
            response.sendRedirect("Caixa/planodecontas.jsp?sucesso=" + retorno);
            
            }
            
             //ExcluirSubCategoria
            if(acao.equals("excluir_subcategoria")){
                int indice;
                indice = Integer.parseInt(request.getParameter("indice"));
                
                CaixaDAO caixaDAO = new CaixaDAO();
                String retorno = "Nao entrou";
            
                retorno = caixaDAO.excluirSubCategoria(indice);
            
            
            response.sendRedirect("Caixa/planodecontas.jsp?sucesso=" + retorno);
            
            }
            
            //Devolução
                if(acao.equals("devolucao")){
                int descri = Integer.parseInt(request.getParameter("descricao"));
                float valor = 0f;
                valor = Float.parseFloat(request.getParameter("valor"));
            
                Devolucao devu = new Devolucao();
                devu.setNotaDevolucao(descri);
                devu.setValorDevolvido(valor);
            
                CaixaDAO devuBanco = new CaixaDAO();
                String retorno = "Nao entrou";
            
                retorno = devuBanco.inserirDevolucao(devu);
            
            
            response.sendRedirect("Caixa/devolucao.jsp?sucesso=" + retorno);
            }
            
            
            //ConsultarVenda
            if(acao.equals("consulta")){
                int codvenda = Integer.parseInt(request.getParameter("codvenda"));
                
                CaixaDAO caixaBanco = new CaixaDAO();
                Pedido pedi = new Pedido();
                Pedido retorno = caixaBanco.selecionarpedido(codvenda);
                
                response.sendRedirect("Caixa/operacoes.jsp?resp=" + retorno.getValorTotalPedido() + "&resp2=" + retorno.getForma_pagamento() + "&resp3=" + codvenda);
            }
            
            
            
            //ContaEmpresarial
                if(acao.equals("inserirConta")){
                String descri = request.getParameter("descricao");
                float valor = 0f;
                valor = Float.parseFloat(request.getParameter("valor"));
            
                ContasEmpresarias ct = new ContasEmpresarias();
                ct.setDescricao(descri);
                ct.setValorinicial(valor);
            
            CaixaDAO alunoBanco = new CaixaDAO();
            String retorno = "Nao entrou";
            
                retorno = alunoBanco.inserirContaEmp(ct);
            
            
            response.sendRedirect("Caixa/planodecontas.jsp?resp=" + retorno);
            }
            
                //Categorização
                if(acao.equals("inserirCatego")){
                String descri = request.getParameter("descricao");
                Categorizacao catego = new Categorizacao();
                catego.setDescricao(descri);
               
            
            CaixaDAO alunoBanco = new CaixaDAO();
            String retorno = "Nao entrou";
            
                retorno = alunoBanco.inserirCategoria(catego);
            
            
            response.sendRedirect("Caixa/planodecontas.jsp?resp=" + retorno);
            }
                
                //SubCategorização
                if(acao.equals("inserirSubCatego")){
                String descri = request.getParameter("descricao");
                int tipoCatego = Integer.parseInt(request.getParameter("opc")) ;
                
                SubCategorizacao subcatego =  new SubCategorizacao();
                subcatego.setDescricao(descri);
                subcatego.setCategorizacao_idCategorizacao(tipoCatego);
                
               
            
            CaixaDAO alunoBanco = new CaixaDAO();
            String retorno = "Nao entrou";
            
                retorno = alunoBanco.inserirSubcategoria(subcatego);
            
            
            response.sendRedirect("Caixa/planodecontas.jsp?resp=" + retorno);
            }
              
                //Pagamento
                if(acao.equals("pagamento")){
                    
                    
                String valor = request.getParameter("valorrecebido");
                OperacoesCaixa opera = new OperacoesCaixa();
                opera.setValor(Float.parseFloat(valor));
                
               
            
            CaixaDAO alunoBanco = new CaixaDAO();
            String retorno = "Nao entrou";
            
                retorno = alunoBanco.finalizaropera(opera);
            
            
            response.sendRedirect("Caixa/operacoes.jsp?sucesso=" + retorno);
            }
                
              //Suprimento
                if(acao.equals("suprimento")){
                    
                    
                String valor = request.getParameter("valor");
                Suprimento supri = new Suprimento();
                supri.setValor(Float.parseFloat(valor));
                
               
            
            CaixaDAO supriBanco = new CaixaDAO();
            String retorno = "Nao entrou";
            
                retorno = supriBanco.inserirSuprimento(supri);
            
            
            response.sendRedirect("Caixa/suprimento.jsp?sucesso=" + retorno);
            }  
               //Sangria
                if(acao.equals("sangria")){
                    
                    
                String valor = request.getParameter("valor");
                Sangria sangri = new Sangria();
                sangri.setValor(Float.parseFloat(valor));
                
               
            
            CaixaDAO sangriBanco = new CaixaDAO();
            String retorno = "Nao entrou";
            
                retorno = sangriBanco.inserirSangria(sangri);
            
            
            response.sendRedirect("Caixa/sangria.jsp?sucesso=" + retorno);
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
