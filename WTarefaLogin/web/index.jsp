<%-- 
    Document   : index
    Created on : 03/09/2018, 15:59:31
    Author     : jjeti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String sLogin = (String)session.getAttribute("login");
    if(sLogin != null){
        response.sendRedirect("sistema.jsp");
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

    </head>
    <body style="background-color: #cdcdcd">
    <div class="container content">
        <div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">Login</h3>
            </div>
            <form class="form-horizontal" action="Valida" method="post">
                <div class="box-body">
                  <div class="form-group">
                    <label for="login" class="col-sm-2 control-label">Login: </label>

                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="login" name="login" placeholder="Login" required="required">
                    </div>
                  </div>
                  <div class="form-group">
                    <label for="senha" class="col-sm-2 control-label">Senha: </label>

                    <div class="col-sm-10">
                      <input type="password" class="form-control" id="senha" name="senha" placeholder="Senha" required="required">
                    </div>
                  </div>
                </div>
                <div class="box-footer">
                  <button type="reset" class="btn btn-danger">Cancelar</button>
                  <button type="submit" class="btn btn-info pull-right">Confirmar</button>
                </div>
            </form>
        </div>
    </div>

    <%
    if(request.getParameter("usuario") != null && Integer.parseInt(request.getParameter("usuario")) == 1){
        %>
        <script>
        $(function(){
          $('#modal').modal('show');  
        })
        </script>     
        <%
        }
    %>
        
    <div class="modal fade" id="modal" tabindex="-1" role="dialog">
      <div class='modal-dialog' role='document' style='height: 50%; width:50%;'>
            <div class='modal-content'>
              <div class='modal-header' style="background-color: #357ca5; color:#fff">
                    <button type='button' class='close' data-dismiss='modal' aria-label='Close'><span aria-hidden='true'>&times;</span></button>
                    <h4 class='modal-title'>Alerta</h4>
              </div>
              <div class='modal-body' style='max-height: 80vh; overflow: auto'>
                <table class="table table-bordered table-hover">
                  <tr>
                      <td class="text-center">Usuário ou senha inválidos!</td>
                  </tr>
                  <tr>
                      <td colspan="2"><button type="button" class="btn btn-danger" data-dismiss="modal">Fechar</button></td>
                  </tr>
                </table>
              </div>
            </div>
      </div>
    </div>           
        
        
    </body>
</html>
