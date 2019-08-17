<%-- 
    Document   : planodecontas
    Created on : 28/09/2018, 16:00:34
    Author     : Luan.Castro
--%>

<%@page import="Classes.*"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.CaixaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>


<head>
    <meta charset="utf-8">
    <title>Caixa - Plano de Contas</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/all.css">
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.dataTables.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/dataTables.bootstrap4.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/scripts.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" ></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" ></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" ></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="author" content="Grupo 3 - Caixa" />

    <link rel="shortcut icon" type="image/x-icon" href="favicon.ico" />
    <script>
        function excluir(indice, tipo){
                if(tipo == 'conta'){
            var r = confirm("Tem certeza?");
                        if (r == true) {
                            $('#opcao_conta').val('excluir_conta');
                            $('#indice_conta').val(indice);
                            document.frm_conta.submit();
                        }else {}
                }
                else if(tipo == 'categoria'){
                     var r = confirm("Tem certeza?");
                        if (r == true) {
                    $('#opcao_categoria').val('excluir_categoria');
                    $('#indice_categoria').val(indice);
                    document.frm_categoria.submit();
                    }else{}
                }else{
                     var r = confirm("Tem certeza?");
                        if (r == true) {
                    $('#opcao_subcategoria').val('excluir_subcategoria');
                    $('#indice_subcategoria').val(indice);
                    document.frm_subcategoria.submit();
                    }else{}
                }
            }
        function alterar(indice,tipo){
                if(tipo == 'conta'){
                    var r = confirm("Tem certeza?");
                        if (r == true) {
                    $('#opcao_conta1').val('alterar_conta');
                    $('#indice_conta1').val(indice);
                    $("#ModalConta1").modal();
                     }else{}
                }
                else if(tipo == 'categoria'){
                    var r = confirm("Tem certeza?");
                        if (r == true) {
                    $('#opcao_categoria1').val('alterar_categoria');
                    $('#indice_categoria1').val(indice);
                    $("#ModalCategoria1").modal();
                    }else{}
                }else{
                    var r = confirm("Tem certeza?");
                        if (r == true) {
                    $('#opcao_subcategoria1').val('alterarsubcategoria');
                    $('#indicesubcategoria1').val(indice);
                    $("#ModalSubCategoria1").modal();
                    }else{}
                }
            }
        
        
    </script>
</head>

