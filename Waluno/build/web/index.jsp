<%-- 
    Document   : index
    Created on : 12/09/2018, 20:36:31
    Author     : logon
--%>

<%@page import="Dao.AlunoDAO"%>
<%@page import="Basic.Aluno"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Banco de Dados</title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
    </head>
    
    <body>
        <%
            Aluno aluno = new Aluno();
            //aluno = (Aluno)request.getParameter("pesq");
            
            /*if(ret!=null){
                out.println(ret);
            }*/
        %>
        <form name="form1" action="sAluno" method="post">
            <table border="1">
                <tr>
                    <td>RGM:</td>
                    <td><input type="text" name="rgm"></td>
                </tr>
                <tr>
                    <td>Nome:</td>
                    <td><input type="text" name="nome"></td>
                </tr>
                <tr>
                    <td>Nota 1:</td>
                    <td><input type="text" name="nota1"></td>
                </tr>
                <tr>
                    <td>Nota 2:</td>
                    <td><input type="text" name="nota2"></td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input name="btnAcao" type="submit" value="Gravar">&nbsp;
                        <input name="btnAcao" type="submit" value="Alterar">&nbsp;
                        <input name="btnAcao" type="submit" value="Excluir">&nbsp;
                        <input name="btnAcao" type="submit" value="Pesquisar">
                    </td>
                </tr>
            </table>
        </form>
        <br>
        <table border="1">
            <tr>
                <td>RGM</td>
                <td>Nome</td>
                <td>Nota 1</td>
                <td>Nota 2</td>
            </tr>
            <%
                AlunoDAO alunoDao = new AlunoDAO();
                ArrayList<Aluno> listaResultado = alunoDao.getAlunos();
                for(int i=0; i<listaResultado.size();i++){
                    out.println("<tr>");
                    out.println("<td>" + listaResultado.get(i).getRgm() + "</td>");
                    out.println("<td>" + listaResultado.get(i).getNome() + "</td>");
                    out.println("<td>" + listaResultado.get(i).getNota1() + "</td>");
                    out.println("<td>" + listaResultado.get(i).getNota2()+ "</td>");
                    out.println("</tr>");
                }
            %>
        
        </table>
        <%
            String ret = request.getParameter("resp");
            if(ret!=null){
                out.println(ret);
            }
        %>
    </body>
</html>
