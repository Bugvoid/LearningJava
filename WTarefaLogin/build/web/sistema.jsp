<%-- 
    Document   : index
    Created on : 16/09/2018, 15:59:31
    Author     : jjetiago
--%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Negocio.Global"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String sLogin = (String)session.getAttribute("login");
    if(sLogin == null){
        response.sendRedirect("index.jsp");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tarefa</title>
        <link rel="stylesheet" href="bower_components/bootstrap/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="dist/css/AdminLTE.min.css">
        <script src="bower_components/jquery/dist/jquery.min.js"></script>
        <script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
        <script>
            function excluir(indice, tipo){
                if(tipo == 'aluno'){
                    $('#opcao_aluno').val('excluir_aluno');
                    $('#indice_aluno').val(indice);
                    document.frm_aluno.submit();
                }
                else{
                    $('#opcao_disc').val('excluir_disc');
                    $('#indice_disc').val(indice);
                    document.frm_disciplina.submit();
                }
            }
            function gravar(tipo){
                if(tipo == 'aluno'){
                    var aluno = $("#nome_aluno").val();    
                    var apelido = $("#apelido").val();    
                    var idade = $("#idade").val();
                    if(aluno == ""){
                        alert("Favor preencher o nome do aluno");
                        $("#nome_aluno").focus();
                        return false;
                    }
                    else if(apelido == ""){
                        alert("Favor preencher o apelido do aluno");
                        $("#apelido").focus();
                        return false;
                    }
                    else if(idade == ""){
                        alert("Favor preencher a idade do aluno");
                        $("#idade").focus();
                        return false;
                    }
                    else{
                        document.frm_aluno.submit();
                    }
                }
                else{
                    var aluno = $("#nome_disciplina").val();    
                    var professor = $("#professor").val();    
                    if(aluno == ""){
                        alert("Favor preencher o nome da disciplina");
                        $("#nome_disciplina").focus();
                        return false;
                    }
                    else if(apelido == ""){
                        alert("Favor preencher o nome do professor");
                        $("#professor").focus();
                        return false;
                    }
                    else{
                        document.frm_disciplina.submit();
                    }
                }
            }
        </script>
    </head>
    <body style="background-color: #cdcdcd">
    <div class="container content">
        <div class="box box-primary">
            <div class="box-body">
                <div class="col-sm-10">
                    <%
                    Date dataHoraAtual = new Date();
                    String hora = new SimpleDateFormat("H").format(dataHoraAtual);
                    String saudacao = "";
                    if(Integer.parseInt(hora) >= 4 && Integer.parseInt(hora) <= 11){
                        saudacao = "boa dia";
                    }
                    else if(Integer.parseInt(hora) >= 12 && Integer.parseInt(hora) <= 18){
                        saudacao = "boa tarde";
                    }
                    else{
                        saudacao = "boa noite";
                    }
                    out.print("<b>Olá "+sLogin+", "+saudacao+"!</b>");
                    %>
                </div>    
                <div class="col-sm-2">
                    <form name="sair" action="sair" method="post">  
                        <button type="submit" class="btn btn-danger pull-right" name="sair" value="1">Sair</button>
                    </form>
                </div>
                <div style="margin-top:30px">
                    <div class="nav-tabs-custom">
                        <div class="box-header with-border">
                            <h3 class="box-title">ANÁLISE E DESENVOLVIMENTO DE SISTEMA</h3>
                        </div>
                        <ul class="nav nav-tabs">
                            <%  
                            String active1 = "";
                            String active2 = "";
                            if(session.getAttribute("login").equals("aluno")){
                                out.print("<li class='active'><a href='#tab_1-1' data-toggle='tab' aria-expanded='false'>Alunos</a></li>");
                                out.print("<li class=''><a href='#tab_3-2' data-toggle='tab' aria-expanded='false'>Sobre</a></li>");
                                active1 = "active";
                            }
                            else if(session.getAttribute("login").equals("disciplina")){
                                out.print("<li class='active'><a href='#tab_2-2' data-toggle='tab' aria-expanded='false'>Disciplinas</a></li>");
                                out.print("<li class=''><a href='#tab_3-2' data-toggle='tab' aria-expanded='false'>Sobre</a></li>");
                                active2 = "active";
                            }
                            else{
                                out.print("<li class='active'><a href='#tab_1-1' data-toggle='tab' aria-expanded='false'>Alunos</a></li>");
                                out.print("<li class=''><a href='#tab_2-2' data-toggle='tab' aria-expanded='false'>Disciplinas</a></li>");
                                out.print("<li class=''><a href='#tab_3-2' data-toggle='tab' aria-expanded='false'>Sobre</a></li>");
                            }
                            %>
                        </ul>
                        <div class="tab-content">
                          <div class="tab-pane <% out.print(active1); if(session.getAttribute("login").equals("admin")){ out.print("active"); } %>" id="tab_1-1">
                              
                            <div class="row">
                                <div class="col-sm-4">
                                    <form name="frm_aluno" method="post" action="Formulario" onsubmit="gravar('aluno');return false;">
                                        <input type="hidden" name="opcao" id="opcao_aluno" value="aluno">    
                                        <input type="hidden" name="indice" id="indice_aluno">    
                                    <table class="table table-bordered">
                                        <tr>
                                            <th>Alunos</th>
                                        </tr>
                                        <tr>
                                            <th>Nome: <input type="text" placeholder="Nome do Aluno" class="form-control" name="nome_aluno" id="nome_aluno"></th>
                                        </tr>
                                        <tr>
                                            <th>Apelido: <input type="text" placeholder="Apelido do Aluno" class="form-control" name="apelido" id="apelido"></th>
                                        </tr>
                                        <tr>
                                            <th>Idade: <input type="number" placeholder="Infome a idade Aluno" class="form-control" name="idade" id="idade"></th>
                                        </tr>
                                        <tr>
                                            <th><button type="submit" class="btn btn-info" id="btn_gravar">Gravar</button></th>
                                        </tr>
                                    </table>
                                    </form>
                                </div>

                                <div class="col-sm-4">
                                    <table class="table table-bordered">
                                        <tr>
                                            <th colspan="3" class="bg-info">Aluno(s) Gravados</th>
                                        </tr>
                                        
                                        <%
                                        if(Global.alunos.size() > 0){    
                                            for(int ind=0;ind< Global.alunos.size();ind++){
                                                out.print("<tr>"
                                                        + "<td>"+(ind+1)+"</td>"
                                                        + "<td>"+Global.alunos.get(ind).getNome()+"</td>"
                                                        + "<td><button type='button' class='btn btn-danger btn-block' onclick=\"excluir("+ind+", 'aluno')\">Excluir</button></td>"
                                                + "</tr>"); 
                                            }
                                        }
                                        else{
                                            out.print("<tr><td colspan='2'>Nenhum aluno cadastrado!</td></tr>");
                                        }

                                        %>
                                        
                                    </table>
                                </div>
                            </div>
                              
                          </div>
                          <!-- /.tab-pane -->
                          <div class="tab-pane <% out.print(active2); %>" id="tab_2-2">
                            <div class="row">
                                <div class="col-sm-4">
                                    <form name="frm_disciplina" method="post" action="Formulario" onsubmit="gravar('disciplina');return false;">
                                        <input type="hidden" name="opcao" id="opcao_disc" value="disciplina">    
                                        <input type="hidden" name="indice" id="indice_disc">    
                                    <table class="table table-bordered">
                                        <tr>
                                            <th>Disciplinas</th>
                                        </tr>
                                        <tr>
                                            <th>Nome: <input type="text" placeholder="Nome da Disciplina" class="form-control" name="nome_disciplina" id="nome_disciplina"></th>
                                        </tr>
                                        <tr>
                                            <th>Professor Responsável: <input type="text" placeholder="Nome do Professor" class="form-control" name="professor" id="professor"></th>
                                        </tr>
                                        <tr>
                                            <th><button type="submit" class="btn btn-info" id="btn_gravar">Gravar</button></th>
                                        </tr>
                                    </table>
                                    </form>
                                </div>

                                <div class="col-sm-4">
                                    <table class="table table-bordered">
                                        <tr>
                                            <th colspan="3" class="bg-info">Disciplina(s) Gravadas</th>
                                        </tr>
                                        <tr>
                                        <%
                                        if(Global.disciplinas.size() > 0){    
                                            for(int ind=0;ind< Global.disciplinas.size();ind++){
                                                out.print("<tr>"
                                                        + "<td>"+(ind+1)+"</td>"
                                                        + "<td>"+Global.disciplinas.get(ind).getNome()+"</td>"
                                                        + "<td><button type='button' class='btn btn-danger btn-block' onclick=\"excluir("+ind+", 'disciplina')\">Excluir</button></td>"
                                                + "</tr>"); 
                                            }
                                        }
                                        else{
                                            out.print("<tr><td colspan='2'>Nenhuma disciplina cadastrada!</td></tr>");
                                        }

                                        %>
                                        </tr>
                                    </table>
                                </div>
                            </div>
                          </div>
                          

                          <div class="tab-pane" id="tab_3-2">
                            <div class="row">
                                <div class="col-sm-8">
                                    <table class="table table-bordered">
                                        <tr>
                                            <td rowspan="5"><img src="imagens/icone.jpg" width="150px" /></td>
                                            <th>Dados Aluno</th>
                                        </tr>
                                        <tr>
                                            <td><b>Nome:</b> Luan Castro Alves</td>
                                        </tr>
                                        <tr>
                                            <td><b>RGM:</b> 1803654-6</td>
                                        </tr>
                                        <tr>
                                            <td><b>Curso:</b> Analise e Desenvolvimento de Sistemas</td>
                                        </tr>
                                        <tr>
                                            <td><b>Professor da Matéria:</b> Gobbato</td>
                                        </tr>
                                    </table>
                                </div>
                            </div
                          </div>
                          <!-- /.tab-pane -->
                        </div>
                        <!-- /.tab-content -->
                      </div>
                </div> 
            </div> 
    </body>
</html>