<body>

    <header>

         <%@include file="../include/logotipo.jsp" %>
        <%@include file="../include/navegacao.jsp" %>
        <style>
            form{
                font-size: 15pt;
                
            }
            
        </style>
    </header>

    <%@include file="../include/menu.jsp"%>
    <div class="cont">
    <button class="btn btn-primary btn-lg" type="button" style="height: 50px; font-size: 15pt;" data-toggle="collapse" data-target="#collapseExample" aria-expanded="false" aria-controls="collapseExample" >
    Contas Empresariais
    </button>
    <button class="btn btn-primary btn-lg" type="button" style="height: 50px; font-size: 15pt;" data-toggle="collapse" data-target="#categorizacao" aria-expanded="false" aria-controls="collapseExample">
    Categorização
    </button>
    <button class="btn btn-primary btn-lg" type="button" style="height: 50px; font-size: 15pt;" data-toggle="collapse" data-target="#subcategoria" aria-expanded="false" aria-controls="collapseExample">
    Sub Categorização
    </button>
        <div class="collapse" id="collapseExample">
  <div class="card card-body">
            
      <form name="frm_conta" action="../sModuloCaixa" method="post" onsubmit="">
          <input type="hidden" name="btnAcao" id="opcao_conta" value="excluir_conta">    
          <input type="hidden" name="indice" id="indice_conta">    
              <div class="table-wrapper-scroll-y">

                        <table class="table table-bordered table-sm">
                          <thead>
                            <tr>
                              <th  scope="col">Cod</th>
                              <th scope="col">Conta Empresarial</th>
                              <th scope="col">Saldo inicial</th>
                              <th scope="col">Alterar</th>
                              <th scope="col">Excluir</th>
                            </tr>
                          </thead>
                          <tbody>
                            <%
                    CaixaDAO caixaDao = new CaixaDAO();
                    ArrayList<ContasEmpresarias> listaResultado = caixaDao.getContaEmpresariais();
                        for(int i=0; i<listaResultado.size();i++){
                    out.println("<th scope='row' >" + listaResultado.get(i).getIdContaE() + "</th>");
                    out.println("<td>" + listaResultado.get(i).getDescricao()+ "</td>");
                    out.println("<td>" + listaResultado.get(i).getValorinicial()+ "</td>");
                    out.println("<td><button name='btnAcao' value='AlterarConta' type='button' onclick=\"alterar("+(listaResultado.get(i).getIdContaE())+", 'conta')\" class='btn btn-warning btn-block'><i class='fas fa-edit fas fa-2x'></i></button> </td>");
                    out.println("<td><button name='btnAcao' value='ExcluirConta' type='button' onclick=\"excluir("+(listaResultado.get(i).getIdContaE())+", 'conta')\" class='btn btn-danger btn-block'><i class='fas fa-trash-alt fas fa-2x'></i></button> </td>");
                    out.println("</tr>");
                }
            %>
                          </tbody>
                        </table>

                      </div>
          <button name="btnAcao" type="button" class="btn btn-success" data-toggle="modal" data-target="#ModalConta" style="height: 50px; font-size: 15pt;">Cadastrar</button>
      
      </form>
  
  </div>
        </div>
        <div class="collapse" id="categorizacao">
  <div class="card card-body">
      <form name="frm_categoria" action="../sModuloCaixa" method="post" onsubmit="">
          <input type="hidden" name="btnAcao" id="opcao_categoria" value="excluir_categoria">    
          <input type="hidden" name="indice" id="indice_categoria">
                          <div class="table-wrapper-scroll-y">

                                    <table class="table table-bordered table-sm">
                                      <thead>
                                        <tr>
                                          <th scope="col">Cod</th>
                                          <th scope="col">Categoria</th>
                                          <th scope="col">Alterar</th>
                                          <th scope="col">Excluir</th>
                                        </tr>
                                      </thead>
                                      <tbody>
                                        <%
                    
                    ArrayList<Categorizacao> listaResultado1 = caixaDao.getCategoria();
                        for(int i=0; i<listaResultado1.size();i++){
                    out.println("<th scope='row' >" + listaResultado1.get(i).getIdCategorizacao()+ "</th>");
                    out.println("<td>" + listaResultado1.get(i).getDescricao()+ "</td>");
                    out.println("<td><button name='btnAcao' value='AlterarCategoria' type='button' onclick=\"alterar("+(listaResultado1.get(i).getIdCategorizacao())+", 'categoria')\" class='btn btn-warning btn-block'><i class='fas fa-edit fas fa-2x'></i></button> </td>");
                    out.println("<td><button name='btnAcao' value='ExcluirCategoria' type='button' onclick=\"excluir("+(listaResultado1.get(i).getIdCategorizacao())+", 'categoria')\" class='btn btn-danger btn-block'><i class='fas fa-trash-alt fas fa-2x'></i></button> </td>");
                    out.println("</tr>");
                }
            %>
                                      </tbody>
                                    </table>

                                  </div>
                <button name="btnAcao" type="button" class="btn btn-success" data-toggle="modal" data-target="#ModalCatego" style="height: 50px; font-size: 15pt;">Cadastrar</button>

                  </form>
        </div>
  </div>
        <div class="collapse" id="subcategoria">
  <div class="card card-body">
            <form name="frm_subcategoria" action="../sModuloCaixa" method="post" onsubmit="">
                <input type="hidden" name="btnAcao" id="opcao_subcategoria" value="excluir_subcategoria">    
                <input type="hidden" name="indice" id="indice_subcategoria">
              <div class="table-wrapper-scroll-y">

                        <table class="table table-bordered table-sm">
                          <thead>
                            <tr>
                              <th scope="col">Cod</th>
                              <th scope="col">Sub-Categoria</th>
                              <th scope="col">Categoria</th>
                              <th scope="col">Alterar</th>
                              <th scope="col">Excluir</th>
                            </tr>
                          </thead>
                          <tbody>
                            <tr>
                              <%
                    ArrayList<SubCategorizacao> listaResultado2 = caixaDao.getSubCategoria();
                        for(int i=0; i<listaResultado2.size();i++){
                    out.println("<th scope='row' >" + listaResultado2.get(i).getIdsupcategorizacao()+ "</th>");
                    out.println("<td>" + listaResultado2.get(i).getDescricao()+ "</td>");
                    out.println("<td>" + listaResultado2.get(i).getCategorizacao()+ "</td>");
                    out.println("<td><button name='btnAcao' value='AlterarSubCategoria' type='button' onclick=\"alterar("+(listaResultado2.get(i).getIdsupcategorizacao())+", 'subcategoria')\" class='btn btn-warning btn-block'><i class='fas fa-edit fas fa-2x'></i></button> </td>");
                    out.println("<td><button name='btnAcao' value='ExcluirSubCategoria' type='button' onclick=\"excluir("+(listaResultado2.get(i).getIdsupcategorizacao())+", 'subcategoria')\" class='btn btn-danger btn-block'><i class='fas fa-trash-alt fas fa-2x'></i></button> </td>");
                    out.println("</tr>");
                }
            %>
                          </tbody>
                        </table>

                      </div>
          <button name="btnAcao" type="button" class="btn btn-success" data-toggle="modal" data-target="#ModalSubcatego" style="height: 50px; font-size: 15pt;">Cadastrar</button>
      
      </form>
  </div>
        </div>
        
                          <!-- Modal Alterar subcategoria-->
                <div class="modal fade" id="ModalSubCategoria1" tabindex="-1" role="dialog" aria-labelledby="ModalContaLabel" aria-hidden="true">
                  <div class="modal-dialog" role="document">
                    <div class="modal-content">
                      <div class="modal-header">
                        <h5 class="modal-title" id="ModalContaLabel">Conta Empresarial</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                          <span aria-hidden="true">&times;</span>
                        </button>
                      </div>

                      <div class="modal-body">

                          <form action="../sModuloCaixa" method="post">     
                              <input type="hidden" name="indice" id="indicesubcategoria1">     
                              <div class="form-group">
                                      <label>Descrição</label>
                                      <input name ="descricao" type="text" class="form-control" id="descricao" placeholder="Descrição da Sub-Categoria">
                                    </div>
                              <div class="form-group">
                                    <select name="opc" id="inputState" class="form-control">
                                          <option selected>Escolha a categoria</option>
                                          <%
                                ArrayList<Categorizacao> listaResultado3 = caixaDao.getCategoria();
                                    for(int i=0; i<listaResultado3.size();i++){
                                out.println("<option value='"+ listaResultado3.get(i).getIdCategorizacao() + "'>" + listaResultado3.get(i).getDescricao()+ "</option>");
                }
            %>
                                      </select>
                                </div>
                                    <button type="button" class="btn btn-danger" data-dismiss="modal">Cancelar</button>
                                    <button name="btnAcao" value="alterarsubcategoria" type="submit" class="btn btn-warning">Alterar</button>
                          </form>
                      </div>
                      <div class="modal-footer">
                       <!-- SE EU QUISER EM BAIXO!-->
                      </div>
                    </div>
                  </div>
                </div>
                          
                          <!-- Modal Alterar categoria-->
                <div class="modal fade" id="ModalCategoria1" tabindex="-1" role="dialog" aria-labelledby="ModalContaLabel" aria-hidden="true">
                  <div class="modal-dialog" role="document">
                    <div class="modal-content">
                      <div class="modal-header">
                        <h5 class="modal-title" id="ModalContaLabel">Conta Empresarial</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                          <span aria-hidden="true">&times;</span>
                        </button>
                      </div>

                      <div class="modal-body">

                          <form action="../sModuloCaixa" method="post">     
                              <input type="hidden" name="indice" id="indice_categoria1">     
                              <div class="form-group">
                                      <label>Descrição</label>
                                      <input name ="descricao" type="text" class="form-control" id="descricao" placeholder="Descrição da Categoria">
                                    </div>
                                    <button type="button" class="btn btn-danger" data-dismiss="modal">Cancelar</button>
                                    <button name="btnAcao" value="alterarcategoria" type="submit" class="btn btn-warning">Alterar</button>
                          </form>
                      </div>
                      <div class="modal-footer">
                       <!-- SE EU QUISER EM BAIXO!-->
                      </div>
                    </div>
                  </div>
                </div>
                          
        <!-- Modal Alterar conta-->
                <div class="modal fade" id="ModalConta1" tabindex="-1" role="dialog" aria-labelledby="ModalContaLabel" aria-hidden="true">
                  <div class="modal-dialog" role="document">
                    <div class="modal-content">
                      <div class="modal-header">
                        <h5 class="modal-title" id="ModalContaLabel">Conta Empresarial</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                          <span aria-hidden="true">&times;</span>
                        </button>
                      </div>

                      <div class="modal-body">

                          <form action="../sModuloCaixa" method="post">     
                              <input type="hidden" name="indice" id="indice_conta1">     
                              <div class="form-group">
                                      <label>Descrição</label>
                                      <input name ="descricao" type="text" class="form-control" id="descricao" placeholder="Descrição da Conta Empresarial">
                                    </div>
                                    <div class="form-group">
                                      <label>Saldo Inicial</label>
                                      <input name ="valor" type="number" class="form-control" id="valor" placeholder="Saldo inicial da Conta Empresarial">
                                    </div>
                                    <button type="button" class="btn btn-danger" data-dismiss="modal">Cancelar</button>
                                    <button name="btnAcao" value="alterarconta" type="submit" class="btn btn-warning">Alterar</button>
                          </form>
                      </div>
                      <div class="modal-footer">
                       <!-- SE EU QUISER EM BAIXO!-->
                      </div>
                    </div>
                  </div>
                </div>
        
                        <!-- Modal Inserir conta-->
                <div class="modal fade" id="ModalConta" tabindex="-1" role="dialog" aria-labelledby="ModalContaLabel" aria-hidden="true">
                  <div class="modal-dialog" role="document">
                    <div class="modal-content">
                      <div class="modal-header">
                        <h5 class="modal-title" id="ModalContaLabel">Conta Empresarial</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                          <span aria-hidden="true">&times;</span>
                        </button>
                      </div>

                      <div class="modal-body">

                          <form action="../sModuloCaixa" method="post"> 
                                    <div class="form-group">
                                      <label>Descrição</label>
                                      <input name ="descricao" type="text" class="form-control" id="exampleInputEmail1" placeholder="Descrição da Conta Empresarial">
                                    </div>
                                    <div class="form-group">
                                      <label>Saldo Inicial</label>
                                      <input name ="valor" type="number" class="form-control" id="exampleInputEmail1" placeholder="Descrição da Conta Empresarial">
                                    </div>
                                    <button type="button" class="btn btn-danger" data-dismiss="modal">Cancelar</button>
                                    <button name="btnAcao" value="inserirConta" type="submit" class="btn btn-primary">Confirmar</button>
                          </form>




                      </div>
                      <div class="modal-footer">
                       <!-- SE EU QUISER EM BAIXO!-->

                      </div>
                    </div>
                  </div>
                </div>
        
         <!-- Modal Inserir catego -->
                <div class="modal fade" id="ModalCatego" tabindex="-1" role="dialog" aria-labelledby="ModalCategoLabel" aria-hidden="true">
                  <div class="modal-dialog" role="document">
                    <div class="modal-content">
                      <div class="modal-header">
                        <h5 class="modal-title" id="ModalCategoLabel">Conta Empresarial</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                          <span aria-hidden="true">&times;</span>
                        </button>
                      </div>

                      <div class="modal-body">

                          <form action="../sModuloCaixa" method="post"> 
                                    <div class="form-group">
                                      <label>Descrição</label>
                                      <input name ="descricao" type="text" class="form-control" id="exampleInputEmail1" placeholder="Descrição da categoria">
                                    </div>
                                    <button type="button" class="btn btn-danger" data-dismiss="modal">Cancelar</button>
                                    <button name="btnAcao" value="inserirCatego" type="submit" class="btn btn-primary">Confirmar</button>
                          </form>




                      </div>
                      <div class="modal-footer">
                       <!-- SE EU QUISER EM BAIXO!-->

                      </div>
                    </div>
                  </div>
                </div>
          <!-- Modal Inserir subcatego -->
                <div class="modal fade" id="ModalSubcatego" tabindex="-1" role="dialog" aria-labelledby="ModalSubcategoLabel" aria-hidden="true">
                  <div class="modal-dialog" role="document">
                    <div class="modal-content">
                      <div class="modal-header">
                        <h5 class="modal-title" id="ModalSubcategoLabel">Subcategorização</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                          <span aria-hidden="true">&times;</span>
                        </button>
                      </div>

                      <div class="modal-body">

                          <form action="../sModuloCaixa" method="post"> 
                                    <div class="form-group">
                                      <label>Descrição</label>
                                      <input name ="descricao" type="text" class="form-control" id="exampleInputEmail1" placeholder="Descrição da subcategoria">
                                    </div>
                                <div class="form-group">
                                    <select name="opc" id="inputState" class="form-control">
                                          <option selected>Escolha a categoria</option>
                                          <%
                                ArrayList<Categorizacao> listaResultado4 = caixaDao.getCategoria();
                                    for(int i=0; i<listaResultado4.size();i++){
                                out.println("<option value='"+ listaResultado4.get(i).getIdCategorizacao() + "'>" + listaResultado4.get(i).getDescricao()+ "</option>");
                }
            %>
                                      </select>
                                    
                                </div>
                                    <button type="button" class="btn btn-danger" data-dismiss="modal">Cancelar</button>
                                    <button name="btnAcao" value="inserirSubCatego" type="submit" class="btn btn-primary">Confirmar</button>
                          </form>




                      </div>
                      <div class="modal-footer">
                       <!-- SE EU QUISER EM BAIXO!-->

                      </div>
                    </div>
                  </div>
                </div>
        
<div id="popup"></div></div>



    

</html>
